package com.todomvc.pages.objects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.Keys;

import java.util.List;

public class TodosObject extends PageObject {
    @FindBy(how = How.CLASS_NAME, using = "new-todo")
    @CacheLookup
    private WebElement txt_todos;

    @FindBy(how = How.CLASS_NAME, using = "todo")
    private List<WebElement> todo_list;

    @FindBy(how = How.CLASS_NAME, using = "todo-count")
    private WebElement todo_count;

    @FindBy(how = How.LINK_TEXT, using = "Active")
    private WebElement link_active;

    @FindBy(how = How.LINK_TEXT, using = "Completed")
    private WebElement link_completed;

    @FindBy(how = How.CLASS_NAME, using = "clear-completed")
    private WebElement link_clear_completed;

    @FindBy(how = How.CLASS_NAME, using = "toggle-all")
    private WebElement collapse_button;

    public void enterTodosText(String item){
        txt_todos.sendKeys(item);
    }
    public void pressEnterButton(){
        txt_todos.sendKeys(Keys.ENTER);
    }

    public String getTodoElementByIndex(int i) {
        return todo_list.get(i).getText();
    }

    public int getItemCount() {
        return Integer.parseInt(todo_count.findElement(By.tagName("strong")).getText());
    }

    public void clickActiveButton() {
        link_active.click();
    }

    public void clickRemove(String item) {
        for (WebElement element : todo_list) {
            if (element.getText().contains(item)) {
                WebElement button = element.findElement(By.tagName("button"));
                Actions action = new Actions(getDriver());
                action.moveToElement(element).perform();
                button.click();
            }
        }
    }

    public void clickCompleteCheckBox(String item) {
        for (WebElement element : todo_list) {
            if (element.getText().contains(item)) {
                WebElement checkBox = element.findElement(By.tagName("input"));
                checkBox.click();
            }
        }
    }

    public void clickCompletedButton() {
        link_completed.click();
    }

    public int getTodoElementCountByName(String item) {
        int count = 0;
        for (WebElement element : todo_list) {
            if (element.getText().contains(item)) {
                count++;
            }
        }
        return count;
    }

    public void clickClearCompletedButton() {
        link_clear_completed.click();
    }

    public void clickCollapseButton() {
        collapse_button.click();
    }

    public void editTodoItem(String oldItem, String newItem) {
        Actions actions = new Actions(getDriver());
        for (WebElement element : todo_list) {
            if (element.getText().contains(oldItem)) {
                actions.doubleClick(element).perform();
                WebElement inputBox = element.findElement(By.className("edit"));
                inputBox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
                inputBox.sendKeys(newItem);
                inputBox.sendKeys(Keys.ENTER);
            }
        }
    }
}

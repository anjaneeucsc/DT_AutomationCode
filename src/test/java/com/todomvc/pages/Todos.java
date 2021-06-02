package com.todomvc.pages;

import com.todomvc.pages.objects.TodosObject;
import net.thucydides.core.annotations.Step;

public class Todos {

    TodosObject todosObject;

    @Step
    public void openApplication() {
        todosObject.open();
    }

    @Step
    public void enterTodosText(String item){
        todosObject.enterTodosText(item);
    }

    @Step
    public void pressEnterButton(){
        todosObject.pressEnterButton();
    }

    @Step
    public String getTodoElementByIndex(int i){
        return todosObject.getTodoElementByIndex(i);
    }

    @Step
    public int getItemCount() {
        return todosObject.getItemCount();
    }

    public void navigateToSection(String section) {
        if (section.equalsIgnoreCase("Active")) {
            todosObject.clickActiveButton();
        } else if (section.equalsIgnoreCase("Completed")) {
            todosObject.clickCompletedButton();
        }
    }

    public void removeItemFromList(String item) {
        todosObject.clickRemove(item);
    }

    public void completeItem(String item) {
        todosObject.clickCompleteCheckBox(item);
    }

    public int getTodoElementCountByName(String item) {
        return todosObject.getTodoElementCountByName(item);
    }

    public void clickClearCompletedButton() {
        todosObject.clickClearCompletedButton();
    }

    public void clickCollapseButton() {
        todosObject.clickCollapseButton();
    }

    public void editTodoItem(String oldItem, String newItem) {
        todosObject.editTodoItem(oldItem, newItem);
    }
}

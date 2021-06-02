package com.todomvc.stepdefinitions;

import com.todomvc.pages.Todos;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class TodosStepDefinitions {

    @Steps
    Todos todos;

    @Given("User is on the todos page")
    public void userIsOnTheTodosPage() {
        todos.openApplication();
    }

    @When("^input items to todo list$")
    public void inputItemsToTodoList(DataTable table) {
        List<List<String>> rows = table.asLists(String.class);
        for (List<String> row : rows) {
            todos.enterTodosText(row.get(0));
            todos.pressEnterButton();
        }
    }

    @Then("^check items in todo list$")
    public void checkItemsInTodoList(DataTable table) {
        List<List<String>> rows = table.asLists(String.class);
        for(int i=0; i<rows.size(); i++){
            assertThat(todos.getTodoElementByIndex(i)).contains(rows.get(i).get(0));
        }
    }

    @And("check item count is {int}")
    public void checkItemCountIs(int count) {
        assertThat(todos.getItemCount()).isEqualTo(count);
    }

    @When("navigates to Active todo list section")
    public void navigatesToActiveTodoListSection() {
        todos.navigateToSection("Active");
    }

    @When("remove item {string}")
    public void removeItem(String item) {
        todos.removeItemFromList(item);
    }

    @When("complete item {string}")
    public void completeItem(String item) {
        todos.completeItem(item);
    }

    @When("navigates to Completed todo list section")
    public void navigatesToCompletedTodoListSection() {
        todos.navigateToSection("Completed");
    }


    @Then("check item {string} exists")
    public void checkItemExists(String item) {
        assertThat(todos.getTodoElementCountByName(item)).isEqualTo(1);
    }

    @And("click Clear Completed button")
    public void clickClearCompletedButton() {
        todos.clickClearCompletedButton();
    }

    @Then("check item {string} does not exists")
    public void checkItemDoesNotExists(String item) {
        assertThat(todos.getTodoElementCountByName(item)).isEqualTo(0);
    }

    @And("click collapse button")
    public void clickCollapseButton() {
        todos.clickCollapseButton();
    }

    @And("edit {string} to {string}")
    public void editTo(String oldItem, String newItem) {
        todos.editTodoItem(oldItem, newItem);
    }
}

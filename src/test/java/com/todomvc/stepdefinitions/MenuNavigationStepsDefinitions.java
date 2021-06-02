package com.todomvc.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.todomvc.pages.HomePage;
import com.todomvc.pages.ShowDetailPage;
import com.todomvc.pages.TopTvShowsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MenuNavigationStepsDefinitions {

	@Steps
	HomePage homePage;

	@Steps
	TopTvShowsPage topTvShowsPage;

	@Steps
	ShowDetailPage showDetailPage;

	@Given("User is on the imdb home page")
	public void user_is_on_the_imdb_home_page() {
		homePage.openApplication();
		System.out.println("Navigate to the web");
	}

	@When("User clicks on Menu")
	public void user_navigates_to_Menu() throws InterruptedException {
		homePage.clickMenu();
	}

	@When("User clicks on {string}")
	public void user_navigates_to(String menuItem) {
		homePage.clickMenuItem(menuItem);
	}

	@Then("User is on {string} page")
	public void user_is_on_most_popular_shows_page(String pageTitle) {
		assertEquals(pageTitle, topTvShowsPage.getPageTitle());
	}

	@When("User enters {string} in search box")
	public void user_enters_show_name_in_search_box(String searchKey) {
		homePage.enterSearchText(searchKey);
	}

	@When("User clicks on {string} in suggested section")
	public void user_clicks_on_suggested_show(String suggestedTitle) {
		homePage.clickSearchSuggestion(suggestedTitle);
	}

	@Then("User lands on {string} detail page")
	public void user_lands_on_show_detail_page(String showTitle) {
		assertNotNull(showDetailPage.getShowTitle());
		assertEquals(showTitle, showDetailPage.getShowTitle());
		assertTrue(showDetailPage.getShowRating() >= 0);
		assertTrue(showDetailPage.getShowRatingCount() >= 0);
	}
}

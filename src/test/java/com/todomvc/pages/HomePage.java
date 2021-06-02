package com.todomvc.pages;

import com.todomvc.pages.objects.HomePageObject;

import net.thucydides.core.annotations.Step;

public class HomePage {

	HomePageObject homePageObject;

	/**
	 * Use this method to open imdb home page
	 */
	@Step
	public void openApplication() {
		homePageObject.open();
	}

	/**
	 * Use this method to click Menu, displayed next to IMDb logo on left corner,
	 */
	@Step
	public void clickMenu() {
		homePageObject.clickMenu();
	}

	/**
	 * Use this method to click menu item from menu items list
	 * 
	 * @param menuItem Name of the menu item that will be triggered
	 *
	 */
	@Step
	public void clickMenuItem(String menuItem) {
		homePageObject.clickMenuItem(menuItem);
	}

	/**
	 * Use this method to enter text to search box
	 * 
	 * @param searchKey Text of the search box
	 *
	 */
	@Step
	public void enterSearchText(String searchKey) {
		homePageObject.enterSearchText(searchKey);
	}

	/**
	 * Use this method to click item in search suggestion list
	 * 
	 * @param suggestedShow Text of the show that need to be clicked
	 *
	 */
	@Step
	public void clickSearchSuggestion(String suggestedShow) {
		homePageObject.clickSearchSuggestion(suggestedShow);
	}

	/**
	 * Use this method to click sign In button
	 */
	@Step
	public void clickSignInButton() {
		homePageObject.clickSignInButton();
	}

}

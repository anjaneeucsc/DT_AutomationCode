package com.todomvc.pages.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class HomePageObject extends PageObject {
	
	@FindBy(how = How.ID, using = "imdbHeader-navDrawerOpen--desktop")
	@CacheLookup
    private WebElement menuButton;
	
//	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Top Rated Shows")
//	@CacheLookup
//	private WebElement topRatedShowsLink;
	
	@FindBy(how = How.ID, using = "suggestion-search")
	@CacheLookup
	private WebElement searchBox;
	
	@FindBy(how = How.CLASS_NAME, using = "react-autosuggest__suggestions-list")
	private WebElement suggestionsList;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"imdbHeader\"]/div[2]/div[5]/a/div")
	@CacheLookup
	private WebElement signInButton;

	/**
	 * Use this method to click Menu, displayed next to IMDb logo on left corner,
	 */
	public void clickMenu() {
		menuButton.click();
	}

	/**
	 * Use this method to click menu item from menu items list
	 * 
	 * @param menuItem Name of the menu item that will be triggered
	 *
	 */
	public void clickMenuItem(String menuItem) {
		waitForAnyTextToAppear(menuItem);
		$(By.partialLinkText(menuItem)).click();
	}

	/**
	 * Use this method to enter text to search box
	 * 
	 * @param searchKey Text of the search box
	 *
	 */
	public void enterSearchText(String searchKey) {
		searchBox.sendKeys(searchKey);
	}

	/**
	 * Use this method to click item in search suggestion list
	 * 
	 * @param suggestedShow Text of the show that need to be clicked
	 *
	 */
	public void clickSearchSuggestion(String suggestedShow) {
		waitForRenderedElements(By.className("react-autosuggest__suggestions-list"));
		$(By.partialLinkText(suggestedShow)).click();
	}
	/**
	 * Use this method to click sign In button
	 */
	public void clickSignInButton() {
		signInButton.click();
	}
}

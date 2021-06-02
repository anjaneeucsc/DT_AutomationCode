package com.todomvc.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.PageObject;

public class ShowDetailObject extends PageObject {

	@FindBy(how = How.XPATH, using = "//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/h1")
	@CacheLookup
	private WebElement showTitle;

	@FindBy(how = How.XPATH, using = "//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[1]/div[1]/div[1]/strong/span")
	@CacheLookup
	private WebElement showRating;

	@FindBy(how = How.XPATH, using = "//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[1]/div[1]/a/span")
	@CacheLookup
	private WebElement showRatingCount;

	/**
	 * Use this method to get title of the show/movie
	 */
	public String getShowTitle() {
		return showTitle.getText();
	}

	/**
	 * Use this method to get rating value in show/movie details page
	 */
	public float getShowRating() {
		return Float.parseFloat(showRating.getText());
	}

	/**
	 * Use this method to get rating count of show/movie from show details page
	 */
	public int getShowRatingCount() {
		return Integer.parseInt(showRatingCount.getText().replace(",", ""));
	}

}

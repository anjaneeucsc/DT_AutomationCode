package com.todomvc.pages;

import com.todomvc.pages.objects.ShowDetailObject;

import net.thucydides.core.annotations.Step;

public class ShowDetailPage {

	ShowDetailObject showDetailObject;

	/**
	 * Use this method to get page title of show details page
	 */
	@Step
	public String getPageTitle() {
		return showDetailObject.getTitle();
	}

	/**
	 * Use this method to get title of the show/movie
	 */
	@Step
	public String getShowTitle() {
		return showDetailObject.getShowTitle();
	}

	/**
	 * Use this method to get rating value in show/movie details page
	 */
	@Step
	public float getShowRating() {
		return showDetailObject.getShowRating();
	}

	/**
	 * Use this method to get rating count of show/movie from show details page
	 */
	@Step
	public int getShowRatingCount() {
		return showDetailObject.getShowRatingCount();
	}

}

package com.todomvc.pages;

import com.todomvc.pages.objects.TopTvShowsObject;

import net.thucydides.core.annotations.Step;

public class TopTvShowsPage {

	TopTvShowsObject topTvShowsObject;
	
	/**
	 * Use this method to get page title of top rated TV shows page 
	 */
	@Step
	public String getPageTitle() {
		return topTvShowsObject.getTitle();
	}
}

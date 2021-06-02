package com.todomvc.pages;

import com.todomvc.pages.objects.RegistrationObject;

import net.thucydides.core.annotations.Step;

public class RegistrationPage {

	RegistrationObject registrationObject;

	/**
	 * Use this method to get title of the registration page.
	 */
	@Step
	public String getPageTitle() {
		return registrationObject.getTitle();
	}

	/**
	 * Use this method to click create new account button in registration form
	 */
	@Step
	public void clickCreateNewAccountButton() {
		registrationObject.clickCreateNewAccountButton();
	}

}

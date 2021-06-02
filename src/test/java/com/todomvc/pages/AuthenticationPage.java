package com.todomvc.pages;

import com.todomvc.pages.objects.AuthenticationObject;

import net.thucydides.core.annotations.Step;

public class AuthenticationPage {
	
	AuthenticationObject authenticationObject;

	 /**
	   * Use this method to get title of the authentication page
	   */
	@Step
	public String getTitle() {
		return authenticationObject.getTitle();
	}

	/**
	 * Use this method to enter value to captcha text box.
	 *
	 * @param characters will be filled in to captcha text box.
	 *
	 */
	@Step
	public void enterCaptcha(String characters) {
		authenticationObject.enterCaptcha(characters);
	}

	/**
	 * Use this method to click continue button in captcha page
	 */
	@Step
	public void clickContinueButton() {
		authenticationObject.clickContinueButton();
	}

}

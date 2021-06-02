package com.todomvc.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.PageObject;

public class RegistrationObject extends PageObject {

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Create a New Account")
	@CacheLookup
	private WebElement createNewAccountButton;

	/**
	 * Use this method to click 'create New account button' in registration form.
	 */
	public void clickCreateNewAccountButton() {
		createNewAccountButton.click();
	}

}

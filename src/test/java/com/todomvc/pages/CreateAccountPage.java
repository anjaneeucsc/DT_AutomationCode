package com.todomvc.pages;

import com.todomvc.pages.objects.CreateNewAccountObject;

import net.thucydides.core.annotations.Step;

public class CreateAccountPage {
	
	CreateNewAccountObject createNewAccountObject;

	/**
	 * Use this method to get title of the create new account page 
	 */	
	@Step
	public String getTitle() {
		return createNewAccountObject.getTitle();
	}

	/**
	 * Use this method to enter name in registration form
	 *
	 * @param name will be filled in name text box.
	 */	
	@Step
	public void enterName(String name) {
		createNewAccountObject.enterName(name);
	}

	/**
	 * Use this method to enter email in registration form 
	 *
	 * @param email will be filled in email text box.
	 */	
	@Step
	public void enterEmail(String email) {
		createNewAccountObject.enterEmail(email);
	}

	/**
	 * Use this method to enter password in registration form 
	 *
	 * @param password will be filled in password text box.
	 */	
	@Step
	public void enterPassword(String password) {
		createNewAccountObject.enterPassword(password);
	}

	/**
	 * Use this method to reenter password in registration form 
	 *
	 * @param password will be filled in re enter password text box.
	 */	
	@Step
	public void reEnterPassword(String password) {
		createNewAccountObject.reEnterPassword(password);
	}

	/**
	 * Use this method to click create button in registration form
	 */	
	@Step
	public void clickCreateButton() {
		createNewAccountObject.clickCreateButton();
	}

}

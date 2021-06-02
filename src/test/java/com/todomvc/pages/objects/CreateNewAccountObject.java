package com.todomvc.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.PageObject;

public class CreateNewAccountObject extends PageObject{
	
	@FindBy(how = How.ID, using = "ap_customer_name")
	@CacheLookup
	private WebElement txt_name;
	
	@FindBy(how = How.ID, using = "ap_email")
	@CacheLookup
	private WebElement txt_email;
	
	@FindBy(how = How.ID, using = "ap_password")
	@CacheLookup
	private WebElement txt_password;
	
	@FindBy(how = How.ID, using = "ap_password_check")
	@CacheLookup
	private WebElement txt_password_check;	
	
	@FindBy(how = How.ID, using = "continue")
	@CacheLookup
	private WebElement btn_create;
	

	/**
	 * Use this method to enter name in registration form
	 *
	 * @param name will be filled in name text box.
	 */	
	public void enterName(String name) {
		txt_name.sendKeys(name);
	}

	/**
	 * Use this method to enter email in registration form 
	 *
	 * @param email will be filled in email text box.
	 */	
	public void enterEmail(String email) {
		txt_email.sendKeys(email);
	}

	/**
	 * Use this method to enter password in registration form 
	 *
	 * @param password will be filled in password text box.
	 */	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	/**
	 * Use this method to reenter password in registration form 
	 *
	 * @param password will be filled in re enter password text box.
	 */	
	public void reEnterPassword(String password) {
		txt_password_check.sendKeys(password);
	}


	/**
	 * Use this method to click create button in registration form
	 */	
	public void clickCreateButton() {
		btn_create.click();
	}

}

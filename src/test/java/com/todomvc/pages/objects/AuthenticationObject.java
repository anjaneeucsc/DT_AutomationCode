package com.todomvc.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.PageObject;

public class AuthenticationObject extends PageObject {

	@FindBy(how = How.NAME, using = "cvf_captcha_input")
	@CacheLookup
	private WebElement txt_captcha;

	@FindBy(how = How.NAME, using = "cvf_captcha_captcha_action")
	@CacheLookup
	private WebElement btn_continue;

	/**
	 * Use this method to enter value to captcha text box.
	 *
	 * @param characters will be filled in to captcha text box.
	 *
	 */
	public void enterCaptcha(String characters) {
		txt_captcha.sendKeys(characters);
	}

	/**
	 * Use this method to click continue button in captcha page
	 */
	public void clickContinueButton() {
		btn_continue.click();
	}

}

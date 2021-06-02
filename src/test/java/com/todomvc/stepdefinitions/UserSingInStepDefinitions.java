package com.todomvc.stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.Map;

import com.todomvc.pages.AuthenticationPage;
import com.todomvc.pages.CreateAccountPage;
import com.todomvc.pages.HomePage;
import com.todomvc.pages.RegistrationPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserSingInStepDefinitions {

	@Steps
	HomePage homePage;

	@Steps
	RegistrationPage registrationPage;

	@Steps
	CreateAccountPage createAccountPage;

	@Steps
	AuthenticationPage authenticationPage;

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		homePage.clickSignInButton();
	}

	@Then("User is on the registration page")
	public void user_is_on_the_registration_page() {
		assertEquals("Sign in with IMDb - IMDb", registrationPage.getPageTitle());
	}

	@When("User clicks on Create a New Account button")
	public void user_clicks_on_Create_a_New_Account_button() {
		registrationPage.clickCreateNewAccountButton();
	}

	@Then("User is on the Create Account page")
	public void user_is_on_the_Create_Account_page() {
		assertEquals("IMDb Registration", createAccountPage.getTitle());
	}

	@Then("^User create account with following details$")
	public void user_create_account_with_following_details(Map<String, String> dataMap) {
		String name = dataMap.get("name");
		String email = dataMap.get("email");
		String password = dataMap.get("password");

		Date date = new Date();
		long timeMilli = date.getTime();
		email = email.split("@")[0] + timeMilli + "@" + email.split("@")[1];	
		System.out.println(email);

		createAccountPage.enterName(name);
		createAccountPage.enterEmail(email);
		createAccountPage.enterPassword(password);
		createAccountPage.reEnterPassword(password);
		createAccountPage.clickCreateButton();
	}

	@Then("User is on the captcha page")
	public void user_is_on_the_captcha_page() {
		assertEquals("Authentication required", authenticationPage.getTitle());
	}

	@When("User enters captcha string")
	public void user_enters_captcha_string() {
		authenticationPage.enterCaptcha("123465");
	}

	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() {
		authenticationPage.clickContinueButton();
	}

}

package com.cucu.Steps;

import com.basescucu.bases.BasePage;
import com.basescucu.bases.BaseTest;

import cucu.pagefactory.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps extends BaseTest{
	BasePage page;
	PageFactory pageFactory = new PageFactory();

	@Given("User launch the application")
	public void user_launch_the_application() {
	    launchapplication();
	}
	@Given("User is on {string}")
	public void user_is_on(String pageName) {
		page = pageFactory.initialize(pageName);

	}
	@Then("User verify the title {string}")
	public void user_verify_the_title(String Expected) {
		String Actual = GetTitle();
		compareText(Actual, Expected);
	}
	@Then("User enter into the textbox {string} {string}")
	public void user_enter_into_the_textbox(String logicalName, String value) {
	page.enterIntoTextbox(logicalName, value);
	}

	
	@Then("User click on the button {string}")
	public void user_click_on_the_button(String logicalName) {
	   page.ClickonButton(logicalName);
	}

}

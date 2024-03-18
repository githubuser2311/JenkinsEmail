package com.cucu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.basescucu.bases.BasePage;
import com.basescucu.bases.BaseTest;


public class LoginPage extends BasePage{
	static WebDriver driver;
	public  LoginPage() {
		super(driver=BaseTest.getDriver());
		addObject("username",By.id("username"));
		addObject("password", By.id("password"));
		addObject("loginButton", By.id("Login"));
	}
}

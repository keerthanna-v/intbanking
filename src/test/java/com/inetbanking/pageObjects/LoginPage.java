package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	
	@FindBy(xpath = "//input[@name='uid']")
	WebElement txtUsername;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@name=\"btnLogin\"]")
	WebElement btnLogin;
	
	@FindBy(xpath = "//input[@name=\"btnReset\"]")
	WebElement btnReset;
	
	
	public void setUsername(String name)
	{
		txtUsername.sendKeys(name);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	
}

package com.shopingstore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.shopingstore.base.JavaBase;
import com.shopingstore.base.ValidateMethods;
import com.shopingstore.util.PropertyReader;

public class LoginPage {
	public WebDriver driver;

	@FindBy(xpath="//span[text()='My Account']")
	 WebElement MyAccout;
	
	@FindBy(xpath="//a[text()='Login']")
	 WebElement LoginLink;
	
	@FindBy(id="input-email")
	 WebElement emailField;
	                                                          
	@FindBy(id="input-password")
	 WebElement passwordField;
	
	@FindBy(xpath="//input[@value='Login']")
	 WebElement loginButton;
	
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	 WebElement warningMessage;
	
	@FindBy(xpath="//a[text()='Logout']")
	 WebElement logoutButton;
	
	@FindBy(xpath="//h2[text()='My Account']")
	 WebElement MyAccountText;
	                                             
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}
	
	public void openUrl(String url) {
		driver.get(url);
	}

	public void click_On_MyAccount() {

		JavaBase.clickOn(MyAccout, 0);

	}
	
	public void click_On_LoginLink() {

		JavaBase.clickOn(LoginLink,0);

	}
	
	public void user_enter_email(String value) {
		JavaBase.sendkeys(emailField, 0, value);
	}

	public void user_enter_password(String value) {
		JavaBase.sendkeys(passwordField, 0, value);
	}


	public void click_On_LoginButton() {

		JavaBase.clickOn(loginButton, 0);

	}
	
	public void user_enterInvalid_Email() {
		JavaBase.sendkeys(emailField, 0, PropertyReader.getDataProperty("EmailInvalid"));
	}
	
	public void user_enter_Invalidpassword(String value) {
		JavaBase.sendkeys(passwordField, 0, value);
	}


	 public void User_Validate_WarningMesage() {
		 JavaBase.mouseHover(warningMessage, 0);
	 }
	 
	 public void User_Click_OnLogoutButton() {
		 JavaBase.clickOn(logoutButton, 30);
	 }
	 
	 public void User_Validate_MyAccountText() {
		 JavaBase.mouseHover(MyAccountText, 30);
	 }
}

package com.shopingstore.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shopingstore.base.JavaBase;
import com.shopingstore.base.ValidateMethods;
import com.shopingstore.util.PropertyReader;

public class RegistrationPage {
	public WebDriver driver;

	@FindBy(xpath = "//span[text()='My Account']")
	WebElement MyAccout;

	@FindBy(xpath = "//a[text()='Register']")
	WebElement RegisterLink;

	@FindBy(id = "input-firstname")
	WebElement firstNameField;

	@FindBy(id = "input-lastname")
	WebElement lastNameField;

	@FindBy(id = "input-email")
	WebElement emailField;

	@FindBy(id = "input-telephone")
	WebElement telephoneField;

	@FindBy(id = "input-password")
	WebElement passwordField;

	@FindBy(id = "input-confirm")
	WebElement passwordConfirmField;

	@FindBy(name = "agree")
	WebElement privacyPolicyOption;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continueButton;

	@FindBy(xpath = "//input[@name='newsletter'][@value='1']")
	WebElement YesNewsletterOption;

	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	WebElement warningMessage;

	@FindBy(xpath = "//input[@id='input-firstname']/following-sibling::div")
	WebElement firstNameWarning;

	@FindBy(xpath = "//input[@id='input-lastname']/following-sibling::div")
	WebElement lastNameWaring;

	@FindBy(xpath = "//input[@id='input-email']/following-sibling::div")
	WebElement emailWarning;

	@FindBy(xpath = "//input[@id='input-telephone']/following-sibling::div")
	WebElement telephoneWarning;

	@FindBy(xpath = "//input[@id='input-password']/following-sibling::div")
	WebElement passwordWarning;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logoutButton;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;

	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public void click_OnMyAccountTab() {
		JavaBase.clickOn(MyAccout, 0);

	}

	public void click_OnRegisterLink() {
		JavaBase.clickOn(RegisterLink, 0);

	}

	public void Enter_FirstName(String value) {
		JavaBase.sendkeys(firstNameField, 0, value);

	}

	public void Enter_LastName(String value) {
		JavaBase.sendkeys(lastNameField, 0, value);

	}

	public void Enter_Email(String value) {
		JavaBase.sendkeys(emailField, 0, value);

	}

	public void Enter_TelephoneNumber(String value) {
		JavaBase.sendkeys(telephoneField, 0, value);

	}

	public void Enter_Password(String value) {
		JavaBase.sendkeys(passwordField, 0, value);

	}

	public void Enter_confrimPassword(String value) {
		JavaBase.sendkeys(passwordConfirmField, 0, value);

	}

	public void Select_PrivacyPolicy() {
		JavaBase.clickOn(privacyPolicyOption, 0);

	}

	public void clickOn_ContinueButton() {

		JavaBase.clickOn(continueButton, 0);

	}

	public void validate_ConfirmationPageUrl() {
		ValidateMethods.validateUrl(PropertyReader.getDataProperty("confirmUrl"));

	}

	public void userclickOn_accountlink() {
		JavaBase.clickOn(MyAccout, 0);
	}

	public void clickOn_LogoutButton() {
		JavaBase.clickOn(logoutButton, 20);
	}

	public void AgainclickAccout() {
		JavaBase.clickOn(MyAccout, 0);
	}

	public void AgainClickonRegister() {
		JavaBase.clickOn(RegisterLink, 0);
	}

	public void clickonContinuebtn() {
		JavaBase.clickOn(continueButton, 0);
	}

	public void Validate_WarningMessage() {
		JavaBase.mouseHover(warningMessage, 0);
	}

	public void MouseOverOn_firstNameField_validation() {
		JavaBase.mouseHover(firstNameWarning, 0);
	}

	public void Validate_LastNameField_validation() {
		JavaBase.mouseHover(lastNameWaring, 0);
	}

	public void Validate_EmailField_validation() {
		JavaBase.mouseHover(emailWarning, 0);
	}

	public void Validate_TelephoneField_validation() {
		JavaBase.mouseHover(telephoneWarning, 0);
	}

	public void Validate_PasswordField_validation() {
		JavaBase.mouseHover(passwordWarning, 0);
	}

}

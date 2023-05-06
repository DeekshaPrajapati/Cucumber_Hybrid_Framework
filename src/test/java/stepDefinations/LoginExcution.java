package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.shopingstore.base.JavaBase;
import com.shopingstore.base.ValidateMethods;
import com.shopingstore.pages.LoginPage;
import com.shopingstore.pages.RegistrationPage;
import com.shopingstore.util.PropertyReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

///////////////////////////////// User login with Valid credientials ////////////////////////////

public class LoginExcution {

	public WebDriver driver;
	public LoginPage objLoginPage;

	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
		driver = JavaBase.getDriver();

		objLoginPage = PageFactory.initElements(driver, LoginPage.class);
		objLoginPage.openUrl(PropertyReader.getConfigProperty("url"));
		objLoginPage.click_On_MyAccount();
		objLoginPage.click_On_LoginLink();
	}

	@When("User enters valid email address {string} into email field")
	public void user_enters_valid_email_address_into_email_field(String username) {
		objLoginPage.user_enter_email(username);
	}

	@When("User enters valid password {string} into password field")
	public void user_enters_valid_password_into_password_field(String password) {
		objLoginPage.user_enter_password(password);
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		objLoginPage.click_On_LoginButton();
		objLoginPage.click_On_MyAccount();
		objLoginPage.User_Click_OnLogoutButton();

	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		objLoginPage.User_Validate_MyAccountText();
	}

	@When("User enters invalid email address into email field")
	public void user_enters_invalid_email_address_into_email_field() {

		objLoginPage.user_enterInvalid_Email();
	}

	@When("User enters invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String InvalidPassword) {
		objLoginPage.user_enter_Invalidpassword(InvalidPassword);
	}

	@Then("User should get a proper warning message about credentials mismatch")
	public void user_should_get_a_proper_warning_message_about_credentials_mismatch() {
		objLoginPage.User_Validate_WarningMesage();
	}

}

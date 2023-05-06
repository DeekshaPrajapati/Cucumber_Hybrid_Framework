package stepDefinations;

import org.junit.Assert;

//import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.shopingstore.base.JavaBase;
import com.shopingstore.base.ValidateMethods;
import com.shopingstore.pages.RegistrationPage;
import com.shopingstore.util.PropertyReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

///////////////////////////////// User Create a new account //////////////////////////////////

public class RegistrationExcution {
	public WebDriver driver;
	public static RegistrationPage registrationPageObj;

	@Given("User open browzer")
	public void user_open_browzer() {
		driver = JavaBase.getDriver();

	}

	@And("User open url")
	public void user_open_url() {
		registrationPageObj = PageFactory.initElements(driver, RegistrationPage.class);
		registrationPageObj.openUrl(PropertyReader.getConfigProperty("url"));

	}

	@Then("validate url open")
	public void validate_url_open() {

		ValidateMethods.validateUrl(PropertyReader.getDataProperty("mainUrl"));// testng asstion

	}

	@Then("User click on maxmize icon")
	public void user_click_on_maxmize_icon() {
		JavaBase.maxmizeWindow();
	}

//	@Then("validate a home page url")
//	public void validate_a_home_page_url() {
//	    ValidateMethods.validateUrl( PropertyReader.getDataProperty("homepageurl"));
//	}

	@Then("User click on Account button")
	public void user_click_on_account_button() {
		registrationPageObj.click_OnMyAccountTab();
	}

	@Then("User click on Register button")
	public void user_click_on_register_button() {
		registrationPageObj.click_OnRegisterLink();
	}

	@Then("Validate User navigates to Register Account page")
	public void validate_user_navigates_to_register_account_page() {

	}

	@When("User enters the first name {string}")
	public void user_enters_the_first_name(String name) {
		registrationPageObj.Enter_FirstName(name);
	}

	@When("User enter the last name {string}")
	public void user_enter_the_last_name(String lastname) {
		registrationPageObj.Enter_LastName(lastname);
	}

	@When("User enter email {string}")
	public void user_enter_email(String email) {
		registrationPageObj.Enter_Email(email);
	}

	@When("User enter telephone number {string}")
	public void user_enter_telephone_number(String telephoneno) {
		registrationPageObj.Enter_TelephoneNumber(telephoneno);
	}

	@When("User enter password {string}")
	public void user_enter_password(String passw) {
		registrationPageObj.Enter_Password(passw);
	}

	@When("User enter confirm password {string}")
	public void user_enter_confirm_password(String confirmpassword) {
		registrationPageObj.Enter_confrimPassword(confirmpassword);
	}

	@When("User selects Privacy Policy")
	public void user_selects_privacy_policy() {
		registrationPageObj.Select_PrivacyPolicy();
	}

	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
		registrationPageObj.clickOn_ContinueButton();
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
		// ValidateMethods.validateUrl(
		// PropertyReader.getDataProperty("accoutcreatesuccess"));
	}

	@When("User click on account link button")
	public void user_click_on_account_link_button() {
		registrationPageObj.userclickOn_accountlink();
	}

	@When("User click on Logout button")
	public void user_click_on_logout_button() {
		registrationPageObj.clickOn_LogoutButton();
	}

	@When("user again click on a account button")
	public void user_again_click_on_a_account_button() {
		registrationPageObj.AgainclickAccout();
	}

	@When("user click on a register link")
	public void user_click_on_a_register_link() {
		registrationPageObj.AgainClickonRegister();
	}

	@When("User dont enter any details into fields")
	public void user_dont_enter_any_details_into_fields() {
		registrationPageObj.Enter_FirstName("");
		registrationPageObj.Enter_LastName("");
		registrationPageObj.Enter_Email("");
		registrationPageObj.Enter_TelephoneNumber("");
		registrationPageObj.Enter_Password("");
		registrationPageObj.Enter_confrimPassword("");
	}

	@When("User click  continue button")
	public void user_click_continue_button() {
		registrationPageObj.clickOn_ContinueButton();
	}

	@Then("User should get proper warning messages for every mandatory field")
	public void user_should_get_proper_warning_messages_for_every_mandatory_field() {
		registrationPageObj.Validate_WarningMessage();
		registrationPageObj.MouseOverOn_firstNameField_validation();
		registrationPageObj.Validate_LastNameField_validation();
		registrationPageObj.Validate_EmailField_validation();
		registrationPageObj.Validate_TelephoneField_validation();
		registrationPageObj.Validate_PasswordField_validation();
	}

}
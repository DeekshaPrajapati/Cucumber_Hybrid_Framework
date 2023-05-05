package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.shopingstore.base.JavaBase;
import com.shopingstore.pages.RegistrationPage;
import com.shopingstore.pages.SearchPage;
import com.shopingstore.util.PropertyReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchExecution {

	public WebDriver driver;
	public static SearchPage searchpageObj;
	
	
	@Given("User opens the Application")
	public void user_opens_the_application() {
		driver = JavaBase.getDriver();
		searchpageObj = PageFactory.initElements(driver, SearchPage.class);
		searchpageObj.openUrl(PropertyReader.getConfigProperty("url"));
	}

	@When("User enters valid product {string} into Search box field")
	public void user_enters_valid_product_into_search_box_field(String Validproduct) {
	    searchpageObj.User_SearchAProduct(Validproduct);
	}

	@When("User clicks on Search button")
	public void user_clicks_on_search_button() {
	    searchpageObj.User_ClickOn_SearchButton();
	}

	@Then("User should get valid product displayed in search results")
	public void user_should_get_valid_product_displayed_in_search_results() {
	    searchpageObj.Verify_SearchText();
	}

	@When("User enters invalid product {string} into Search box field")
	public void user_enters_invalid_product_into_search_box_field(String InValidproduct) {
	    searchpageObj.User_SearchAInvalidProduct(InValidproduct);
	}

	@Then("User should get a message about no product matching")
	public void user_should_get_a_message_about_no_product_matching() {
	    searchpageObj.Verify_ProductNotMatchText();
	}

	@When("User dont enter any product name into Search box field")
	public void user_dont_enter_any_product_name_into_search_box_field() {
	    searchpageObj.User_SearchAProduct("");
	}

}

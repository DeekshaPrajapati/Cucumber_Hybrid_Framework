package com.shopingstore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.shopingstore.base.JavaBase;
import com.shopingstore.base.ValidateMethods;

public class SearchPage {

	
	public WebDriver driver;
	
	
	@FindBy(xpath="//input[@class='form-control input-lg']")
	 WebElement SearchBox;
	
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	 WebElement SearchButton;
	
	@FindBy(xpath="//h1[text()='Search - HP']")
	 WebElement VerifySearchText;
	
	@FindBy(xpath="//p[text()='There is no product that matches the search criteria.']")
	 WebElement ProductNotMatchText;
	
	
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;

	}

	public void openUrl(String url) {
		driver.get(url);
	}
	
	public void User_SearchAProduct(String value) {
		JavaBase.sendkeys(SearchBox, 0, value);
	}
	
	public void User_ClickOn_SearchButton() {
		JavaBase.clickOn(SearchButton, 0);
	}
	
	public void Verify_SearchText() {
		JavaBase.mouseHover(VerifySearchText, 0);
	}
	
	public void User_SearchAInvalidProduct(String value) {
		JavaBase.sendkeys(SearchBox, 0, value);
	}
	
	public void Verify_ProductNotMatchText() {
		JavaBase.mouseHover(ProductNotMatchText, 0);
	}

}

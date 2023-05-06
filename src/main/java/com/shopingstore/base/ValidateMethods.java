package com.shopingstore.base;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import com.shopingstore.util.PropertyReader;

public class ValidateMethods extends JavaBase {
	public static SoftAssert soft;

	public static void validateUrl(String expectUrl) {
		String saveCurrentUrl = driver.getCurrentUrl();
		System.out.println("print expectUrl ----> " + expectUrl);
		soft = new SoftAssert();
		soft.assertEquals(saveCurrentUrl, expectUrl);
		soft.assertAll();

	}

	public static void validateTitle(String expectTitle) {
		String savetitle = driver.getTitle();
		System.out.println(savetitle);
		soft.assertEquals(savetitle, expectTitle, "actual and expect title is not matched");
		soft.assertAll();
	}

	// logo , text ,button ,link id display ,login wingdow
	// you need just pass xpath .
	public static void validateElement_IsDisplay(WebElement anyElement, int timeout) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(anyElement));
		boolean savereturn_trureOrFalse = anyElement.isDisplayed();
		System.out.println("prin----->" + savereturn_trureOrFalse);
		soft.assertTrue(anyElement.isDisplayed());
		soft.assertAll();

	}

	public static void validate_buttonEnable(WebElement elementbutton) {
		boolean trueOrFalse = elementbutton.isEnabled();
		System.out.println(trueOrFalse);
		soft.assertTrue(elementbutton.isEnabled());
		soft.assertAll();
	}

	// checkbox radio button
	public static void validate_elementSelectable(WebElement checkkBox) {
		Boolean trueOrFalse = checkkBox.isSelected();
		System.out.println(trueOrFalse);
		soft.assertTrue(checkkBox.isSelected());
		soft.assertAll();
	}

	public void curretnUrl() {
		driver.getCurrentUrl();
	}

}

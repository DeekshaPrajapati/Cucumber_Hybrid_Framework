package com.shopingstore.base;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.shopingstore.util.PropertyReader;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class JavaBase {
	public static WebDriver driver;
	public static String browzersave;
	public static JavascriptExecutor js;

	// singleton
	public static WebDriver getDriver() {
		if (driver == null) {
			browzersave = PropertyReader.getConfigProperty("BrowserName"); // calling browzename

			if (browzersave.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}

			else if (browzersave.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}

			else if (browzersave.equalsIgnoreCase("Safari")) {
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
			}

			else {

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			return driver;
		} else {
			return driver;
		}
	}

	// window maxmize
	public static void maxmizeWindow() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	// send keys
	public static void sendkeys(WebElement element, int timeout, String value) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(element));
		element_withWait.sendKeys(value);

	}

	// click
	public static void clickOn(WebElement element, int timeout) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.elementToBeClickable(element));
		element_withWait.click();

	}

	public static void clickOn1(WebElement element, int timeout) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(element));
		element_withWait.click();

	}

	// click with java excuter
	public static void clickBy_javaExcutu(WebElement element, int timeout) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element_withWait);
	}

	public static void scrollDown(int position) {
		js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,200)");
		js.executeScript("window.scrollBy(0,'" + position + "')");

	}

	// Dropdown without method visible , value ,visibletext -----
	public static void selectOptionFromDropdown(WebElement element, int timeout, String value) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(element));
		Select dropdown = new Select(element_withWait);
		List<WebElement> allOptions = dropdown.getOptions();

		for (WebElement options : allOptions) {
			if (options.getText().equals(value)) {
				options.click();
				break;
			}
		}
	}

	// mouse hoever
	public static void mouseHover(WebElement element, int timeout) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(element));
		Actions actObj = new Actions(driver);
		actObj.moveToElement(element_withWait).perform();// for mouse hover action

	}

	// Random Class
	public static void random_EmailId(WebElement element, int timeout, String value) {
		WebElement element_withWait = new WebDriverWait(driver, timeout)
				.until(ExpectedConditions.visibilityOf(element));
		Random randomgenerator = new Random();
		int randomInt = randomgenerator.nextInt(1000);
		System.out.println("Random value are" + randomInt);
		// driver.findElement(
		// By.xpath("//input[@name='EmailId']")).sendKeys(PropertyReader.getDataProperty("email")+randomInt+"@gmail.com");
		element_withWait.sendKeys(randomInt + value);
	}

}
// end class

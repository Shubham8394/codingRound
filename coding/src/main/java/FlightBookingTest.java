package main.java;

import com.sun.javafx.PlatformUtil;

import main.utils.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FlightBookingTest extends BaseClass {

	@Test
	public void testThatResultsAppearForAOneWayJourney() {

		// Selecting One Way option and providing the departure location
		operation.clickOnObject(OR.oneWayRadioButton);
		operation.setText(OR.fromTextBox, "Bangalore");

		// wait for the auto complete options to appear for the origin
		wait.until(ExpectedConditions
				.visibilityOfAllElements(driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"))));
		List<WebElement> originOptions = driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));
		operation.clickOnObject(originOptions.get(0));

		// Providing the Arrival location
		operation.setText(OR.toTextBox, "Delhi");

		// wait for the auto complete options to appear for the destination
		wait.until(ExpectedConditions
				.visibilityOfAllElements(driver.findElement(By.id("ui-id-2")).findElements(By.tagName("li"))));

		// select the first item from the destination auto complete list
		List<WebElement> destinationOptions = driver.findElement(By.id("ui-id-2")).findElements(By.tagName("li"));
		operation.clickOnObject(destinationOptions.get(0));

		// Selecting the date of departure
		operation.clickOnObject(OR.datePickerLink);

		// all fields filled in. Now click on search
		operation.clickOnObject(OR.searchFlightsButton);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("searchSummary")));
		// verify that result appears for the provided journey search
		Assert.assertTrue(operation.isElementPresent(By.className("searchSummary")));

	}

}

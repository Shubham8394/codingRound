package main.java;

import com.sun.javafx.PlatformUtil;

import main.utils.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends BaseClass {

	@Test
	public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

		// Clicking on Your Trips links and after that click on Sign In Button
		operation.clickOnObject(OR.yourTripsLink);
		operation.clickOnObject(OR.signInButton);

		// Wait for window to open for providing the Sign In details
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("modal_window"));
		operation.switchToDefaultContent();
		operation.switchToFrame("modal_window");

		// Click on Sign In Button without providing any sign in details
		operation.clickOnObject(OR.signInUserButton);

		// Fetch the error message and validate it
		String errors1 = operation.getText(OR.errorMessageText);
		Assert.assertTrue(errors1.contains("There were errors in your submission"));
	}

}

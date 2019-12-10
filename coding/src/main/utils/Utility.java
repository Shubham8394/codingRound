package main.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseClass {

	// To find element on the Page
	public WebElement findElement(By elementName) {
		WebElement ele = null;

		try {
			ele = driver.findElement(elementName);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return ele;
	}

	// To click on an element
	public void clickOnObject(WebElement elementName) {
		try {
			elementName.click();

		} catch (Exception ex) {
			ex.getMessage();
		}
	}

	// To enter text in a TextBox
	public void setText(WebElement elementName, String value) {
		try {
			elementName.clear();
			elementName.sendKeys(value);

		} catch (Exception ex) {
			ex.getMessage();
		}
	}

	// To fetch the text from an element
	public String getText(WebElement elementName) {
		String text = null;
		try {
			text = elementName.getText();

		} catch (Exception ex) {
			ex.getMessage();
		}
		return text;
	}

	// To check the presence of an element
	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	// To wait for an element for a specific amount of time
	public void waitFor(int durationInMilliSeconds) {
		try {
			Thread.sleep(durationInMilliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File | Settings | File Templates.
		}
	}

	// To switch to the default window
	public void switchToDefaultContent() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// To switch to the specified frame by passing id or name of frame
	public void switchToFrame(String frameName) {
		try {
			driver.switchTo().frame(frameName);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// To select a value from dropdown
	public void selectFromDropdown(WebElement elementName, String Text) {
		try {
			new Select(elementName).selectByVisibleText(Text);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

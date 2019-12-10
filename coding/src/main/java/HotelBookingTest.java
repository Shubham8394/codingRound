package main.java;

import com.sun.javafx.PlatformUtil;

import main.utils.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HotelBookingTest extends BaseClass {

    @Test
    public void shouldBeAbleToSearchForHotels() throws Exception {
        
    	// Click on Hotels link
        operation.clickOnObject(OR.hotelLink);

        // Enter the Locality details
        operation.setText(OR.localityTextBox, "Indiranagar, Bangalore");
        
        // Enter the Room details
        operation.selectFromDropdown(OR.travellerSelection, "1 room, 2 adults");
        
        // Click on Search button
        operation.clickOnObject(OR.searchButton);

    }

}

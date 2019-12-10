package main.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectRepository {
	
	@FindBy(linkText = "Your trips")
	public WebElement yourTripsLink;
	
	@FindBy(id = "SignIn")
	public WebElement signInButton;
	
	@FindBy(id = "signInButton")
	public WebElement signInUserButton;
	
	@FindBy(id = "errors1")
	public WebElement errorMessageText;
	
	@FindBy(id = "OneWay")
	public WebElement oneWayRadioButton;
	
	@FindBy(id = "FromTag")
	public WebElement fromTextBox;
	
	@FindBy(id = "ToTag")
	public WebElement toTextBox;
	
	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")
	public WebElement datePickerLink;
	
	@FindBy(id = "SearchBtn")
	public WebElement searchFlightsButton;
	
	@FindBy(linkText = "Hotels")
    public WebElement hotelLink;

    @FindBy(id = "Tags")
    public WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    public WebElement searchButton;

    @FindBy(id = "travellersOnhome")
    public WebElement travellerSelection;

}

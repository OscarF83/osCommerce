package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmation {
	
private WebDriver driver;
	
	//Localizadores para la Screen ProductDescription
	@FindBy(how = How.XPATH,using = "//*[@id=\"tdb5\"]/span")
    WebElement ButtonPayNow;
	
	// Constructor
	public OrderConfirmation(WebDriver driver) {
       	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	// Método que realiza un click sobre el botón "Pay Now"
	public void payNow(){
        ButtonPayNow.click();
    }

}

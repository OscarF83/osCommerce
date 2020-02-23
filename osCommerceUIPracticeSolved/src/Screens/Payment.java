package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	private WebDriver driver;
	
	//Localizadores para la Screen ProductDescription
	@FindBy(how = How.XPATH,using = "//*[@id=\"bodyContent\"]/form/div/div[4]/table[6]/tbody/tr/td[2]/input")
    WebElement ButtonCashOnDelivery;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"tdb6\"]/span[2]")
    WebElement ButtonContinue2;
	
	// Constructor
	public Payment(WebDriver driver) {
       	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	// Método que realiza un click sobre el radio button "Cash on delivery"
	public void cashOnDelivery(){
        ButtonCashOnDelivery.click();
    }
	
	// Método que realiza un click sobre el botón "Continue"
	public void pressContinue2(){
        ButtonContinue2.click();
    }

}

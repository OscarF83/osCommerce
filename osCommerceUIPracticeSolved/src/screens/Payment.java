package screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	//Localizadores para la Screen ProductDescription
	@FindBy(how = How.XPATH,using = "//*[@id=\"bodyContent\"]/form/div/div[4]/table[6]/tbody/tr/td[2]/input")
    WebElement buttonCashOnDelivery;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"tdb6\"]/span[2]")
    WebElement buttonContinue2;
	
	// Constructor
	public Payment(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
	
	// Método que realiza un click sobre el radio button "Cash on delivery"
	public void cashOnDelivery(){
        buttonCashOnDelivery.click();
    }
	
	// Método que realiza un click sobre el botón "Continue"
	public void pressContinue2(){
        buttonContinue2.click();
    }

}

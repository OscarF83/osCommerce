package screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmation {
	
	//Localizadores para la Screen ProductDescription
	@FindBy(how = How.XPATH,using = "//*[@id=\"tdb5\"]/span")
    WebElement buttonPayNow;
	
	// Constructor
	public OrderConfirmation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
	
	// Método que realiza un click sobre el botón "Pay Now"
	public void payNow(){
        buttonPayNow.click();
    }

}

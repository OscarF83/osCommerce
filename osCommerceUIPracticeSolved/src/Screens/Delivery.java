package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Delivery {

	private WebDriver driver;
	
	//Localizadores para la Screen ProductDescription
	@FindBy(how = How.XPATH,using = "//*[@id=\"tdb6\"]/span[2]")
    WebElement ButtonContinue;
	
	//Constructor
	public Delivery(WebDriver driver) {
       	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	// Método que realiza un click sobre el botón "Continue"
	public void pressContinue(){
        ButtonContinue.click();
    }
	
}

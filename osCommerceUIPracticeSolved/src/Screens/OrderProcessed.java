package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrderProcessed {
	
private WebDriver driver;
	
	//Localizadores para la Screen ProductDescription
	@FindBy(how = How.XPATH,using = "//*[@id=\"bodyContent\"]/h1")
    WebElement TittleConfirmation;
	
	// Constructor
	public OrderProcessed(WebDriver driver) {
       	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	// Método que lee el valor que contiene el título de la página
	public String checkOrderProcessed(){
        return TittleConfirmation.getText();
    }

}

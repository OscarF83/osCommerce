package screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrderProcessed {
	
	//Localizadores para la Screen ProductDescription
	@FindBy(how = How.XPATH,using = "//*[@id=\"bodyContent\"]/h1")
    WebElement tittleConfirmation;
	
	// Constructor
	public OrderProcessed(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
	
	// Método que lee el valor que contiene el título de la página
	public String checkOrderProcessed(){
        return tittleConfirmation.getText();
    }

}

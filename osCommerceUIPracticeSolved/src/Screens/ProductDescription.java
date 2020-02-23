package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductDescription {

	private WebDriver driver;
	
	//Localizadores para la Screen ProductDescription
	@FindBy(how = How.XPATH,using = "//*[@id=\"tdb4\"]/span[2]")
    WebElement ButtonAddToCart;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"tdb5\"]/span[2]")
    WebElement ButtonReviews;
	
	//Constructor
	public ProductDescription(WebDriver driver) {
       	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	// Método que realiza un click sobre el botón "Add to Cart"
	public void addToCart(){
        ButtonAddToCart.click();
    }
	// Método que realiza un click sobre el botón "Reviews"
	public void reviews(){
        ButtonReviews.click();
    }
	
}

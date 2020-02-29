package screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductDescription {

	
	//Localizadores para la Screen ProductDescription
	@FindBy(how = How.XPATH,using = "//*[@id=\"tdb4\"]/span[2]")
    WebElement buttonAddToCart;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"tdb5\"]/span[2]")
    WebElement buttonReviews;
	
	//Constructor
	public ProductDescription(WebDriver driver) {
		PageFactory.initElements(driver, this);
    }
	
	// Método que realiza un click sobre el botón "Add to Cart"
	public void addToCart(){
        buttonAddToCart.click();
    }
	// Método que realiza un click sobre el botón "Reviews"
	public void reviews(){
        buttonReviews.click();
    }
	
}

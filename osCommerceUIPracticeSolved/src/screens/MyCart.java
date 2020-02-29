package screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyCart {
	
	//Localizadores para la Screen ProductDescription
	@FindBy(how = How.XPATH,using = "//*[@id=\"bodyContent\"]/form/div/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[2]/input[1]")
    WebElement cartQuantity;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"tdb4\"]/span[2]")
    WebElement buttonUpdate;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"tdb5\"]/span[2]")
    WebElement buttonCheckout;
	
	//Constructor
	public MyCart(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
	
	// Método que primero borra y después escribe el valor de la variable quantity en el textbox de entrada "CartQuantity"
	public void changeQuantity(String quantity){
		cartQuantity.clear();
		cartQuantity.sendKeys(quantity);
    }
	
	// Método que realiza un click sobre el botón "Update"
	public void update(){
        buttonUpdate.click();
    }
	
	// Método que realiza un click sobre el botón "Checkout"
	public void checkout(){
        buttonCheckout.click();
    }
	
	// Método que lee el valor que contiene el textbox "CartQuantity"
	public String quantityRead(){
        return cartQuantity.getAttribute("value");
    }

}

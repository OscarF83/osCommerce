package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyCart {
	
private WebDriver driver;
	
	//Localizadores para la Screen ProductDescription
	@FindBy(how = How.XPATH,using = "//*[@id=\"bodyContent\"]/form/div/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[2]/input[1]")
    WebElement CartQuantity;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"tdb4\"]/span[2]")
    WebElement ButtonUpdate;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"tdb5\"]/span[2]")
    WebElement ButtonCheckout;
	
	//Constructor
	public MyCart(WebDriver driver) {
       	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	// Método que primero borra y después escribe el valor de la variable quantity en el textbox de entrada "CartQuantity"
	public void changeQuantity(String quantity){
		CartQuantity.clear();
		CartQuantity.sendKeys(quantity);
    }
	
	// Método que realiza un click sobre el botón "Update"
	public void update(){
        ButtonUpdate.click();
    }
	
	// Método que realiza un click sobre el botón "Checkout"
	public void checkout(){
        ButtonCheckout.click();
    }
	
	// Método que lee el valor que contiene el textbox "CartQuantity"
	public String quantityRead(){
        return CartQuantity.getAttribute("value");
    }

}

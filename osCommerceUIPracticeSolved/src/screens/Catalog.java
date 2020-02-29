package screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Catalog {
	
	//Localizadores para la Screen Catalog
	
	//Posición en pantalla:
	
	/* 
	 * producto1	producto2	producto3
	 * producto4	producto5	producto6
	 * producto7	producto8	producto9
	*/
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"bodyContent\"]/div/div[2]/table/tbody/tr[1]/td[1]/a[1]/img")
    WebElement producto1;
	@FindBy(how = How.XPATH,using = "//*[@id=\"bodyContent\"]/div/div[2]/table/tbody/tr[1]/td[2]/a[1]/img")
    WebElement producto2;
	@FindBy(how = How.XPATH,using = "//*[@id=\"bodyContent\"]/div/div[2]/table/tbody/tr[1]/td[3]/a[1]/img")
    WebElement producto3;
	@FindBy(how = How.XPATH,using = "//*[@id=\"bodyContent\"]/div/div[2]/table/tbody/tr[2]/td[1]/a[1]/img")
    WebElement producto4;
	@FindBy(how = How.XPATH,using = "//*[@id=\"bodyContent\"]/div/div[2]/table/tbody/tr[2]/td[2]/a[1]/img")
    WebElement producto5;
	@FindBy(how = How.XPATH,using = "//*[@id=\"bodyContent\"]/div/div[2]/table/tbody/tr[2]/td[3]/a[1]/img")
    WebElement producto6;
	@FindBy(how = How.XPATH,using = "//*[@id=\"bodyContent\"]/div/div[2]/table/tbody/tr[3]/td[1]/a[1]/img")
    WebElement producto7;
	@FindBy(how = How.XPATH,using = "//*[@id=\"bodyContent\"]/div/div[2]/table/tbody/tr[3]/td[2]/a[1]/img")
    WebElement producto8;
	@FindBy(how = How.XPATH,using = "//*[@id=\"bodyContent\"]/div/div[2]/table/tbody/tr[3]/td[3]/a[1]/img")
    WebElement producto9;
	
	// Constructor
	public Catalog(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
	
	// Método que realiza un click sobre el producto seleccionado
	public void clickOnElement(WebElement element){
		element.click();
    }
	
	/* 
	 * Este método llama al método clickOnElement pasándole el Webelement/producto seleccionado según el
	 * String numberElement recibido
	*/
	public void clickProduct(String numberElement){
		
		switch (numberElement) {
           case "1":  
        	   clickOnElement(producto1);
               break;
           case "2":  
        	   clickOnElement(producto2);
               break;
           case "3":  
        	   clickOnElement(producto3);
               break;
           case "4":  
        	   clickOnElement(producto4);
               break;
           case "5":  
        	   clickOnElement(producto5);
               break;
           case "6":  
        	   clickOnElement(producto6);
               break;
           case "7":  
        	   clickOnElement(producto7);
               break;
           case "8":  
        	   clickOnElement(producto8);
               break;
           case "9":  
        	   clickOnElement(producto9);
               break;
           default:
        	   clickOnElement(producto1);
          
       }
       
    }
	
}

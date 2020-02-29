package screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login {
		
		//Localizadores para la Screen ProductDescription
		@FindBy(how = How.XPATH,using = "//*[@id=\"loginModules\"]/div[1]/div/form/table/tbody/tr[1]/td[2]/input")
	    WebElement emailField;
		
		@FindBy(how = How.XPATH,using = "//*[@id=\"loginModules\"]/div[1]/div/form/table/tbody/tr[2]/td[2]/input")
	    WebElement passwordField;
		
		@FindBy(how = How.XPATH,using = "//*[@id=\"tdb1\"]/span[2]")
	    WebElement buttonSignIn;
		
		//Constructor
		public Login(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }
		
		// Método que primero borra y después escribe el valor de la variable email en el textbox de entrada "Username"
		public void fillEmail(String email){
			emailField.clear();
			emailField.sendKeys(email);
	    }
		
		// Método que primero borra y después escribe el valor de la variable password en el textbox de entrada "Password"
		public void fillPassword(String password){
			passwordField.clear();
			passwordField.sendKeys(password);
	    }
		
		// Método que realiza un click sobre el botón "Sign In"
		public void signIn(){
	        buttonSignIn.click();
	    }

}

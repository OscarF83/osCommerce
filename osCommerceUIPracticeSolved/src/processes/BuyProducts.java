package processes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;

import screens.Catalog;
import screens.Delivery;
import screens.Login;
import screens.MyCart;
import screens.OrderConfirmation;
import screens.OrderProcessed;
import screens.Payment;
import screens.ProductDescription;

public class BuyProducts {
	
	private WebDriver driver;
	
	public BuyProducts(WebDriver driver) {
       	this.driver = driver;
    }
	
	
	public void orderProduct(String nameProduct, String quantity, String username, String password) throws InterruptedException{
		
		/* Creamos el objeto catalog el cual tiene el método clickProduct que selecciona un producto en función del valor 
		del String nameProduct */
		Catalog catalog = new Catalog(driver);
		catalog.clickProduct(nameProduct);
		
		// Creamos el objeto productDescription el cual tiene el método addToCart que añade el producto seleccionado al carrito
		ProductDescription productDescription = new ProductDescription(driver);
		productDescription.addToCart();
		
		/* Creamos el objeto mycart el cual tiene los métodos changeQuantity con el que cambiar la cantidad de producto elegido,
		update para actualizar el carrito, quantityRead para leer la cantidad de producto seleccionada y checkout para pulsar
		el botón checkout */
		MyCart myCart = new MyCart(driver);
		myCart.changeQuantity(quantity);
		myCart.update();
		assertEquals(quantity, myCart.quantityRead()); // Comprobamos que la cantidad de producto seleccionada es correcta
		myCart.checkout();
		
		/* Creamos el objeto login el cual tiene los métodos fillEmail que introduce el username, fillPassword que introduce
		el password y signIn que realiza click sobre el botón Sign In */
		Login login = new Login(driver);
		login.fillEmail(username);
		login.fillPassword(password);
		login.signIn();
		
		// Creamos el objeto delivery el cual tiene el método preesContinue que realiza click sobre el botón Continue
		Delivery delivery = new Delivery(driver);
		delivery.pressContinue();
		
		/* Creamos el objeto payment el cual tiene los métodos cashOnDelivery que selecciona el método de pago Cash on Delivery 
		y pressContinue3 que realiza un click sobre el botón Continue */
		Payment payment = new Payment(driver);
		payment.cashOnDelivery();
		payment.pressContinue2();
		
		// Creamos el objeto orderConfirmation el cual tiene el método payNow que realiza click sobre el botón Pay Now 
		OrderConfirmation orderConfirmation = new OrderConfirmation(driver);
		orderConfirmation.payNow();
		
		/* Creamos el objeto orderProcessed el cual tiene el método checkOrderProcessed que lee el título de la página
		y comprobamos que hemos llegado al final del proceso de compra comprobando el título de la página "Your Order Has Been Processed" */
		OrderProcessed orderProcessed = new OrderProcessed(driver);
		assertEquals("Your Order Has Been Processed!", orderProcessed.checkOrderProcessed());
		Thread.sleep(1000);		
	}
}

package TestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import Processes.BuyProducts;
import Screens.Catalog;
import Screens.Delivery;
import Screens.Login;
import Screens.MyCart;
import Screens.OrderConfirmation;
import Screens.OrderProcessed;
import Screens.Payment;
import Screens.ProductDescription;



class TestCase2{
	
	private static WebDriver driver;
	private static ChromeDriverService service;
	
	private Process process;
	
	private String productReference;
	private String quantity;
	
	public static void createAndStartService() throws IOException {
		service = new ChromeDriverService.Builder()
		      .usingDriverExecutable(new File("chromedriver"))
		      .usingAnyFreePort()
		      .build();
		  service.start();
	}
	
	public static void createDriver() {
		 driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
		
	}
	
	public static void quitDriver() {
		  driver.quit();
	}
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		createAndStartService();	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {}

	@BeforeEach
	void setUp() throws Exception {
		createDriver();
		driver.manage().window().maximize();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		quitDriver();
	}

	
	@Test
	void test1() throws InterruptedException {
				
		//Open URL
		driver.get("https://demo.oscommerce.com/");
		Thread.sleep(1000);
		
		/* Creamos el objeto buyProducts el cual tiene el método orderProduct que realiza un proceso de compra completo
		   
		   orderProduct(String númeroProducto, String cantidad, String nombreDeUsuario, String contraseña)
		   
		   Los productos han sido numerados por su posición en pantalla
		   
		   1	2	3
		   4	5	6
		   7	8	9
		   
		   1. Samsung Galaxy Tab
		   2. Hewlett Packard Laserjet 1100Xi
		   3. Microsoft IntelliMouse Explorer
		   4. Microsoft Internet Keyboard PS/2
		   5. Disciplies: Scared Lands
		   6. The Wheel of Time
		   7. Unreal Tournament
		   8. Swat 3: Close Quarters Battle
		   9. Beloved 
		*/
		BuyProducts buyProducts = new BuyProducts(driver);
		buyProducts.orderProduct("9","3","o_prueba@hotmail.com","12345");
		
		
	}

}




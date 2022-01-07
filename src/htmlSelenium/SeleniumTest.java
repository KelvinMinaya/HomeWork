/*package htmlSelenium;

public class SeleniumTest {

	package practice;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.ClickAction;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class TestNg {

		WebDriver driver;

		@BeforeTest
		public void setUp() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Beloved\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://costco.com");
			Thread.sleep(4000);
		}

		@Test
		public void loginButtonTest() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"header_sign_in\"]")).click();
			Thread.sleep(4000);

		}

		@AfterTest
		public void tearUp() {
			driver.quit();
		}

	}

	
	
	
	
	
	
	
}*/

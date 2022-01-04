package htmlSelenium;

public class Hw14 {

	package practice;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class SeleniumTest2 {
		WebDriver driver;

		@BeforeTest
		public void setUp() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Beloved\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://costco.com");
			Thread.sleep(1000);
		}
		
		@Test(enabled = true, priority = 1)
		public void logoTest() {
			boolean elementDisplayed = driver.findElement(By.xpath("//*[@id=\"header-widget\"]/div[2]/div/div/div/div[2]/div/div[1]/a/img")).isDisplayed();
			System.out.println(elementDisplayed);
		}
		
		@Test(enabled = true, priority = 2)
		public void newUserRegistrationTest() {
			boolean elementDisplayed = driver.findElement(By.xpath("//*[@id=\"header_order_and_returns\"]")).isEnabled();
			System.out.println(elementDisplayed);
		}
		
		@Test(enabled = true,priority = 3)
		public void checkBoxTest() {
			boolean elementSelected=driver.findElement(By.xpath("//*[@id=\"locator_search_filters_desktop\"]/div[1]/div[1]/label/span")).isSelected();
		 System.out.println(elementSelected);
		}
		
		@Test(enabled = true,priority = 3)
		public void userIdTest() throws InterruptedException {
			driver.findElement(By.id("search-field")).sendKeys("LG C1");
			Thread.sleep(4000);
			driver.findElement(By.cssSelector("i.co-search-thin")).click();
			Thread.sleep(4000);
			System.out.println("Current URL is:"+driver.getCurrentUrl());
			String title = driver.getTitle();
			System.out.println(title);
			
			
			
		}
		
		
		
		@AfterTest
		public void tearUp() {
			driver.quit();
		}
		
		
		
		
	}

	
	
	
	
	
	
}

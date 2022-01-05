package htmlSelenium;

public class Hw15 {
	package practice;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Hw15 {
		WebDriver driver;

		@BeforeTest
		public void setUp() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Beloved\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.target.com");
			Thread.sleep(1000);

		}

		@Test(enabled = true, priority = 1)
		public void navigationTest() {
			driver.navigate().to("https://www.jetblue.com");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			System.out.println(driver.getCurrentUrl());
			System.out.println();

		}

		@Test(enabled = false, priority = 2)
		public void searchFieldTest() throws InterruptedException {
			driver.get("https://www.ebay.com");
			driver.findElement(By.id("gh-ac")).sendKeys("Iraqi Dinar", Keys.ENTER);
			Thread.sleep(3000);
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.id("gh-ac")).clear();
			driver.findElement(By.id("gh-ac")).sendKeys("Lap Top");
			Thread.sleep(3000);

		}

		@Test(enabled = true, priority = 3)
		public void maximizeWindowTest() throws InterruptedException {
			driver.manage().window().maximize();
			driver.get("https://zillow.com");
			Thread.sleep(3000);

		}

		@Test(enabled = true, priority = 4)
		public void fullScreenWindowTest() throws InterruptedException {
			driver.manage().window().fullscreen();
			driver.get("https://zillow.com");
			Thread.sleep(3000);

		}

		@Test(enabled = true, priority = 5)
		public void sizeOfWindowTest() throws InterruptedException {
			driver.manage().window().fullscreen();
			driver.get("https://zillow.com");
			Thread.sleep(3000);
			System.out.println("Size:" + driver.manage().window().getSize());

		}

		@Test(enabled = true, priority = 6)
		public void setASpecificSizeOfWindow() throws InterruptedException {
			Dimension dimension = new Dimension(800, 600);
			driver.manage().window().setSize(dimension);
			driver.manage().deleteAllCookies();
			driver.get("https://homedepot.com");
			Thread.sleep(3000);
		}

		@AfterTest
		public void tearUp() {
			driver.quit();
		}

	}

	
	
	
}

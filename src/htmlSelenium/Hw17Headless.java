//package practice;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class Hw17Headless {
//
//	WebDriver driver;
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Beloved\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
//
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("headless");
//		ChromeDriver driver = new ChromeDriver(options);
//		driver.get("https://www.moutsinai.org");
//		Thread.sleep(3000);
//		System.out.println("Current URL:"+driver.getCurrentUrl());
//		driver.quit();
//		
//		
//		
//		
//		
//		
//		
//	}
//
////	@Test(enabled = true, priority = 1)
////	public void searchItemByClickingSearchButton() {
////		WebElement searchField = driver.findElement(By.xpath(""));
////		
////		
////	}
//
//}

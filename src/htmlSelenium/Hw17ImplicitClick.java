package htmlSelenium;
//package practice;
//
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;
//
//import java.util.concurrent.TimeUnit;
//
//import org.checkerframework.checker.units.qual.s;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By.ByXPath;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.AssertJUnit;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import org.testng.asserts.Assertion;
//import org.testng.asserts.SoftAssert;
//
//import net.jodah.failsafe.internal.util.Assert;
//
//public class Hw17JSExecutor_implicit_click {
//
//	WebDriver driver;
//	JavascriptExecutor js;
//
//	@BeforeTest
//	public void setUp() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Beloved\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
//
//		driver = new ChromeDriver();
//		js = (JavascriptExecutor) driver;
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://portal.cms.gov");
//		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);// after comma select time unit(.)then pick
//																		// seconds etc..
//
//	}
//
//	@Test(enabled = true, priority = 1)
//	public void loginButton() throws InterruptedException {
//		WebElement loginbutton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
//		js.executeScript("arguments[0].click()", loginbutton);
//		Thread.sleep(4000);
//	}
//
//	@Test
//	public void test1() {
//		System.out.println("Trying this out");
//		assertEquals(false, true);// This will fail to show the assertion test doesn't continue after an exception
//									// but soft assert does
//
//	}
//
//	@AfterTest
//	public void tearUp() {
//		driver.quit();
//	}
//
//}

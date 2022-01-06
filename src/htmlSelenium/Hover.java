package htmlSelenium;

package practice;

import javax.print.attribute.standard.Chromaticity;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHover {
	ChromeDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Beloved\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		Thread.sleep(2000);

	}

	@Test
	public void mouseHoverActionOnAobutusTest() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement aboutUsElement = driver.findElement(By.xpath("//button[text()='Try it']"));
		actions.moveToElement(aboutUsElement).build().perform();
		Thread.sleep(6000);

	}

	@Test(enabled = true, priority = 1)
	public void alertFromWindow() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.accept();
	}

	@Test(enabled = true, priority = 2)
	public void dismissAlertFromWindow() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}

	@AfterTest
	public void tearUp() {
		driver.close();
	}

}

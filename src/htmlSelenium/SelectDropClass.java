package htmlSelenium;

package practice;

import javax.print.attribute.standard.Chromaticity;

import org.openqa.selenium.By;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectDropDown {

	ChromeDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Beloved\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com");
		Thread.sleep(1000);

	}

	@Test(enabled = true, priority = 1)
	public void selectByIndex() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);
		select.selectByIndex(8);
		Thread.sleep(5000);
	}

	@Test
	public void selectByValueTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);
		select.selectByValue("12576");
		Thread.sleep(5000);

	}

	@Test
	public void selectByVisibleText() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Cameras & Photo");
		Thread.sleep(3000);

	}

	@AfterTest
	public void tearUp() {
		driver.close();
	}
}

}

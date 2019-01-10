package BeforePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Interview {
	
	@Test
	public void login()
	{
		System.out.println("Test Case has been started");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Softy\\Cell\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://pi.cashpoint.com");
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.findElement(By.id("username")).sendKeys("pitest1");
		dr.findElement(By.id("passord")).sendKeys("$Pitest#1");
		dr.findElement(By.id("submit")).click();
		System.out.println("Test Case has been finished");
	}
	
}

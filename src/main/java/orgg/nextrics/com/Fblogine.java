package orgg.nextrics.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fblogine {
@Test
	public static void fbLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 driver.findElement( By.id("email")).sendKeys("monica.bsangwan@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("monika");
		 
		  driver.findElement(By.name("login")).click();
	}

}

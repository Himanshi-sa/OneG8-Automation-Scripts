package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_login_validation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32(1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://oneg8.com/");
//		driver.manage().window().fullscreen();
		driver.findElement(By.id("email")).sendKeys("danzo@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("abcd12345");
		driver.findElement(By.xpath("//*[@id=\"logindiv\"]/div[8]/div/div/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.cssSelector("div#error6")).getText());
	}

}

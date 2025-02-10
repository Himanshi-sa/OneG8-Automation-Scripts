package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class N_post_document {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://oneg8.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("email")).sendKeys("himanshisahu@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//*[@id=\"logindiv\"]/div[8]/div/div/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		post document 
		driver.findElement(
				By.xpath("//*[@id=\"file-picker-docs\"]")).sendKeys("D:\\Testing media\\dummy.pdf");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(
				By.xpath("//*[@id=\"enablebutton\"]")).click();

		


	}

}

package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_post_comment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://oneg8.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("email")).sendKeys("marry@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//*[@id=\"logindiv\"]/div[8]/div/div/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,400)");
		driver.findElement(By.xpath("//*[@id=\"hidecommentdiv288400\"]/div[4]/div/div[2]/div[2]/div/span[2]")).click();
		driver.findElement(By.id("com_post28840")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\"showcommentdiv288400\"]/div/div[4]/div/div[2]/div/div/div/div[2]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"showcommentdiv288400\"]/div/div[1]/div[2]/a/span")).click();

	}

}

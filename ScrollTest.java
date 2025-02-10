package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ScrollTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://oneg8.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("email")).sendKeys("himanshisahu@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//*[@id=\"logindiv\"]/div[8]/div/div/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		scroll start
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,600)");
	    System.out.println("hello");
//		scroll end

	}

}

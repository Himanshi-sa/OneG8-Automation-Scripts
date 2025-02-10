package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class G_seach_user {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://oneg8.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("email")).sendKeys("himanshisahu@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//*[@id=\"logindiv\"]/div[8]/div/div/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        search user start
		driver.findElement(By.id("DynamicSearchInput")).sendKeys("dora");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// enter code start
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		// enter end
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"all\"]/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/a/div")).click();
//        search user end

	}

}

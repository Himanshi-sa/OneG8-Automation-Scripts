package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_post_image {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://oneg8.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("email")).sendKeys("himanshisahu@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//*[@id=\"logindiv\"]/div[8]/div/div/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		post image start
		driver.findElement(
				By.xpath("//*[@id=\"hidestories\"]/div/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/button[1]/span"))
				.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Robot rb = new Robot();
		StringSelection hr = new StringSelection("C:\\Users\\Admin\\Desktop");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(hr, null);
		rb.keyPress(KeyEvent.VK_CONTROL); // press ctrl key
		rb.keyPress(KeyEvent.VK_V); // press v

		// realese button
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		StringSelection ss = new StringSelection("C:\\Users\\Admin\\Desktop\\test");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL); // press ctrl key
		rb.keyPress(KeyEvent.VK_V); // press v

		// realese button
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		rb.delay(5000);
		StringSelection rs = new StringSelection("image1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(rs, null);
		rb.keyPress(KeyEvent.VK_CONTROL); // press ctrl key
		rb.keyPress(KeyEvent.VK_V); // press v

		// realese button
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(5000);

		driver.findElement(By.id("enablebutton")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		 post image end

	}

}

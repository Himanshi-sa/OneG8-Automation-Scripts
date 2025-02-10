package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_singup_validation {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\webdriver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://oneg8.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"regbtn\"]/div/div/div/a/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.id("lastname")).sendKeys("sahu");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("marry");
		Thread.sleep(2000);
		driver.findElement(By.id("new_email")).sendKeys("marry@mailinator.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"userform\"]/div[3]/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"image-profile-get\"]/div/span/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"probutton\"]/button")).click();
		Thread.sleep(2000);
		Robot rb = new Robot();
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
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
		StringSelection rs = new StringSelection("image");
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

		driver.findElement(By.xpath("//*[@id=\"file-picker1\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"userform1\"]/div[3]/div[2]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("new_password")).sendKeys("abcd1234");
        Thread.sleep(2000);
        driver.findElement(By.id("password-confirm")).sendKeys("abcd1234");
        driver.findElement(By.xpath("//*[@id=\"userform2\"]/div[3]/div[2]/button")).click();

	}

}

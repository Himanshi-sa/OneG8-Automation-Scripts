package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class I_poll_post {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://oneg8.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("email")).sendKeys("himanshisahu@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//*[@id=\"logindiv\"]/div[8]/div/div/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		poll start
		driver.findElement(By.id("emojieClickeditpost")).click();
		driver.findElement(
				By.xpath("//*[@id=\"hidestories\"]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/button/span")).click();
		driver.findElement(By.id("poll_caption")).sendKeys("life is colorful");
		driver.findElement(By.id("pollque")).sendKeys("choose is the color ");
		driver.findElement(By.id("pollans0")).sendKeys("red");
		driver.findElement(By.id("pollans1")).sendKeys("pink");
		driver.findElement(By.id("addfieldbtn")).click();
		driver.findElement(By.id("pollans2")).sendKeys("orange");
		WebElement ddown = driver.findElement(By.xpath("//*[@id=\"pollExpire\"]"));
		Select select = new Select(ddown);
		select.selectByValue("1");
		driver.findElement(By.xpath("//*[@id=\"poll-modal\"]/div/div/div[4]/div/div/div/button")).click();
//       poll end

	}

}

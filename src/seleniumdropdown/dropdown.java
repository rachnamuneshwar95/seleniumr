package seleniumdropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {
	 static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://mbasic.facebook.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@value='Create New Account']")).click();
		
		Thread.sleep(3000);
		List<WebElement> days =driver.findElements(By.xpath("//*[@name='birthday_day']"));
		for(WebElement day:days) {
			System.out.println(day.getText());
		}
		
		Thread.sleep(3000);
		driver.quit();
	
}
}
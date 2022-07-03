package seleniumdropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClass {
	 static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://mbasic.facebook.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@type='submit' and @name='sign_up']")).click();
		
		WebElement day = driver.findElement(By.xpath("//*[@name='birthday_day']"));
		WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));
        
        Select sday=new Select(day);
        sday.selectByIndex(9);
        
        Select smonth=new Select(month);
        smonth.selectByValue("6");
        
        Select syear=new Select(year);
        syear.selectByValue("1995");
        
Thread.sleep(3000);
}
}
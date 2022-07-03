package seleniumdropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class byfindelement {
	 static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://mbasic.facebook.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("sign_up")).click();
		
WebElement	wb=	driver.findElement(By.xpath("//*[text()='9']//parent::select[@id='day']"));
wb.click();
WebElement	wb1	=	driver.findElement(By.xpath("//*[text()='Jun']//parent::select[@id='month']"));
wb1.click();
WebElement	wb2=driver.findElement(By.xpath("//*[text()='1995']//parent::select[@id='year']"));
wb2.click();
}
}
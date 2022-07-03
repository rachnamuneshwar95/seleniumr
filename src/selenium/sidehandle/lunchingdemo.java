package selenium.sidehandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lunchingdemo {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.demoblaze.com/");
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.id("login2")).click();
	driver.findElement(By.id("loginusername")).sendKeys("sctqaautomation@grr.la");
	driver.findElement(By.id("loginpassword")).sendKeys("Spring@123");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();

    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,1200)","");
    
     
}
}

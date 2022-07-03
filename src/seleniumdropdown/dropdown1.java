package seleniumdropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown1 {
	 static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://mbasic.facebook.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@value='Create New Account']")).click();
		
		
		List<WebElement> days= driver.findElements(By.xpath("//*[@id=\"day\"]//option"));
		for(WebElement day: days) {
			if(day.getText().equals("9"))
				day.click();
			
	   List<WebElement> months = driver.findElements(By.xpath("//*[@value='6']//parent::select[@title='Month']"));
	   for(WebElement month : months) {
		   if(month.getText().contentEquals("Jun"))
			   month.click();
		  
	
		   List<WebElement> years = driver.findElements(By.xpath("//*[text()='1995']//parent::select[@id='year']"));
		   for(WebElement year : years) {
			      Thread.sleep(3000);
			   if(year.getText().contentEquals("1995"))
				   year.click();
		   
	   } 
		}
	 }
}}
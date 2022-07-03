package myntra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;

public class myntrahomepage {
	 static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement target =driver.findElement(By.xpath("//*[text()='Beauty']//parent::div[@class='desktop-navLink']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		WebElement click =driver.findElement(By.xpath("//*[text()='Sunscreen']"));
		Thread.sleep(2000);
		act.click(click).perform();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1850)", "");
		
		  driver.findElement(By.xpath("//img[contains(@alt,'Minimalist Antioxidant Silymarin SPF 60 PA++++ Susncreen 50ML')]")).click();
	
		  Thread.sleep(3000);
		  String text =driver.switchTo().alert().getText();
		  System.out.println(text);
		  driver.switchTo().alert().accept();
		  
		  driver.findElement(By.xpath("//*[text()='GO TO BAG']")).click();
		
		
	//	  js.executeScript("window.scrollBy(0,2250)", "");
			
}
}
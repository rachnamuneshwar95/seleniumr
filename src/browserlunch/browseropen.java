package browserlunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browseropen {
	 static WebDriver driver;
 public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@type ='text' and @id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
String url = driver.getCurrentUrl();
System.out.println(url);
if(url.equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard"))
	System.out.println("url is pass");
else
	System.out.println("url fail");

driver.get("https://www.youtube.com/");
driver.manage().window().maximize();

String title = driver.getTitle();
System.out.println(title);
if(title.equals("YouTube"))
	System.out.println("title is pass");

}
}
 
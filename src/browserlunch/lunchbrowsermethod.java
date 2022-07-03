package browserlunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lunchbrowsermethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath(""))
}
}

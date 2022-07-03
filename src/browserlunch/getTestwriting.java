package browserlunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTestwriting {
	 static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	
		WebElement text =driver.findElement(By.xpath("//*[text()='LOGIN Panel']"));
		
		String checktext = text.getText();
		System.out.println(checktext);
		if(checktext.equals("LOGIN Panel"))
			System.out.println("text is as expected");
		
		
		
}
}
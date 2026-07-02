package AlertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandle {

	
	
	
	@Test
	public void alert() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement simplealert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		simplealert.click();
		driver.switchTo().alert().accept();
		
		WebElement conformalert = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		conformalert.click();
		driver.switchTo().alert().dismiss();
		
		WebElement promtalert = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		promtalert.click();
		driver.switchTo().alert().sendKeys("dinesh");
		driver.switchTo().alert().accept();

		
	}
}

package learningwebelement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");

		WebElement untxtfld = driver.findElement(By.id("user-name"));
		
		untxtfld.sendKeys("standard_user");
		
		WebElement pwtxtfld = driver.findElement(By.id("password"));
		pwtxtfld.sendKeys("secret_sauce");
		
		WebElement loginbtn = driver.findElement(By.id("login-button"));
		
		loginbtn.click();
		
		Thread.sleep(2000);
		
		//-----------------------Alert Handlying -------------------------
		
		Alert simplealert = driver.switchTo().alert();
		
		simplealert.accept();
		
		System.out.println("Simple alert accepted");
		
		driver.quit();
	}

}

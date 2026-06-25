package learnlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.Throw;

public class learnname {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		WebElement untxtfld=driver.findElement(By.id("user-name"));
		untxtfld.sendKeys("standard_user");
		
		WebElement pwtxtfld=driver.findElement(By.id("password"));
		pwtxtfld.sendKeys("secret_sauce");
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(3000);
		driver.close();
	}

}

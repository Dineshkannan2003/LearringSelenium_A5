package learnlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement register = driver.findElement(By.xpath("//a[contains(text(), 'Register')]"));
		
		register.click();
		
		WebElement selectgender = driver.findElement(By.xpath("//input[@name='Gender' and @value='M']"));
		selectgender.click();
		
		WebElement firestname = driver.findElement(By.xpath("//input[contains(@id,'FirstName')]"));
		firestname.sendKeys("DInesh");
		
		
		WebElement lastname = driver.findElement(By.xpath("//input[@class='text-box single-line']/preceding::input[@ id='LastName']"));
		
		lastname.sendKeys("kanna");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='Email']"));
		email.sendKeys("Dineshkannan700@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='Email']/following::input[@id='Password']"));
		password.sendKeys("Dinesh@2003");
		
		WebElement confirempassword = driver.findElement(By.xpath("//input[@value='Register']/preceding::input[@id='ConfirmPassword']"));
		confirempassword.sendKeys("Dinesh@2003");
		
		WebElement rigister = driver.findElement(By.xpath("//input[@class='button-1 register-next-step-button']"));
		rigister.submit();
		
		driver.navigate().back();
		
		
		
		WebElement login =driver.findElement(By.xpath("//a[contains(text(), 'Log in')]"));
		login.click();
		
		WebElement loginemail =driver.findElement(By.xpath("//input[@id='Email']"));
		loginemail.sendKeys("Dineshkannan700@gmail.com");
		
		WebElement loginpassword = driver.findElement(By.xpath("//input[contains(@id,'Password')]"));
		loginpassword.sendKeys("Dinesh@2003");
		
		WebElement login1 = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
		login1.submit();
		
		
	
		
		driver.quit();
		
		System.out.println("Testing done by dinesh");
		
		
		
	}

}

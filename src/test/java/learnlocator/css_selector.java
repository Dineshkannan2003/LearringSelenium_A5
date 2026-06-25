package learnlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		WebElement untxtfd = driver.findElement(By.cssSelector("input[id='user-name']"));
		Thread.sleep(3000);
		WebElement pwtxtfd = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		Thread.sleep(3000);
		WebElement loginbt = driver.findElement(By.cssSelector("input[value='Login']"));
		
		untxtfd.sendKeys("standard_user");
		pwtxtfd.sendKeys("secret_sauce");
		loginbt.click();
		Thread.sleep(6000);
		WebElement sttxt = driver.findElement(By.cssSelector("div[data-test='inventory-item-name']"));
		
		sttxt.click();
		
		WebElement name = driver.findElement(By.xpath("//div[text() = 'Sauce Labs Backpack']"));
		String logo = name.getText();
		System.out.println("Name of the product is :" + logo);
		
		 WebElement price = driver.findElement(By.xpath("//div[text() = '29.99']"));
		
		String amount = price.getText();
		System.out.println("Price of the product is: " + amount);
		
		
		
		
		driver.close();
		
		System.out.println("Tesing Done by dinesh");
		
		
	}

}

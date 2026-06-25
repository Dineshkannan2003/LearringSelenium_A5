package LearnActionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrogAnddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[name()='svg'])[5]")).click();
		Thread.sleep(2000);
		
		//scroll down to Book store app
		WebElement dropBtn= driver.findElement(By.xpath("//div[text()='Book Store Application']"));
		act.moveToElement(dropBtn);
		Thread.sleep(1000);
		act.click().build().perform();
		
		 driver.findElement(By.xpath("//span[text()='Droppable']/../..")).click();
		Thread.sleep(2000);
	
		
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
	
		
				
		act.dragAndDrop(drag, drop).perform();
		

	}

}

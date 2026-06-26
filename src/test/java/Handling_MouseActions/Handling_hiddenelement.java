package Handling_MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_hiddenelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		// handling mouse actions
		
		Actions actionobj = new Actions(driver);
		
		WebElement ele1 = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]"));
		
		//actionobj.contextClick(ele1);
		
		actionobj.moveToElement(ele1).perform();
		
		WebElement ele2 = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Desktops')]"));
		
		actionobj.click(ele2).perform();
		
		WebElement ele3 = driver.findElement(By.xpath("//a[text()='Build your own cheap computer']"));
		
		actionobj.doubleClick(ele3).perform();
		
		
		
		
		
		

	}

}

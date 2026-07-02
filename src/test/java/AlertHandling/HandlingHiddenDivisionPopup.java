package AlertHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingHiddenDivisionPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions co_obj=new ChromeOptions();
		
		co_obj.addArguments("--disable-notifications");

		
		WebDriver driver =new ChromeDriver(co_obj);
		
		driver.get("https://www.goibibo.com/");
		
		WebElement cancel = driver.findElement(By.xpath("//span[@role='presentation']"));
		cancel.click();
		
		System.out.println("Hidden division Popup was handled");
		
		driver.quit();
		
		
		
	}

}

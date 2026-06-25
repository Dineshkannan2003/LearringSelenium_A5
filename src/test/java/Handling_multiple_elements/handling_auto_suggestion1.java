package Handling_multiple_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_auto_suggestion1 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		//to navigate the application
		
		driver.get("https://www.amazon.in/");
		
		//find the search box
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchbox.sendKeys("laptop");
		
		// finding dropdwon element
		
		List<WebElement> dropdwonelement = driver.findElements(By.xpath("//div[text()='laptop']"));
		
		System.out.println(dropdwonelement.size());
		
		for(WebElement list: dropdwonelement) {
			
			if(list.getText().equals("laptop for gaming")) {
				
				list.click();
			}
			
			
			
		}
		
		driver.quit();
	}

}

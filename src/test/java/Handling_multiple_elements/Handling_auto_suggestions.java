package Handling_multiple_elements;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_auto_suggestions {
	
	public static void main(String[] args) {
		
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter dynamic input");
			
			String serachdata=sc.next();
			
			
			WebDriver driver=new ChromeDriver();

			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.amazon.in/");
			
			
			
			WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
			searchbox.sendKeys(serachdata);
			
			List<WebElement> searchboxelement = driver.findElements(By.xpath("//div[text()='"+serachdata+"']"));
			
			for(int i=0; i<searchboxelement.size();i++) {
				
				System.out.println(searchboxelement.get(i).getText());
			}
			
			System.out.println("execution done by dinesh");
			
			driver.quit();
		}
		
		
	}

}

package Handling_multiple_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		driver.get("https://www.amazon.in/");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select select=new Select(dropdown);
		
		boolean status = select.isMultiple();
		
		if (status) {
			
			System.out.println("This is the Multiple dropdown");
			
		} else {

			System.out.println("This is the single dropdown");

			
		}
		
	
		
		select.selectByIndex(4);
		
		List<WebElement> list = select.getOptions();
		
		int totleelm = list.size();
		
		System.out.println(totleelm);
		
		for(WebElement words:list) {
			
			System.out.println(words.getText());
		}
		
		
		driver.quit();
		
		
		
	}

}

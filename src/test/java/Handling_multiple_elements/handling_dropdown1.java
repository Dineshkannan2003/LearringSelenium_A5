package Handling_multiple_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handling_dropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		//navig
		driver.get("file:///C:/Users/ELCOT/Downloads/EmbededWebpage.html");
		
		WebElement dropdown1 = driver.findElement(By.cssSelector("select[name='country1']"));
		
		WebElement dropdown2 = driver.findElement(By.cssSelector("select[name='country2']"));
		
		Select selectobj=new Select(dropdown2);
		
		boolean status = selectobj.isMultiple();
		
		if (status) {
			
			System.out.println("It is multiple dropdown");
		
		} else {

			System.out.println("It is single dropdown");

		}
		
		System.out.println("--------------------------------------------------------------");
		
		List<WebElement> options = selectobj.getOptions();
		

		System.out.println(options.size());
		
		System.out.println("--------------------------------------------------------------");

		
		for(WebElement list:options) {
			
			System.out.println(list.getText());
		}
		
		
		selectobj.selectByIndex(2);
		
		selectobj.selectByValue("cnd");
		
		selectobj.selectByVisibleText("SWITZERLAND");
		
		selectobj.selectByContainsVisibleText("IND");
		
        WebElement firstoptions = selectobj.getFirstSelectedOption();
        
        System.out.println("-------------------------------------------------------------------");
        
        System.out.println("the first option is: "+ firstoptions.getText());
        
        List<WebElement> alloptions = selectobj.getAllSelectedOptions();
        
        System.out.println("-------------------------------------------------------------------");

        
        for(WebElement alllist:alloptions) {
        	
        	System.out.println(alllist.getText());
        	
        }
        
        WebElement wrapper = selectobj.getWrappedElement(); 
        
        System.out.println("-------------------------------------------------------------------");

        System.out.println(wrapper.getText());
        
        selectobj.deselectByIndex(2);
        
        selectobj.deselectByValue("cnd");
        
        selectobj.deselectByVisibleText("SWITZERLAND");
        
        selectobj.deSelectByContainsVisibleText("IND");
        
        driver.quit();
        
        
		
		
	}

}

package HANDLING_JS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30l));
		
		
		JavascriptExecutor jseobj=(JavascriptExecutor) driver;
		
		jseobj.executeScript("window.location=arguments[0]","https://automationexercise.com/");
		
		//jseobj.executeScript("history.go(0)");
		
	    System.out.println(	jseobj.executeScript("return document.title"));
	    
	    System.out.println(	jseobj.executeScript("return document.URL"));
	    
	    
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' Signup / Login']")));
	    
	    jseobj.executeScript("arguments[0].click()" , driver.findElement(By.xpath("//a[text()=' Signup / Login']")));
	    
	    jseobj.executeScript("arguments[0].value='dinesh'" , driver.findElement(By.name("name")));
	    
	    jseobj.executeScript("arguments[0].value='dineshdk4@gmail.com'" , driver.findElement(By.xpath("//input[@data-qa='signup-email']")));
	    
	    jseobj.executeScript("arguments[0].click()" , driver.findElement(By.xpath("//button[text()='Signup']")));
	    
	    jseobj.executeScript("arguments[0].click()", driver.findElement(By.id("id_gender1")));
	    
	    
		
	    jseobj.executeScript("arguments[0].value='dineshkannan700@gmail.com'", driver.findElement(By.id("email")));
	    
	  //  jseobj.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//b[text()='Address Information']")));
	    
	   // jseobj.executeScript("window.scrollBy(0,500)");
	    
	   // jseobj.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.id("mobile_number")));
	    
	    
	    jseobj.executeScript("arguments[0].value='Dinesh2003'",driver.findElement(By.id("password")));
	    
	    
	    WebElement day = driver.findElement(By.id("days"));
		  WebElement month = driver.findElement(By.id("months"));
		  WebElement year = driver.findElement(By.id("years"));
		  
		 Select sc= new Select(day);
		 
		 sc.selectByContainsVisibleText("2");
		 
		 Select sc1=new Select(month);
		 
		 sc1.selectByContainsVisibleText("December");
		 
		 Select sc2=new Select(year);
		 
		 sc2.selectByContainsVisibleText("2003");

	    
	    
	    
	    
	    jseobj.executeScript("arguments[0].click()", driver.findElement(By.id("newsletter")));
	    
	    jseobj.executeScript("arguments[0].click()", driver.findElement(By.id("optin")));
	    
	    jseobj.executeScript("arguments[0].value='Dinesh'", driver.findElement(By.id("first_name")));
	    
	    jseobj.executeScript("arguments[0].value='kannan'", driver.findElement(By.id("last_name")));
	    
	    jseobj.executeScript("arguments[0].value='Qspider'", driver.findElement(By.id("company")));
	    

	  
		
        driver.quit();
		    
	    
	 
	  
	  
	    
	}

}

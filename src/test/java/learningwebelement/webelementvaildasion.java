package learningwebelement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class webelementvaildasion {

	public static void main(String[] args) throws IOException {
		  
		//1) open the browsers
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//2) naviget the applycation
		
		driver.get("https://automationexercise.com/");
		
		//3) print the page title
		
		System.out.println("home page title " + driver.getTitle());
		
		// 4) click the signup button
		WebElement login = driver.findElement(By.xpath("//a[contains(text(),' Signup / Login') ]"));
		login.click();
		
		//5) print the signup page title
		
		System.out.println("signup page " + driver.getTitle());
		
		//6) find the user the webelement
		
		WebElement usname = driver.findElement(By.xpath("//input[@name='name']"));
		
		usname.sendKeys("Dinesh kannan");
		
		boolean usdisplays = usname.isDisplayed();
		boolean us_isenable = usname.isEnabled();
		
		//7) validated the text filed
		
		if(usdisplays && us_isenable) {
			
			System.out.println("The user name text filed is displayed and enables");
		}
		
		else {
			
			System.out.println("The user name text filed is not displayed and enables");
		}
		
		//8)
		
		WebElement email1 = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
		
		email1.sendKeys("dineshkannan700@gmail.com");
		
		boolean email1_isdisplayed = email1.isDisplayed();
		
		WebElement signup = driver.findElement(By.xpath("//button[contains(text(),'Signup')]"));
		
		signup.click();
		
		System.out.println("create account page" + driver.getTitle());
		
		WebElement Gender = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		Gender.click();
		boolean Genderflddisplayed = Gender.isDisplayed();
		
		boolean Genderfldenable = Gender.isEnabled();
		
		boolean Genderfidselected = Gender.isSelected();
		
		
		WebElement name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		
		boolean namedisplay = name.isDisplayed();
		boolean nameneable = name.isEnabled();
		
		
		
		WebElement emailtxtfld = driver.findElement(By.xpath("//input[@id='email']"));
		
		boolean displayed1 = emailtxtfld.isDisplayed();
		
		boolean displayed2 = emailtxtfld.isEnabled();
		
		
		//Take Screenshot full pages
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File temp_path = ts.getScreenshotAs(OutputType.FILE);
		
		 File per_path=new File("./src/test/resources/testScreenshot/screenshot1.png");
		 
		 FileHandler.copy(temp_path, per_path);
		
		 
		 File temp_path1 = emailtxtfld.getScreenshotAs(OutputType.FILE);
		 
		 File per_path1 = new File("./src/test/resources/testScreenshot/screenshotwebelement.png");
		 
		 FileHandler.copy(temp_path1, per_path1);
		 
		 
		 
		
		
		if(Genderflddisplayed  )
		{
			
			System.out.println("Gender are Displayed  " + Genderflddisplayed );
		}
		else {
			
			System.out.println("Genderare Displayed  " + Genderflddisplayed );
		}
		
		if(Genderflddisplayed && namedisplay && displayed1 ) {
			
			System.out.println("THe name , Gender , email was displayed");
		}
		
		else {
			
			System.out.println("THe name , Gender , email was not displayed");
		}
		
		
		
		if(Genderfldenable && nameneable ) {
			
			
			System.out.println("The Gender radio button and name text field was enabled");
		}
		
		else {
			
			System.out.println("The Gender radio button and name text field was not enabled");
		}
		
		if(displayed2) {
			
			System.out.println("The email text field was enabled");
		}
		
		else {
			
			System.out.println("The email text field was not enabled");
		}
		
		driver.quit();
		
		
		
		
		
	}
	
}

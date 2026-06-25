package LearningTakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Webpagescreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File temp_path = ts.getScreenshotAs(OutputType.FILE);
		
		File par_path = new File("./src/test/resources/testScreenshot/screenshot.png");
		
		FileHandler.copy(temp_path, par_path);
		
		System.out.println("Screenshot Taken");
		
		driver.quit();
		
		

	}

}

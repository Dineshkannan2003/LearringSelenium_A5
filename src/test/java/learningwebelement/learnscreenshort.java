package learningwebelement;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LearnActionsclass.fileupload;

public class learnscreenshort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		TakesScreenshot screenshort=(TakesScreenshot)driver;
		
		File screenshort1 = screenshort.getScreenshotAs(OutputType.FILE);
		
		File store= new File("D:/eclipse/LearningAutomation_A5/src/test/java/learningwebelement/linkedin.png");
		
		Files.copy(screenshort1.toPath(), store.toPath());
		 
		//driver.quit();

	}

}

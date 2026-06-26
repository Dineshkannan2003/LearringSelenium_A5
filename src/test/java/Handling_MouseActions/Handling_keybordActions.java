package Handling_MouseActions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import learningwebelement.webelementvaildasion;

public class Handling_keybordActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions actobj=new Actions(driver);
		
		
		/*
		
		actobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		actobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		actobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		actobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		actobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		actobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		*/
		
		actobj.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"Book",Keys.ENTER).perform();
		
		driver.quit();
		
	}

}

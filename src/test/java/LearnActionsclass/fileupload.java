package LearnActionsclass;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement file = driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]"));
		
		file.sendKeys("C:\\Users\\ELCOT\\OneDrive - ELCOT\\course\\Dineshkannan testing resume.pdf");
		
		StringSelection select=new StringSelection("C:\\Users\\ELCOT\\OneDrive - ELCOT\\course\\Dineshkannan testing resume.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		
	//	Robot.keyPress(KeyEvent.VK_CONTROL);
		
	//	Robot.keyPress(KeyEvent.VK_V);
		
	//	Robot.keyRelease(KeyEvent.VK_CONTROL);
		
	//	Robot.keyRelease(KeyEvent.VK_V);
		
		
	}

}

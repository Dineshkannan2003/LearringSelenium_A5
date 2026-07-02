package fileUploadpopup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		
		//steps to upload the files
		
		//1) find the chiosefile button bu using findelement method
		
		WebElement fileupload_button = driver.findElement(By.id("file-upload"));
		
		//2) craate the file
		
		File actualfile = new File("./src/test/resources/data/notes.txt");
		
		//send the file by using sendkeys methods
		
		fileupload_button.sendKeys(actualfile.getAbsolutePath());

	}

}

package learnwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/");
		
		WebElement loginbtn = driver.findElement(By.cssSelector("#loginBtn"));
		
		loginbtn.click();
		
		
		
		driver.navigate().back();
		
		WebElement headtxt = driver.findElement(By.xpath("//div[@class='welcomebar_welcomeBar__3WTVB']"));
		
		String headtxtfld = headtxt.getText();
			
		System.out.println("the application header title is : " + headtxtfld);
		
		System.out.println("the execution done by dinesh");
		
		driver.quit();

	}

}

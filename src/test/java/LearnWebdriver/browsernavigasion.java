package LearnWebdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsernavigasion {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		WebDriver drive =new ChromeDriver();
		
		
		
		
		drive.navigate().to("https://in.linkedin.com/");
		
		//drive.switchTo().newWindow(WindowType.TAB );
		
		drive.switchTo().newWindow(WindowType.WINDOW);
		drive.navigate().to(new URL("https://online.kfc.co.in/"));
		drive.navigate().back();
		drive.navigate().forward(); 
		drive.navigate().refresh();
		
		drive.quit();
        
	}

}

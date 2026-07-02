package AlertHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions co_obi = new ChromeOptions();
		co_obi.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co_obi);
		
		driver.get("https://www.goibibo.com/");
		
		
		
	}

}

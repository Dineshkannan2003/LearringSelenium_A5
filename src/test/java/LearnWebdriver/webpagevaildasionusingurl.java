package LearnWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpagevaildasionusingurl {
	
	public static void main(String[] agrs) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		String exp_url="https://www.selenium.dev/";
		
		String act_url= driver.getCurrentUrl();
		
		System.out.println(act_url);
		 
		
		if(exp_url.equals(act_url)) {
			
			System.out.println("url verified - pass " + act_url);
		}
		else {
			
			System.out.println("url verified - fail " + act_url);
		}
		
		driver.close();
		
	}

}

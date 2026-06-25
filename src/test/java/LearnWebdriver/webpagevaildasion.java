package LearnWebdriver;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpagevaildasion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
	   WebDriver driver=new ChromeDriver();
	   //step 1: navigate the webpage
	   driver.get("https://www.selenium.dev//");
	   
	   
	   //step 2: enter exp_title
	   String exp_title="Selenium";
	   
	   //step 3: get the act_title
	   String act_title=driver.getTitle();
	   System.out.println(act_title);
	   
	   driver.close();
	   //step 4: compare the exp_title and act_title is same or not
	   
	   if(exp_title.equals(act_title)) {
		   
		   System.out.println("Title verified - pass " + act_title);
	   }
	   else {
		   
		   System.out.println("Title verified - fail " + act_title);
	   }
	   
	    
	}

}

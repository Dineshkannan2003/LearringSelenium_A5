package Handling_multiple_elements;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learn_webtable {
	
	public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
		System.out.println("Enter the N-th row number");
		String n_th=sc.next();
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://vinothqaacademy.com/webtable/");
		
		// fetch the 3 row employee name
		WebElement vin_name = driver.findElement(By.xpath("//table[@id='myTable']//tr[3]/td[2]"));
		System.out.println("the 3 row name is: " + vin_name.getText());
		
		
		// fetch the all the employee name
		List<WebElement> emp_name = driver.findElements(By.xpath("//table[@id='myTable']//tr/td[2]"));
		
		for(WebElement list_name:emp_name) {
			
			System.out.println(list_name.getText());
		}
		
		System.out.println("");
		
		// fetch the n_th employee details
		List<WebElement> nth_name = driver.findElements(By.xpath("//table[@id='myTable']//tr["+n_th+"]"));
		
		for(WebElement n_thlist:nth_name) {
			
			System.out.println(n_thlist.getText());
		}
		
		driver.quit();
	}

}

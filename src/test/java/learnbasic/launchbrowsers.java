package learnbasic;
import java.util.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launchbrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Browser name;");
		System.out.println("choice c for Chrome");
		System.out.println("Choice e for Edge");
		char choice=sc.next().toLowerCase().charAt(0);
		
		if (choice =='c') {
			
			new ChromeDriver();
		}
		
		else if (choice == 'e') {
			
			new EdgeDriver();
		}
		
		else {
			
			System.out.println("Enter vaild input");
		}
		

	}

}

package learnbasic;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class lauchbrowser_userchoise

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter broser name Chrome or Edge :");
		
		 String choice=sc.next().toLowerCase();
		 
		 if(choice.equals("chrome")) {
			 
			 new ChromeDriver();
		 }
		 
		 else if (choice.equals("edge")) {
			 
			 new EdgeDriver();
			 
		 }
		 
		 else {
			 
			 System.out.println("Enter vailed input");
		 }
		 
		 sc.close();
		 

	}

}

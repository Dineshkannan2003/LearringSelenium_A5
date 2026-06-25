package learningwebelement;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnfetching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement elementreff = driver.findElement(By.xpath("//div[@class='login_logo']"));
		
		if (elementreff.isDisplayed()) {
			
			System.out.println("Element is Present");
			
		}
		
		else {
			
			System.out.println("Element is Present");
		}
		
		//Print the Element name by using getText() method
		
		String actual_text = elementreff.getText();
		
		System.out.println(actual_text);
		
		//Print the Element name by using Tagname() method
		
		String actual_tagname = elementreff.getTagName();
		System.out.println(actual_tagname);
		
		//print the element name by using getAttribute() method
		
		@Nullable
		String actual_attribute = elementreff.getAttribute("class");
		System.out.println(actual_attribute);
		
		//print the element name by using css propertices() method
		
		String actual_cssproperty = elementreff.getCssValue("font-family");
		System.out.println(actual_cssproperty);
		
		//get the size of the element by using the getsize() method
		
		Dimension actual_size = elementreff.getSize();
		int actual_width = actual_size.getWidth();
		
	    int actual_height = elementreff.getSize().getHeight();
	    System.out.println(actual_size);
	    System.out.println(actual_width);
	    System.out.println(actual_height);
	    
	    // find the location by using getlocation() method
	    
	    Point actual_location = elementreff.getLocation();
	    int actual_xlocation = elementreff.getLocation().getX();
	    int actual_ylocation = actual_location.getY();
		
	    System.out.println(actual_location);
	    System.out.println(actual_xlocation);
	    System.out.println(actual_ylocation);
	    
	    
	    // compare the text name to another string name
	    
	    String ex_name = "Swag Labs";
	    
	    if(actual_text.equals(ex_name)) {
	    	
	    	System.out.println("The actual name and ex_name are same so the test is pass");
	    }
	    
	    else {
	    	
	    	System.out.println("The actual name and ex_name are not same so the test is fail");
	    }
	    
	    
	    String ex_tagname ="div";
	    
	    String ex_Attribute ="login_logo";
	    
	   int ex_width=1536;
	   
	   int ex_height= 108;
	   
	   //compare the tagname
	   
	   if (actual_tagname.equals(ex_tagname)) {
		   
		   System.out.println("The actual tagname and ex_tagname are  same so the test is pass");
		
	}
	   
	   else {
		   
		   System.out.println("The actual tagname and ex_tagname are not same so the test is fail");
	   }
	   
	   //compare the Attribute
	   
	   if (actual_attribute.equals(ex_Attribute)) {
		   
		   System.out.println("The actual Attribute and ex_Attribute are  same so the test is pass");
		
	}
	   
	   else {
		   
		   System.out.println("The actual Attribute and ex_Attribute are not same so the test is fail");
			
	   }
	   
	   //compare the width
	   
	   if (actual_width == ex_width) {
		   
		   System.out.println("The actual width and ex_width are  same so the test is pass");
		
	}
	   
	   else {
		   
		   System.out.println("The actual width and ex_width are not same so the test is fail");

	   }
	   
	   //compare the height
	   
	   if (actual_height == ex_height) {
		   
		   
		   System.out.println("The actual height and ex_height are  same so the test is pass");
	}
	   
	   else {
		   
		   System.out.println("The actual height and ex_height are not same so the test is fail");

	   }
	    
	   //compare the width and height
	   
	   if (actual_width == ex_width && actual_height == ex_height) {
		   
		   System.out.println("The actual height and width and ex_height and width are  same so the test is pass");

		
	}
	   
	   else {
		   
		   System.out.println("The actual height and width and ex_height and width are  same so the test is pass");
	   }
	    
	    
	   String ex_cssproperty= "DM Mono";
	   
	   //compare the css value property
	   
	   if(actual_cssproperty.contains(ex_cssproperty)) {
		   
		   System.out.println("the actual_cssproperty and ex_cssproperty are same so test is pass");
	   }
	   
	   else {
		   
		   System.out.println("the actual_cssproperty and ex_cssproperty are not same so test is fail");

	   }
	    
	    driver.quit();
		
	    

	}

}

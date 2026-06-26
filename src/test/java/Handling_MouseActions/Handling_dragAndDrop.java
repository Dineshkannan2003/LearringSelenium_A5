package Handling_MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_dragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		Actions actionobj=new Actions(driver);

		
		driver.get("https://vinothqaacademy.com/");
		
		
		
		WebElement demo = driver.findElement(By.xpath("(//a[text()='Demo Sites'])[2]"));
		actionobj.moveToElement(demo).perform();
		
		WebElement practice = driver.findElement(By.xpath("(//a[text()='Practice Automation'])[2]"));
		actionobj.moveToElement(practice).perform();
		
		WebElement mouse = driver.findElement(By.xpath("(//a[text()='Mouse Event'])[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(mouse));
		actionobj.moveToElement(mouse).click().perform();
		
		
		
		
		WebElement drag = driver.findElement(By.id("dragItem"));
		
		WebElement drap = driver.findElement(By.id("dropZone"));
		
		
		
		//Doubleclick Actions
		WebElement doublebtn = driver.findElement(By.id("doubleBtn"));
		actionobj.doubleClick(doublebtn);
		System.out.println("Doubleclick Action was done");
		
		Thread.sleep(2000);
		//actionobj.moveToElement(drap);
		
		
		//rightclick Action
		
		WebElement rightbtn = driver.findElement(By.id("rightBtn"));
		actionobj.contextClick(rightbtn);
		Thread.sleep(2000);
		System.out.println("right click action was done");
		
		
		//dragAndDrop Action
		
		//actionobj.dragAndDrop(drag, drap).perform();
		
		actionobj.clickAndHold(drag).release(drap).perform();
		Thread.sleep(2000);
		System.out.println("DragAndDrop Action was done ");
		
		//Right click by using  moveToElement() method
		
		WebElement holdbtn = driver.findElement(By.id("tooltipTarget"));
		actionobj.moveToElement(holdbtn).perform();
		Thread.sleep(2000);
		System.out.println("MovetoElement Action was done");
		
		
		// slider action by using dragAnddropby() method
		
		WebElement silder = driver.findElement(By.id("handle_max"));
		actionobj.dragAndDropBy(silder, 200, 0).perform();
		
		System.out.println("Slider scrolling was done");
		
		
		//scrolling
		actionobj.scrollByAmount(0, 500).perform();
		
		actionobj.scrollToElement(holdbtn).perform();
		
		actionobj.scrollFromOrigin(ScrollOrigin.fromElement(silder), 0, 500);
		
		System.out.println("execution done");
		
		
		driver.quit();
		
		
		
		
	}

}

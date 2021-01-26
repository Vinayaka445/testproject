import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Actions a = new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		
		
		
		
		driver.findElements(By.tagName("iframe")).size();//no of frames present in the application
		
		
		
		driver.switchTo().defaultContent();// to comeback to default place
	}

}
// frames are the components which are hosted in the webpages
// frames can be handles by 2 method 
//1) by webelement
//2) by index and ids

// to know how many frames present in the application from line 22

//to comback to defaultplace ftom line 26





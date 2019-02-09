package seleniummodule1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initiating the chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\Downloads\\jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\anjal\\Downloads\\jarfiles\\geckodriver.exe");
		WebDriver  foxdriver = new FirefoxDriver();
		
		//close and quit 
		driver.close();
		driver.quit();
		
		//get commands
		driver.get("URL"); //to open a url of an AUT
		driver.getCurrentUrl(); //
		driver.getTitle();
		driver.getWindowHandle();// window name
		
		//navigation commands
		driver.navigate().to("URL"); //navgate to sepecifi url
		driver.navigate().forward(); 
		driver.navigate().back(); // to back 
		driver.navigate().refresh(); //to refresh a page
		// element handling commands
		
		driver.findElement(By.id("")).click();
		driver.findElement(By.id("")).sendKeys("anjali");
		driver.findElement(By.id("")).clear();
		
	}

}

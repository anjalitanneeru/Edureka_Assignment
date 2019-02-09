package seleniummodule1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\Downloads\\jarfiles\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  
  driver.get("https://www.facebook.com");
  //id locator
  driver.findElement(By.id("u_0_c")).sendKeys("anjali");
  driver.findElement(By.id("u_0_e")).sendKeys("ta");
  //name locator
  driver.findElement(By.name("reg_email__")).sendKeys("anj@gmail.com");
  //driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("973456");
  //linktext loccator:
 driver.findElement(By.linkText("Forgot account?")).click();
  driver.navigate().back();
  //partial link text
  //driver.findElement(By.partialLinkText("Forgot")).click();
  //css locator
  driver.findElement(By.cssSelector("#u_0_a")).click();
  //tag name
  
  List<WebElement> list = driver.findElements(By.tagName("a"));
  System.out.println(list.size());
 // driver.close();
  
	}

}

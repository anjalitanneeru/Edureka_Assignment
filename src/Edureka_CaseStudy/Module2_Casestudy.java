package Edureka_CaseStudy;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Module2_Casestudy {
//public static Scanner s;
    public static void main(String[] args) throws IOException {
        String selectbrowser;
        WebDriver driver;
        System.out.println("enter chrome or firefox");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        //        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int i = scan.nextInt();
//        s = new Scanner("System.in");
//        selectbrowser = s.nextLine();
        if (s.equalsIgnoreCase("chrome"))
        {
             System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjal\\Downloads\\jarfiles\\chromedriver.exe");
            // launching browser

            driver = new ChromeDriver();
            driver.navigate().to("https://www.edureka.co/");
            driver.manage().window().maximize();
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println("hhh");
            }
            driver.findElement(By.id("search-inp")).click();
            driver.findElement(By.name("user_v1[query]")).click();
            driver.findElement(By.xpath("//input[@id='search-inp']")).sendKeys("selenium");
            driver.findElement(By.className("search_inp")).clear();
            driver.findElement(By.className("search_inp")).sendKeys("Devops");
            driver.findElement(By.className("search_inp")).clear();
            driver.findElement(By.cssSelector("#search-inp")).sendKeys("selenium");
            // finding login element using locator:
            // driver.findElement(By.linkText("Log In")).click();
            // driver.findElement(By.xpath("//*[@class='close']")).click();
            driver.findElement(By.partialLinkText("Log")).click();
            driver.close();
        }
        else if (s.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\anjal\\Downloads\\jarfiles\\geckodriver.exe");
            // launching browser

            driver = new FirefoxDriver();
            driver.navigate().to("https://www.edureka.co/");
            driver.manage().window().maximize();
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println("hhh");
            }
            driver.findElement(By.id("search-inp")).click();
            driver.findElement(By.name("user_v1[query]")).click();
            driver.findElement(By.xpath("//input[@id='search-inp']")).sendKeys("selenium");
            driver.findElement(By.className("search_inp")).clear();
            driver.findElement(By.className("search_inp")).sendKeys("Devops");
            driver.findElement(By.className("search_inp")).clear();
            driver.findElement(By.cssSelector("#search-inp")).sendKeys("selenium");
            // finding login element using locator:
            // driver.findElement(By.linkText("Log In")).click();
            // driver.findElement(By.xpath("//*[@class='close']")).click();
            driver.findElement(By.partialLinkText("Log")).click();
            driver.close();

        }
        else
            System.out.println("sorry! you entered wrong browser");
    }

}
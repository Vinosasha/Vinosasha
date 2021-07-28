package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class justdail 
{

	public static void main(String[] args) throws InterruptedException
	{
		//LAUNCH WEBSITE...
        System.setProperty("webdriver.chrome.driver","C:\\seleniumwebdriver\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.justdial.com/sideMenu");
        System.out.println("Launching website");
        
        // MAXIMIZE THE WINDOW...
        driver.manage().window().maximize();
        System.out.println("Maximize the window");
        
        //CHECKING AUTOCARE
        driver.findElement(By.xpath("//span[@id='hotkeys_text_5']")).click();
        System.out.println("checking autocare");
   
        //WAIT
        Thread.sleep(1000);
        
        //SCROLL DOWN
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)");
        Thread.sleep(2000);
        System.out.println("Scroll down");
        
        //SCROLL UP
        js.executeScript("window.scrollBy(0, -400)");
        
        //USING DROPDOWN CHECKING ALL THE AUTOCARE
        WebElement drpdown=driver.findElement(By.xpath("//body/div[@id='']/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]"));
        drpdown.click();
        System.out.println("checking autocare");
       
        
        // CHECKING MAHENDRA AUTOCARE 
        driver.findElement(By.xpath("//*[@id=\"mnintrnlbnr\"]/ul[1]/li[6]/a/span[2]")).click();
        System.out.println("checking mahendra autocare");
       
        // USING SCROLL METHOD CHECKING ALL THE DETAILS OF MAHENDRA AUTOCARE
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(2000);
        System.out.println("scroll up");
        js.executeScript("window.scrollBy(0, -2000)");
        Thread.sleep(2000);
        System.out.println("Scroll down");
        
        //	CHECKING MAHENDRA SCROPIO
        driver.findElement(By.xpath("//*[@id=\"mnintrnlbnr\"]/ul[1]/li[7]/a/span[2]")).click();
        System.out.println("checking mahendra scorpio");
        Thread.sleep(1000);
        
        // SCROLL UP
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(2000);
        System.out.println("scroll up");
        
        // SCROLL DOWN
        js.executeScript("window.scrollBy(0, -2000)");
        Thread.sleep(2000);
        System.out.println("Scroll down");
        
        // NAVIAGATE TO BACK
                  driver.navigate().back();
                  System.out.println("Navigate to the previous page");
        
        //   CLOSE...
                  driver.close();
                  System.out.println("close the browser");
     
		
	}

}

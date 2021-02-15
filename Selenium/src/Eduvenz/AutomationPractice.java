package Eduvenz;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice {

  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "E:\\Software Testing Data\\Sele path\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");
    
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.manage().window().maximize();
    
     Thread.sleep(3000);
    WebElement Click = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
    Click.click();
    
    Thread.sleep(3000);
    String text = driver.findElement(By.xpath("//*[@id='short_description_content']/p")).getText();
     
    String dd = driver.findElement(By.xpath("//select[@name='group_1']")).getText();
      
    String ss = driver.findElement(By.xpath("//span[@id='our_price_display']")).getText();
    
    String ssss = ss.replace("$", "");
    double i = Double.parseDouble(ssss);
  
     if(text.contains("100%") && dd.contains("S") && i<=50 )
     {
       System.out.println(text);
       System.out.println(dd);
       System.out.println(i);
     }

  }
  }
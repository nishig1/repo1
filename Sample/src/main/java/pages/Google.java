package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Google 
{
	 
	  public void search()
	  {
			  
		  WebDriverManager.chromedriver().setup();
		  ChromeDriver driver=new ChromeDriver();		 
		  driver.manage().window().maximize();
		  driver.get("http://www.google.com");
		  driver.findElement(By.name("q")).sendKeys("java");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  }
  }


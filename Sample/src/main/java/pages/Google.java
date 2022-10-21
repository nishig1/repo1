package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Google 
{
	  String sbrowser=System.getProperty("browsername");	
	  WebDriver driver;
	  
	  public void setup()
	  {
		  if(sbrowser=="chrome")
		  {		  
			  WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
		  }
		   if(sbrowser=="firefox")
		  {		  
			  WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
		  }
		  
	  }
	  public void search()
	  {
		  if(sbrowser=="")
		  {
			  WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
		  }
		  driver.manage().window().maximize();
		  driver.get("http://www.google.com");
		  driver.findElement(By.name("q")).sendKeys("java");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  }
  }


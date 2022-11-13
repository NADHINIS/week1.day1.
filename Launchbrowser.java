package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {
	public static void main(String[] args) {
		//setup the path
		WebDriverManager.edgedriver().setup();
		//Create the object for Chromedriver
		EdgeDriver driver=new EdgeDriver();
		//window maximize
		driver.manage().window().maximize();
		//load URl


		driver.get("http://leaftaps.com/opentaps/control/login");
		 //Enter username
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			//Enter password
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			//click login button
			driver.findElement(By.id ("decorativeSubmit")).click();
			
			
	
	}

}


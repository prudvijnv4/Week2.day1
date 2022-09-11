package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import javatraining.day1.Chrome;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To set up the browser
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver = new ChromeDriver();
      driver.get("http://leaftaps.com/opentaps/control/login");
      driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
      driver.findElement(By.id("password")).sendKeys("crmsfa");
      driver.findElement(By.className("decorativeSubmit")).click();
      driver.findElement(By.linkText("CRM/SFA")).click();
      driver.findElement(By.linkText("Leads")).click();
      driver.findElement(By.linkText("Create Lead")).click();
      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhanu");
      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prakash");
      driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Raj");
      driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tool Testing");
      driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Selenium in Week 2 day 1 of class");
      driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("raj@infosys.com");
      WebElement findEL = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
      
      Select source = new Select(findEL);
      source.selectByVisibleText("New York");
      driver.findElement(By.name("submitButton")).click();
      
         
      driver.findElement(By.linkText("Duplicate Lead")).click();
      driver.findElement(By.id("createLeadForm_companyName")).clear();
      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Delloit");
      driver.findElement(By.id("createLeadForm_firstName")).clear();
      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sai");
      driver.findElement(By.name("submitButton")).click();
      
      String title = driver.getTitle();
      System.out.println("Title of the web page is :"+ " " + title);      
      
            
	}
}

package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To set up web browser
		 WebDriverManager.chromedriver().setup();
		 
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("http://leaftaps.com/opentaps/control/login");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     driver.findElement(By.className("decorativeSubmit")).click();
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     driver.findElement(By.linkText("Leads")).click();
	     driver.findElement(By.linkText("Create Lead")).click();
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Delta");
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepak");
	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pramod");
	     driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Raj");
	     driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	     driver.findElement(By.id("createLeadForm_description")).sendKeys(" Testing with Selenium");
	     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("raj@xyz.com");
	     WebElement findEl = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	     
	     Select state = new Select(findEl);
	     state.selectByValue("CA");
	    driver.findElement(By.name("submitButton")).click();
	     
	    String title = driver.getTitle();
	    System.out.println("Title of the page is : " + " " + title);
	    
	    //driver.findElement(By.className("submitButton")).click();
	       //WebElement isSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
	       //Select idSource = new Select(isSource);
	       //idSource.selectByValue("LEAD_CONFERENCE");
	       //driver.close();
	       //driver.findElement(By.name("submitButton")).click();
	       //String tex = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	       //System.out.println(tex);
	       
	       //if (tex.equals(name)) {
	    	//   System.out.println(true);
	      // } else {
	    	//   System.out.println(false);
	       }
	       //driver.findElement(By.className("label")).click();
	       //driver. 

	}

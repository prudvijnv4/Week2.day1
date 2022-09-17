package week2.day1;

import java.time.Duration;

import org.apache.commons.lang.time.DurationFormatUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
//		String str = "My name is Raj";
//		String[] spli = str.split(" ");
//		for (int i=0; i<spli.length;i++) {
//			if (i == (spli.length-1)) {
//				System.out.println("The last word is :" + " "+ spli[i]);
//			}
//		}
     WebDriverManager.chromedriver().setup();
     ChromeDriver chDriver = new ChromeDriver();
     chDriver.manage().window().maximize();
     chDriver.get("https://en-gb.facebook.com/");
     chDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     chDriver.findElement(By.xpath("//a[@class = '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
     chDriver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Bhanu");
     chDriver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Prakash");
     chDriver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("bhanu@xyz.com");
     chDriver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("CAD@DEP");
     WebElement findDate = chDriver.findElement(By.xpath("//select[@name='birthday_day']"));
     Select seleDate = new Select(findDate);
     seleDate.selectByValue("21");
    
     WebElement findMonth = chDriver.findElement(By.xpath("//select[@name='birthday_month']"));
     Select seleMonth = new Select(findMonth);
     seleMonth.selectByVisibleText("Jun");
     
     WebElement findYear = chDriver.findElement(By.xpath("//select[@name='birthday_year']"));
     Select seleYear = new Select(findYear);
     seleYear.selectByValue("2021");
     
     WebElement genderCheck = chDriver.findElement(By.xpath("//input[@value='2']"));
     genderCheck.click();
     
     chDriver.close();
     
     }

}

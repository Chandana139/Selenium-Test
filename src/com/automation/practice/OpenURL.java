package com.automation.practice;

import java.io.File;

import java.util.concurrent.TimeUnit;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.util.Set;

 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class OpenURL {

	public static void main(String[] args) throws InterruptedException,IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\JAHARICH\\eclipse-workspace\\SeleniumTest\\src\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
TakesScreenshot t=(TakesScreenshot)driver;     
File src=t.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\JAHARICH\\Pictures\\Screenshots\\hari\\ren.png");
FileUtils.copyFile(src, dest);


//giving url
//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//maximising the website screen
//driver.manage().window().maximize();
//geting title of website
//String str=driver.getTitle();
//printing the url
//System.out.println(str);
//System.out.println(driver.getCurrentUrl());
//asking browser to wait
//Thread.sleep(5000);
//filling username field with the value"Admin" by knowing the name of the field through inspect
//driver.findElement(By.name("username")).sendKeys("Admin");
//filling password field with the value"admin123" by knowing the name of the field through inspect
//driver.findElement(By.name("password")).clickable.click("admin123");
//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//driver.findElement(By.xpath("//button[@type='submit']")).click();
//Thread.sleep(5000);
//driver.findElement(By.xpath("//span[text()='PIM']")).click();
//driver.get("https://demowebshop.tricentis.com/login");
//driver.findElement(By.xpath("//a[contains(text(),'4')])[5]"));
//driver.manage().window().maximize();
//String str=driver.getTitle();
//System.out.println(str);
//System.out.println(driver.getCurrentUrl());
//Thread.sleep(3000);
//driver.findElement(By.xpath("(//a[contains(text(),'Changelog')])[5]")).sendKeys("JavaScript");
//driver.findElement(By.xpath("(//a[text()='API Docs'])[5]")).click();
//driver.findElement(By.xpath("//a[@class='ico-register']")).click();
//Thread.sleep(3000);
/*driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Hari");
driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Jangareddi");
driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("harichandanajang71@gmail.com");
driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Jangareddi");
driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Chandu@1357");
driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Chandu@1357");	
driver.findElement(By.xpath("//input[@class='button-1 register-next-step-button']")).click();
driver.findElement(By.xpath("(//a[contains(text(),'Books')])")).click();
driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();*/
//Get the main window handle
//driver.get("https://www.amazon.com/");
//driver.manage().window().maximize();
//String str=driver.getTitle();
//System.out.println(str);
//System.out.println(driver.getCurrentUrl());
//driver.findElement(By.xpath("//a[@class='a-button-text']")).click();
//driver.findElement(By.xpath("//a[@class='a-button-text']")).click();
//driver.findElement(By.xpath("//a[@class='hmenu-item']")).click();

//driver.findElement(By.xpath("//span[text()='Sign in']")).click();
//driver.findElement(By.xpath("//a[@class='a-button-text']")).click();

/*driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("Harichandana");
driver.findElement(By.xpath("//input[@class='a-input-text a-span12 a-spacing-micro auth-required-field auth-require-claim-validation']")).sendKeys("harichandanajangareddi71@gmail.com");
driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-required-field auth-require-fields-match auth-require-password-validation']")).sendKeys("Chandu@1357");
driver.findElement(By.xpath("//input[@class='//input[@class='a-input-text a-span12 auth-required-field auth-require-fields-match']']")).sendKeys("Chandu@1357");*/


/*String mainWindowHandle = driver.getWindowHandle();//address of Parent window



//Now perform operation which opens child window like clicking on a link or button.



//Switch to child window and close it
set<String> child=driver.getWindowHandles();//address of child window




if(!child.equals(mainWindowHandle)){
driver.switchTo().window(child);



  break;




}*/



        }

 







	}


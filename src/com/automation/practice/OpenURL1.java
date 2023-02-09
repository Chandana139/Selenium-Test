package com.automation.practice;

 

import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

 

public class OpenURL1 {

 

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\JAHARICH\\eclipse-workspace\\SeleniumTest\\src\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/JAHARICH/Documents/hari.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        WebElement dropdown=driver.findElement(By.xpath("//select[@id='slv']"));
        Select sel=new Select(dropdown);
        sel.selectByIndex(2);
        Thread.sleep(5000);
        sel.selectByValue("k");
        Thread.sleep(5000);
        sel.deselectAll();
        //move to
        /*driver.get("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        Actions act=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
        act.moveToElement(element).perform();*/
        //double click
        /*driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        Actions act=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        act.doubleClick(element).perform();*/
        //drag and drop
        /*driver.get("https://demoqa.com/droppable/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        Actions act=new Actions(driver);
        WebElement src_element=driver.findElement(By.xpath("//div[text()='Drag me']"));
        WebElement target_element=driver.findElement(By.xpath("//p[text()='Drop here']"));
        act.dragAndDrop(src_element, target_element).perform();*/
        
        

 

         

 

        

 

    }

 

    private static void Driver() {
        // TODO Auto-generated method stub

    }

 

}

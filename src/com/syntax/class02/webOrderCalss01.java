package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderCalss01 {
   // System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
       //driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");


        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        //username.sendKeys("Tester");
       // driver.findElement(By.id("ctl00_MainContent_password"));.sendKeys("test");
      //  driver.findElements(By.ByClassName("button")).click();
}

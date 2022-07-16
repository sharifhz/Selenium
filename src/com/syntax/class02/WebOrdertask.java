package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrdertask
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");


        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        String title= driver.getTitle();
        String expectedtitle="Web Orders";
        if(title.equals(expectedtitle)){
            System.out.println("title is coorect");

        }else{
            System.out.println("title is wrong");
        }

        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }
}

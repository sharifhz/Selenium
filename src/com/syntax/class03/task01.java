package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task01 {



    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");

        WebElement startpractising = driver.findElement(By.linkText("Start Practising"));
        startpractising.click();
        Thread.sleep(2000);

        WebElement simpleFormDemo = driver.findElement(By.xpath("(//a[@href='basic-first-form-demo.php'])[2]"));
        simpleFormDemo.click();
        Thread.sleep(5000);



        WebElement enterMessage = driver.findElement(By.id("user-message"));
        enterMessage.sendKeys("sjfd");
        Thread.sleep(5000);


        WebElement showMessage=driver.findElement(By.xpath("//button[text()='Show Message']"));
        showMessage.click();
        Thread.sleep(4000);
        driver.quit();


    }
}

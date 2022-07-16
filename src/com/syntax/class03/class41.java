package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class41 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username =driver.findElement(By.id("//input[@id='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.id("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
       WebElement login= driver.findElement(By.id("//input[@id='btnLogin']"));
       login.click();


    }
}

package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxiMizeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://www.amazon.com");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
    }
}

package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String titel = driver.getTitle();
        System.out.println(titel);
        driver.quit();
    }
}

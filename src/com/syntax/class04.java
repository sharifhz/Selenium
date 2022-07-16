package com.syntax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class class04 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");
        List<WebElement> alllinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of links " + alllinks.size());
        for (WebElement link : alllinks) {
            String linkText = link.getText();
            String fulllink= link.getAttribute("href");
            if (!linkText.isEmpty()) {
                System.out.println(linkText +"  "+ fulllink);
            }

        }
    }
}

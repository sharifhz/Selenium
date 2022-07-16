package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=6D38948FF42181FDDFF02AFE0BF29824");
        driver.findElement(By.id("customer.firstName")).sendKeys("sharif@bbc.com");
        driver.findElement(By.id("customer.lastName")).sendKeys("hz");
        driver.findElement(By.id("customer.address.street")).sendKeys("3652");
        driver.findElement(By.id("customer.address.city")).sendKeys("jax");
        driver.findElement(By.id("customer.address.state")).sendKeys("fl");
        driver.findElement(By.id("customer.address.state")).sendKeys("52141");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("520-548-4242");
        driver.findElement(By.name("customer.ssn")).sendKeys("4152667");
        driver.findElement(By.id("customer.username")).sendKeys(("sharif02"));
        driver.findElement(By.name("customer.password")).sendKeys("12345678");
        driver.findElement(By.id("repeatedPassword")).sendKeys("12345678");
        driver.findElement(By.className("button")).click();
        Thread.sleep(4000);
        driver.close();
    }
}

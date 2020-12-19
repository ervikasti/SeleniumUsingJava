package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import util.Base;


public class OrangeHRM extends Base {

    @Test
    public void login()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement log = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
        log.sendKeys("admin");
      driver.findElement(By.id("txtPassword")).sendKeys("admin123");
      driver.findElement(By.id("btnLogin")).submit();
    }
    @Test
    public void logout()
    {
        driver.findElement(By.id("welcome")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.linkText("Logout")).click();

    }


}

package com.company;

import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Practise2 {
    public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\draka\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.navigate().to("https://github.com/");

      //Searching For Github Respository
        //driver.findElement(By.name("q")).click();

      //Getting link Test
      driver.findElement(By.linkText("Sign up")).click();
      //System.out.println(driver.getCurrentUrl());
      //driver.navigate().forward();
       driver.close();
    }
}

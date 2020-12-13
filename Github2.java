package com.company;
// Here we are going to find elements using CSS Selector
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Github2 {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\draka\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.navigate().to("https://github.com/");
    //Clicking on Sign in
        driver.findElement(By.linkText("Sign in")).click();
   //Below is error
        // driver.findElement(By.cssSelector("input[name]")).sendKeys("ervikasti@gmail.com");

    //driver.close();


    }
}

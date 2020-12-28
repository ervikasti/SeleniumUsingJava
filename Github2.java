package com.company;
// Here we are going to find elements using CSS Selector
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Github2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
    System.setProperty("webdriver.chrome.driver","write complete path of chrome driver including .exe ex. C:\\Users\\draka\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.navigate().to("https://github.com/");
    //Clicking on Sign in
        driver.findElement(By.linkText("Sign in")).click();
   //Click on username
        System.out.print("Enter the UserName : ");
        driver.findElement(By.name("login")).sendKeys(s1.nextLine());
   //Click on password
        System.out.print("Enter the Password : ");
        driver.findElement(By.name("password")).sendKeys(s1.nextLine());
    //Click on Login
        driver.findElement(By.name("commit")).click();


    //driver.close();


    }
}

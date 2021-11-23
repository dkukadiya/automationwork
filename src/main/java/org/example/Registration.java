package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration
{
    static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Type the Url
        driver.get("https://demo.nopcommerce.com/");
        //Click on register button
        driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']")).click();
        //Type Firstname
        driver.findElement(By.id("FirstName")).sendKeys("Viral");
        // Type last name
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        //Type email address
        driver.findElement(By.id("Email")).sendKeys("dkukadiya@gmail.com");
        //Type Password
        driver.findElement(By.id("Password")).sendKeys("viraj123");
        //Type Confirm Password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("viraj123");
        //Click on register button
        driver.findElement(By.id("register-button")).click();
        //Print the Registion completed messages
        String actualtext= driver.findElement(By.xpath("//div[@class='result']")).getText();
        System.out.println(actualtext);
        //Close the window
        driver.close();
    }
}

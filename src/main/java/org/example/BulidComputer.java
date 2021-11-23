package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BulidComputer
{

static WebDriver driver;

public static void main(String[] args)
{
    System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    //Type the Url
    driver.get("https://demo.nopcommerce.com/");
    //Click on computer menu bar
    driver.findElement(By.linkText("Computers")).click();
    //Select the Desktops
    driver.findElement(By.linkText("Desktops")).click();
    //click on the Build your own computer
    driver.findElement(By.linkText("Build your own computer")).click();
    //print the Build your own computer
    String actualtext=driver.findElement(By.xpath("//div[@class='product-name']/h1")).getText();
    System.out.println(actualtext);
    //Close the window
    driver.close();
}}



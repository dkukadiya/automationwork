package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsComments
{
    static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        //Type the Url
        driver.get("https://demo.nopcommerce.com/");
        //Click on New online store is open
        driver.findElement(By.linkText("New online store is open!")).click();
        //Type the Title in Title field
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Books");
        //Type the Comment in commentfield box
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("This Books product is really interesting and good price aswell.");
        //Click on the  new Comment button
        driver.findElement(By.xpath("//div/button[@class=\"button-1 news-item-add-comment-button\"]")).click();
        //print the 'Message News comment is successfully added' in the concole
        String actualtext=driver.findElement(By.xpath("//div[@class='result']")).getText();
        System.out.println(actualtext);
        //Close the window
        driver.close();
    }}



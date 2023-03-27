package com.example.demo3;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class MainPageTest {
    private WebDriver driver;
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.edge.driver","src/test/Driver/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://nps.monoroc.com/");

        new MainPage(driver);
    }

   @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void Login_valid() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/input")).sendKeys("nps@admin.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[2]/input")).sendKeys("1234");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);
        String at = driver.getTitle();
        String et = "Avenir Health - NPS Monitor System";
        System.out.println("get Titile :"+at);
        if(at.equals(et))
        {
            System.out.println("Test Successful");
        }else{
            System.out.println("Test Failuar");
        }
    }

    @Test
    public void InvalidUsername_Login() throws InterruptedException {


        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/input")).sendKeys("nps@125.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[2]/input")).sendKeys("1234");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);
       driver.findElement(By.xpath("/html/body/div/div[1]")).isDisplayed();
    }

    @Test
    public void InvalidPassword_Login() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/input")).sendKeys("nps@admin.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[2]/input")).sendKeys("0000");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div[1]")).isDisplayed();
    }

    @Test
    public void Nullusername_Login() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/input")).sendKeys("");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[2]/input")).sendKeys("0000");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);
    }

    @Test
    public void NullPassword_Login() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/input")).sendKeys("nps@admin.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[2]/input")).sendKeys("");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);
    }


   
}

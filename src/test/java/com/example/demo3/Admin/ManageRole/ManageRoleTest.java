package com.example.demo3.Admin.ManageRole;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ManageRoleTest {

    private static WebDriver driver;
    @BeforeMethod
    public void setup()
    {
        System.setProperty("webdriver.edge.driver","src/test/Driver/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://nps.monoroc.com/");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }


    public static  void Logincode() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/input")).sendKeys("nps@admin.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[2]/input")).sendKeys("1234");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[1]/ul/a[2]")).click();
        Thread.sleep(2000);
    }


    @Test
    public void SearchRole() throws InterruptedException {
    Logincode();
    driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[1]/input")).sendKeys("assistant");
    }

    @Test
    public  void CreateNewNullRole() throws InterruptedException {
        Logincode();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/small")).isDisplayed();
    }

    @Test
    public void CreateNewRole() throws InterruptedException {
        Logincode();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/input")).sendKeys("admin1");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
    }

    @Test
    public void UpdateRole() throws InterruptedException {
        Logincode();
        driver.findElement(By.cssSelector(".table-body > tr:nth-child(1) > td:nth-child(3) > svg:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/input")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/input")).sendKeys("survey creator");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
    }
//this must re checked//
    @Test
    public void UpdateRoleNullValue() throws InterruptedException {
        Logincode();
        driver.findElement(By.cssSelector(".table-body > tr:nth-child(1) > td:nth-child(3) > svg:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/input")).clear();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/small")).isDisplayed();
    }

    @Test
    public void DeleteRole() throws InterruptedException {
        Logincode();
        driver.findElement(By.cssSelector(".table-body > tr:nth-child(1) > td:nth-child(3) > svg:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
    }
}

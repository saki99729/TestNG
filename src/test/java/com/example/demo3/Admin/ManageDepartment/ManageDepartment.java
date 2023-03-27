package com.example.demo3.Admin.ManageDepartment;

import com.example.demo3.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ManageDepartment {
    private static WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.edge.driver", "src/test/Driver/msedgedriver.exe");
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

    public static void Logincode() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/input")).sendKeys("nps@admin.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[2]/input")).sendKeys("1234");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[1]/ul/a[4]/li")).click();
        Thread.sleep(2000);
    }


    @Test
    public void createDepartment() throws InterruptedException {
        Logincode();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/input")).sendKeys("newLab");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
    }

    @Test
    public void UpdateDepartment() throws InterruptedException {
        Logincode();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".table-body > tr:nth-child(6) > td:nth-child(3) > svg:nth-child(1)")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/input")).clear();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/input")).sendKeys("newCoreLab");
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
    }

    @Test
    public  void deleteDepartmet()
    {
        driver.findElement(By.cssSelector(".table-body > tr:nth-child(6) > td:nth-child(3) > svg:nth-child(2)")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
    }

}

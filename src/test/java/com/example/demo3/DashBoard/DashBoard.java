package com.example.demo3.DashBoard;

import com.example.demo3.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DashBoard {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "src/test/Driver/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://nps.monoroc.com/home/");
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/input")).sendKeys("nps@admin.com");
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[2]/input")).sendKeys("1234");
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);
        NpsMonorocHomePage npsMonorocHomePage = new NpsMonorocHomePage(driver);
    }

   @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void SurveyDepartmentwise()
    {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/div[3]/div[1]")).click();
    }

}





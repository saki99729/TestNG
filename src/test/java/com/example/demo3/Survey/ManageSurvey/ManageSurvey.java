package com.example.demo3.Survey.ManageSurvey;

import com.example.demo3.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ManageSurvey {
    private static WebDriver driver;
    private static WebElement element;

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
    @Test
    public static void Logincode() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/input")).sendKeys("nps@survey.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[2]/input")).sendKeys("1234");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(1000);
       driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[1]/ul/a[2] ")).click();
         Thread.sleep(2000);
    }
    @Test
    public static void  createManageSurvey() throws InterruptedException {
        Logincode();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[1]/input")).sendKeys("sakila");
         element = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/select"));
        {
            Select select = new Select(element);
            select.selectByValue("7");
            select.selectByVisibleText("Cashier");
            select.selectByIndex(2);
        }
         element = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[3]/select"));
        {
            Select select = new Select(element);
            select.selectByValue("public");
            select.selectByVisibleText("Public");
            select.selectByIndex(1);
        }


        //question
        for (int x=0; x<=3;x++) {
            driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[2]/div[1]/button")).click();
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/input")).sendKeys("sakila"+x+"");
            element = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/select"));
            {
                Select select = new Select(element);
                select.selectByValue("rating");
                select.selectByVisibleText("Rating");
                select.selectByIndex(1);
            }
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[3]/input")).sendKeys("10");
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[4]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
            Thread.sleep(2000);
        }
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/button[2]")).click();
    }


    @Test
    public static void  createManageSurveyNullname() throws InterruptedException {
        Logincode();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[1]/button")).click();

        element = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/select"));
        {
            Select select = new Select(element);
            select.selectByValue("7");
            select.selectByVisibleText("Cashier");
            select.selectByIndex(2);
        }
        element = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[3]/select"));
        {
            Select select = new Select(element);
            select.selectByValue("public");
            select.selectByVisibleText("Public");
            select.selectByIndex(1);
        }


        //question
        for (int x=0; x<=3;x++) {
            driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[2]/div[1]/button")).click();
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/input")).sendKeys("sakila"+x+"");
            element = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/select"));
            {
                Select select = new Select(element);
                select.selectByValue("rating");
                select.selectByVisibleText("Rating");
                select.selectByIndex(1);
            }
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[3]/input")).sendKeys("10");
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[4]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
            Thread.sleep(2000);
        }
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[1]/small")).isDisplayed();
    }

    @Test
    public static void  createManageSurveyDepartment() throws InterruptedException {
        Logincode();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[1]/input")).sendKeys("sakila");

        element = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[3]/select"));
        {
            Select select = new Select(element);
            select.selectByValue("public");
            select.selectByVisibleText("Public");
            select.selectByIndex(1);
        }


        //question
        for (int x=0; x<=3;x++) {
            driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[2]/div[1]/button")).click();
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/input")).sendKeys("sakila"+x+"");
            element = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/select"));
            {
                Select select = new Select(element);
                select.selectByValue("rating");
                select.selectByVisibleText("Rating");
                select.selectByIndex(1);
            }
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[3]/input")).sendKeys("10");
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[4]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
            Thread.sleep(2000);
        }
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/button[2]")).click();
    }

    @Test
    public static void  createManageSurveyType() throws InterruptedException {
        Logincode();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[1]/input")).sendKeys("sakila");
        element = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/select"));
        {
            Select select = new Select(element);
            select.selectByValue("7");
            select.selectByVisibleText("Cashier");
            select.selectByIndex(2);
        }

        //question
        for (int x=0; x<=3;x++) {
            driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[2]/div[1]/button")).click();
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/input")).sendKeys("sakila"+x+"");
            element = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/select"));
            {
                Select select = new Select(element);
                select.selectByValue("rating");
                select.selectByVisibleText("Rating");
                select.selectByIndex(1);
            }
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[3]/input")).sendKeys("10");
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[4]/input")).sendKeys("1");
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
            Thread.sleep(2000);
        }
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/button[2]")).click();
    }

    @Test
    public static void  createManageSurveyNullQuestion() throws InterruptedException {
        Logincode();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[1]/input")).sendKeys("sakila");
        element = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/select"));
        {
            Select select = new Select(element);
            select.selectByValue("7");
            select.selectByVisibleText("Cashier");
            select.selectByIndex(2);
        }
        element = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[3]/select"));
        {
            Select select = new Select(element);
            select.selectByValue("public");
            select.selectByVisibleText("Public");
            select.selectByIndex(1);
        }

        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/button[2]")).click();
    }
    @Test
    public void DeleteSurveyManagement() throws InterruptedException {
        Logincode();
    }

}

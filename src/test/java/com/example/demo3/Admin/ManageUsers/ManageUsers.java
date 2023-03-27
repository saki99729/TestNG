package com.example.demo3.Admin.ManageUsers;

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

public class ManageUsers {
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
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[1]/ul/a[3]")).click();
        Thread.sleep(2000);
    }

    @Test
    public void createnewUsers() throws InterruptedException {
        Logincode();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input")).sendKeys("sakila");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/select"));
        {
            Select select = new Select(element);
            select.selectByValue("2");
            select.selectByVisibleText("survey creator");
            select.selectByIndex(1);
        }

        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[3]/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[4]/div/button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
    }

    @Test
    public void createnewUsersNullValueName() throws InterruptedException {
        Logincode();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[1]/button")).click();
        Thread.sleep(2000);


        WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/select"));
        {
            Select select = new Select(element);
            select.selectByValue("2");
            select.selectByVisibleText("survey creator");
            select.selectByIndex(1);
        }

        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[3]/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[4]/div/button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/small")).isDisplayed();
    }

    @Test
    public void createnewUsersNullRoles() throws InterruptedException {
        Logincode();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input")).sendKeys("sakila");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[3]/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[4]/div/button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/small")).isDisplayed();
    }

    @Test
    public void createnewUsersNullGenerateUsername() throws InterruptedException {
        Logincode();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input")).sendKeys("sakila");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/select"));
        {
            Select select = new Select(element);
            select.selectByValue("2");
            select.selectByVisibleText("survey creator");
            select.selectByIndex(1);
        }


        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[4]/div/button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[3]/small")).isDisplayed();

    }
    @Test
    public void createnewUsersNullPassword() throws InterruptedException {
        Logincode();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input")).sendKeys("sakila");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/select"));
        {
            Select select = new Select(element);
            select.selectByValue("2");
            select.selectByVisibleText("survey creator");
            select.selectByIndex(1);
        }

        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[3]/div/button")).click();


        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[4]/small")).isDisplayed();
    }
    @Test
    public void UpdateRoles() throws InterruptedException {
        Logincode();
        driver.findElement(By.cssSelector(".table-body > tr:nth-child(6) > td:nth-child(5) > svg:nth-child(2)")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input")).sendKeys("sakila1234");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/select"));
        {
            Select select = new Select(element);
            select.selectByValue("3");
            select.selectByVisibleText("assistant");
            select.selectByIndex(2);
        }
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
    }

    @Test
    public void DeleteRoles() throws InterruptedException {
        Logincode();
        driver.findElement(By.cssSelector(".table-body > tr:nth-child(6) > td:nth-child(5) > svg:nth-child(3)")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
    }

    @Test
    public void SearchRoles() throws InterruptedException {
        Logincode();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[1]/input")).sendKeys("NPS Survey");
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[2]/table/tbody/tr/td[2]")).isDisplayed();
    }

    @Test
    public void ResetData() throws InterruptedException {
        Logincode();
        driver.findElement(By.cssSelector(".table-body > tr:nth-child(7) > td:nth-child(5) > svg:nth-child(1)")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
    }
}

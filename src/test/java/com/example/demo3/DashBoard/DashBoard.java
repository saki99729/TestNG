package com.example.demo3.DashBoard;

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

public class DashBoard {
    private static WebDriver driver;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.edge.driver","src/test/Driver/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://nps.monoroc.com/");

    }

  /*  @AfterMethod
    public void tearDown() {
        driver.quit();
    }*/

    @Test
    public void SurveyDepartmentwise()
    {
    }

    @Test
    public void mostRatedQuestion() throws InterruptedException
    {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/input")).sendKeys("nps@admin.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[2]/input")).sendKeys("1234");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(1000);
        

        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div[2]/div/select")).click();
        WebElement element = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div[2]/div/select"));{
            Select select = new Select(element);
            select.selectByValue("5");
            select.selectByVisibleText("Admission Room");
            select.selectByIndex(1);
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div[2]/div/button[1]")).click();
        Thread.sleep(5000);
    }

    @Test
    public void clear() throws InterruptedException
    {driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/input")).sendKeys("nps@admin.com");
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[2]/input")).sendKeys("1234");
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[3]/button")).click();
    Thread.sleep(1000);
    

    driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div[2]/div/select")).click();
    WebElement element = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div[2]/div/select"));{
        Select select = new Select(element);
        select.selectByValue("5");
        select.selectByVisibleText("Admission Room");
        select.selectByIndex(1);
    }
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div[2]/div/button[1]")).click();
    Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div[2]/div/select")).clear();
    }

    @Test
    public void LowRatedQuestion() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/input")).sendKeys("nps@admin.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[2]/input")).sendKeys("1234");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(1000);


        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div[3]/div/select")).click();
        WebElement element = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div[3]/div/select"));{
        Select select = new Select(element);
        select.selectByValue("5");
        select.selectByVisibleText("Admission Room");
        select.selectByIndex(1);
    }
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div[3]/div/button[1]")).click();
        Thread.sleep(5000);
    }

    @Test
    public static void SurveyDepartmentChartFilter() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[1]/input")).sendKeys("nps@admin.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[2]/input")).sendKeys("1234");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(1000);


        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/select")).click();
        WebElement element = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/select"));{
        Select select = new Select(element);
        select.selectByValue("5");
        select.selectByVisibleText("Admission Room");
        select.selectByIndex(1);
    }
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/button[1]")).click();
        Thread.sleep(5000);
    }

@Test
    public void DownloadSurveyDepartmentChartFilter() throws InterruptedException {
        SurveyDepartmentChartFilter();
        Thread.sleep(2000);

    }

}





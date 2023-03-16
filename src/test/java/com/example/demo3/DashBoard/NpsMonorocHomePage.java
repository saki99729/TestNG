package com.example.demo3.DashBoard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://nps.monoroc.com/home
public class NpsMonorocHomePage {

    public NpsMonorocHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
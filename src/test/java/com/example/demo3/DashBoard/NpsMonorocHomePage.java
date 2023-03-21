package com.example.demo3.DashBoard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

// page_url = https://nps.monoroc.com/
public class NpsMonorocHomePage {

    public NpsMonorocHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
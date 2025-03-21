package com.thetestingacademy.ex01_SeleniumBasic;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program_003 {

    @Description("Using Navigate methods")
    @Test
    public void test_003(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();


    }
}

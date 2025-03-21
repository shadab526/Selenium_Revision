package com.thetestingacademy.ex01_SeleniumBasic;

import io.qameta.allure.Description;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program_002 {

    @Description("Basic Test for Get Method")
    @Test
    public void test_case_001(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
       // driver.manage().deleteAllCookies();
        Dimension d = new Dimension(500,500);
        driver.manage().window().setSize(d);
        Point p = new Point(250,250);
        driver.manage().window().setPosition(p);
        driver.manage().window().maximize();
    }
}

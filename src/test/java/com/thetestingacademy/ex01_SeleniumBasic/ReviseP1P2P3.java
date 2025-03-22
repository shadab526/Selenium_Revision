package com.thetestingacademy.ex01_SeleniumBasic;

import io.qameta.allure.Description;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReviseP1P2P3 {

    @Description("Revision for Previous Program")
    @Test
    public void test_001_GetTitle(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
    }
    @Test
    public void test_002_SetPosition(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Dimension d = new Dimension(500,500);
        driver.manage().window().setSize(d);
        Point p = new Point(250,250);
        driver.manage().window().setPosition(p);
    }
    @Test
    public void test_003_Navigate(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}

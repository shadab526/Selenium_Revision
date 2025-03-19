package com.thetestingacademy.ex01_SeleniumBasic;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestPrintTitle {
    @Description("Open the URL and get the title")
    @Test
    public void test_title(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");
        System.out.println(driver.getTitle());
        driver.close();
    }
}

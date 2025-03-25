package com.thetestingacademy.ex02_Handling_DropDowns.StaticDropdown;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Program_005 {
    @Description("Selecting Dropdown with increase and decrease option ")
    @Test
    public void test_005(){
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(05));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hrefIncAdt")));
        for(int i=1; i<5; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        driver.close();
    }
}

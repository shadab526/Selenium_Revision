package com.thetestingacademy.ex02_Handling_DropDowns.DynamicDropdown;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Program_006 {

    @Description("Handling Dynamic Dropdown")
    @Test
    public void test_006(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(05));
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@value='BLR']")));
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@value='MAA'])[2]")));
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        ////div[@class='css-1dbjc4n r-b5h31w r-95jzfe']

    }
}

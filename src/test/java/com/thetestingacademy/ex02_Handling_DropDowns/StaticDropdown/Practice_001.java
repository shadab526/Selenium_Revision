package com.thetestingacademy.ex02_Handling_DropDowns.StaticDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_001 {


    @Test
    public void test_dropdown() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        WebElement country = driver.findElement(By.xpath("//select"));
        Select dropdown = new Select(country);
        dropdown.selectByValue("IND");
        Thread.sleep(3000);
        driver.close();

    }
}

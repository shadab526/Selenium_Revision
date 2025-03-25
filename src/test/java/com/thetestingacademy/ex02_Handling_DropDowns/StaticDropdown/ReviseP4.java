package com.thetestingacademy.ex02_Handling_DropDowns.StaticDropdown;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ReviseP4 {

    @Description("Revision Static Dropdown")
    @Test
    public void test_005(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select s = new Select(dropdown);
        s.selectByVisibleText("AED");
        System.out.println(s.getFirstSelectedOption().getText());
        s.selectByIndex(1);
        System.out.println(s.getFirstSelectedOption().getText());
        s.selectByValue("USD");
        System.out.println(s.getFirstSelectedOption().getText());

    }
}

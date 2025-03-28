package com.thetestingacademy.ex02_Handling_DropDowns.AutoSugeestiveDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Practice_002 {

    @Test
    public void test_P1(){
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(05));
        driver.get("https://www.tutorialspoint.com/selenium/practice/auto-complete.php");
        driver.findElement(By.id("tags")).sendKeys("a");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']/li")));
        List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
        for(WebElement option: options){
            if(option.getText().equalsIgnoreCase("AppleScript")){
                option.click();
                break;
            }
        }
        

    }
}

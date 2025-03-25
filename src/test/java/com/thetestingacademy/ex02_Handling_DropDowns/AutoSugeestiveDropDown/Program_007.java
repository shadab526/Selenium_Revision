package com.thetestingacademy.ex02_Handling_DropDowns.AutoSugeestiveDropDown;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Program_007 {

    @Description("Test Auto suggestive dropdown")

    @Test
    public void test_from() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(05));
        driver.get("https://www.makemytrip.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("commonModal__close")));
        try {
            WebElement closePopup = driver.findElement(By.className("commonModal__close"));
            closePopup.click();
        } catch (Exception e) {
            System.out.println("No Popup found, continue....");
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromCity")));
        driver.findElement(By.id("fromCity")).click();

        WebElement From = driver.findElement(By.xpath("//input[@placeholder='From']"));
        From.sendKeys("Varanasi");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul[@class='react-autosuggest__suggestions-list']/li)[1]")));
        Thread.sleep(2000);
        From.sendKeys(Keys.ARROW_DOWN);
        From.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toCity")));
        driver.findElement(By.id("toCity")).click();
        WebElement inputToField = driver.findElement(By.xpath("//input[@placeholder='To']"));
        inputToField.sendKeys("Mumbai");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li")));
        //List<WebElement> options = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
        inputToField.sendKeys(Keys.ARROW_DOWN);
        inputToField.sendKeys(Keys.ENTER);
        driver.close();


    }

}

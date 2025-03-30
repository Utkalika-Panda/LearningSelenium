package com.utkalikapanda.MiniProject;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VWO_LoginScreen {

    @Test
    @Description
    @Owner("Utkalika")
    public void VWOlogin() throws Exception{
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--Incognito");
        WebDriver driver= new ChromeDriver(chromeOptions);
        driver.navigate().to("https://app.vwo.com/#/login");

        WebElement Email_address = driver.findElement(By.id("login-username"));
        Email_address.sendKeys("Utkalika");

        WebElement Password = driver.findElement(By.id("login-password"));
        Password.sendKeys("Utkalika");

        WebElement Sign_In = driver.findElement(By.id("js-login-btn"));
        Sign_In.click();

        WebElement Error_message = driver.findElement(By.className("notification-box-description"));
        Password.click();

        Thread.sleep(3000);

        Assert.assertEquals(Error_message.getText(),"Your email, password, IP address or location did not match");
       driver.quit();
    }
}

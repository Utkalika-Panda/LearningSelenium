package com.utkalikapanda.SeleniumMiniproject1;


import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest {
    @Test
    @Description("Verify herokuapp login functionality")
    @Owner("Utkalika")
    public  void test(){
        WebDriver driver = new EdgeDriver();
                driver.get("https://katalon-demo-cura.herokuapp.com/");
                driver.manage().window().maximize();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        driver.quit();
    }
}

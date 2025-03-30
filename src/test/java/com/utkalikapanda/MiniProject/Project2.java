package com.utkalikapanda.MiniProject;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Project2{
    @Test
    @Description
    @Owner("Utkalika")

    public void Verify_Test () {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.bing.com/");
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.quit();
    }
}

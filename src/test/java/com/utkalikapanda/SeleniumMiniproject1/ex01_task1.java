package com.utkalikapanda.SeleniumMiniproject1;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import static org.assertj.core.api.Assertions.*;


import org.testng.annotations.Test;

public class ex01_task1 {
    @Test
    @Description ("Verify the login Functionality")
    @Owner("Utkalika")
    public  void Login_Functionality(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
     assertThat(driver.getCurrentUrl()).isNotNull().isNotBlank().isEqualTo("https://katalon-demo-cura.herokuapp.com/");
     driver.quit();
    }
}

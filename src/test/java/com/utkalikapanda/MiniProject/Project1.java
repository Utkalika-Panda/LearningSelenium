package com.utkalikapanda.MiniProject;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project1 {
    @Test
    @Description ("Verify the page sources")
    @Owner("utkalika")

    public  void Test_Page_sources() throws Exception {
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        if (driver.getPageSource().contains("CURA Healthcare Service")){
            Assert.assertTrue(true);
        }else
            //Assert.assertTrue(false);
        throw new Exception("CURA Healthcare Service is not visible");
        driver.quit();
    }

}

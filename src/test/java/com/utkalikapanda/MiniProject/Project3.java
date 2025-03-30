package com.utkalikapanda.MiniProject;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
public class Project3 {

    @Test
    @Description
    @Owner("Utkalika")

    public void test_browser_options(){

        EdgeOptions edgeOptions = new EdgeOptions();
        //edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--window-size=1920,1080");
        //edgeOptions.addArguments("--headless");

        WebDriver driver = new EdgeDriver(edgeOptions);



    }
}

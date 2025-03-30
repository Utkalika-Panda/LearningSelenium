package com.utkalikapanda.MiniProject;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.assertj.core.api.Assertions.*;
import org.testng.annotations.Test;

public class HealthCare {
    @Test
    @Description("Verify the login functionality")

    public void test_Login() throws Exception{

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        WebElement Make_Appoinment = driver.findElement(By.id("btn-make-appointment"));
        Make_Appoinment.click();
        WebElement Username = driver.findElement(By.id("txt-username"));
        Username.sendKeys("John Doe");
        WebElement Password = driver.findElement(By.id("txt-password"));
        Password.sendKeys("ThisIsNotAPassword");
        WebElement Login_Button = driver.findElement(By.id("btn-login"));
        Login_Button.click();


        assertThat(driver.getCurrentUrl()).isNotNull().isEqualTo("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        driver.quit();

    }





}

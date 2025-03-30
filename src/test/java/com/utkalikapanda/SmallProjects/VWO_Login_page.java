package com.utkalikapanda.SmallProjects;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class VWO_Login_page {
    @Test
    @Description("Verify the VWO login page")
    @Owner("Utkalika")
    @Severity(SeverityLevel.BLOCKER)

    public void Verify_Loginpage(){
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");
        WebElement vwo_logo = driver.findElement(By.partialLinkText("Start a"));
        vwo_logo.click();
        //assertThat(driver.getCurrentUrl()).isNotNull().isEqualTo("https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");
        assertThat(driver.getCurrentUrl()).contains("free-trial");
        WebElement Bussiness_Email_field = driver.findElement(By.xpath("//input[@id=\"page-v1-step1-email\"]"));
        Bussiness_Email_field.sendKeys("utkalikatest@gmail.com");
        WebElement CheckBox = driver.findElement(By.name("gdpr_consent_checkbox"));
        CheckBox.click();
        WebElement ErrorMessage = driver.findElement(By.className("invalid-reason"));
        assertThat(ErrorMessage.getText().equals("The email address you entered is incorrect."));

        driver.quit();


    }
}
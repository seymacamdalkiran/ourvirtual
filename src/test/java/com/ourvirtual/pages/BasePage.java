package com.ourvirtual.pages;

import com.ourvirtual.utilities.ConfigurationReader;
import com.ourvirtual.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button[@title='Close']")
    public WebElement closePopup;

    @FindBy(xpath = "//a[text()='Login ']")
    public WebElement dashboard_login;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "pass")
    public WebElement passwordInput;

    @FindBy(id = "send2")
    public WebElement loginWithEmailPassword;

    public void login(){
        dashboard_login.click();
        emailInput.sendKeys(ConfigurationReader.get("email"));
        passwordInput.sendKeys(ConfigurationReader.get("password"));
        loginWithEmailPassword.click();
    }
}

package com.nopcomerce.demo.pages;

import com.nopcomerce.demo.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    Utils utils;
    By emailID = By.id("Email");
    By pwd = By.id("Password");
    By loginButton = By.className("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        utils = new Utils(driver);
    }

    public void doLogin(String username, String password) {
        utils.doSendKeys(emailID, username);
        utils.doSendKeys(pwd, password);
        utils.getElement(loginButton).click();


    }
}

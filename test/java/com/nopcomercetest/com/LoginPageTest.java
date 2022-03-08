package com.nopcomercetest.com;


import com.nopcomerce.demo.base.BasePage;

import com.nopcomerce.demo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class LoginPageTest {
    BasePage basePage;
    Properties prop;
    WebDriver driver;
    LoginPage login;

@BeforeTest

    public void openBrowser() throws IOException {
        basePage = new BasePage();
        prop = basePage.intialiseProperties();
        String browser = prop.getProperty("browser");

        driver= basePage.initialiseDriver(browser);
        driver.get(prop.getProperty("url"));
         login = new LoginPage(driver);
    }
@Test
public void click(){

    login.doLogin(prop.getProperty("username"), prop.getProperty("password") );



    }



}


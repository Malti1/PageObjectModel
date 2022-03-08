package com.nopcomerce.demo.base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    WebDriver driver;
    Properties prop;

    public WebDriver initialiseDriver(String browser){

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        return driver;
    }

    public Properties intialiseProperties() throws IOException {
         prop = new Properties();
         FileInputStream ip = new FileInputStream("/Users/devina/IdeaProjects/PageObjectModelFramework/src/test/resources/TestData/config.properties");
         prop.load(ip);
        //try{
         //FileInputStream ip = new FileInputStream(" /Users/devina/IdeaProjects/PageObjectModelFramework/src/test/resources/TestData/config.properties");
         //prop.load(ip);

        //} catch (FileNotFoundException e) {
         //System.out.println("missing config");
         //e.printStackTrace();
       //}
         //catch (IOException e){
         //System.out.println("Invalid Properties");
         //e.printStackTrace();
     //}

        return prop;
    }


    }






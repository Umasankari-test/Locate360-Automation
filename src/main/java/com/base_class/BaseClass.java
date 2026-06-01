package com.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    public static void browserLaunch() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(
                java.time.Duration.ofSeconds(10));
    }

    public static void launchUrl(String url) {

        driver.get(url);
    }

    public static String getCurrentUrl() {

        return driver.getCurrentUrl();
    }

    public static String getTitle() {

        return driver.getTitle();
    }

    public static void closeBrowser() {

        driver.close();
    }

    public static void quitBrowser() {

        driver.quit();
    }
}
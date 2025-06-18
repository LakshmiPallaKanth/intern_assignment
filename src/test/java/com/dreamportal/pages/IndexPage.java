package com.dreamportal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage {
    WebDriver driver;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
    }

    By loader = By.id("loader");
    By myDreamsBtn = By.id("navigate");

    public boolean isLoaderVisible() {
        return driver.findElement(loader).isDisplayed();
    }

    public boolean isMyDreamsButtonDisplayed() {
        return driver.findElement(myDreamsBtn).isDisplayed();
    }

    public void clickMyDreams() {
        driver.findElement(myDreamsBtn).click();
    }
}

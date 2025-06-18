package com.dreamportal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DreamsTotalPage {
    WebDriver driver;

    public DreamsTotalPage(WebDriver driver) {
        this.driver = driver;
    }

    By goodDreams = By.id("good-count");
    By badDreams = By.id("bad-count");
    By totalDreams = By.id("total-count");
    By recurringDreams = By.id("recurring-count");

    By recurringList = By.id("recurring-list");

    public int getGoodDreams() {
        return Integer.parseInt(driver.findElement(goodDreams).getText());
    }

    public int getBadDreams() {
        return Integer.parseInt(driver.findElement(badDreams).getText());
    }

    public int getTotalDreams() {
        return Integer.parseInt(driver.findElement(totalDreams).getText());
    }

    public int getRecurringDreams() {
        return Integer.parseInt(driver.findElement(recurringDreams).getText());
    }

    public boolean containsRecurring(String dreamName) {
        return driver.findElement(recurringList).getText().contains(dreamName);
    }
}

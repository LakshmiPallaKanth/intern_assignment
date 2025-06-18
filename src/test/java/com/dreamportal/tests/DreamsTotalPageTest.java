package com.dreamportal.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DreamsTotalPageTest {
    WebDriver driver;

    public DreamsTotalPageTest(WebDriver driver) {
        this.driver = driver;
    }

    public int getGoodCount() {
        return Integer.parseInt(driver.findElement(By.id("good-count")).getText());
    }

    public int getBadCount() {
        return Integer.parseInt(driver.findElement(By.id("bad-count")).getText());
    }

    public int getTotalCount() {
        return Integer.parseInt(driver.findElement(By.id("total-count")).getText());
    }

    public int getRecurringCount() {
        return Integer.parseInt(driver.findElement(By.id("recurring-count")).getText());
    }

    public boolean containsDream(String name) {
        return driver.findElement(By.id("recurring-list")).getText().contains(name);
    }
}

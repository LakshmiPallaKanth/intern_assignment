package com.dreamportal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DreamsDiaryPage {
    WebDriver driver;

    public DreamsDiaryPage(WebDriver driver) {
        this.driver = driver;
    }

    By dreamRows = By.cssSelector("table tbody tr");

    public int getDreamCount() {
        return driver.findElements(dreamRows).size();
    }

    public boolean allDreamsAreGoodOrBad() {
        List<WebElement> rows = driver.findElements(dreamRows);
        for (WebElement row : rows) {
            String type = row.findElements(By.tagName("td")).get(2).getText().trim();
            if (!type.equalsIgnoreCase("Good") && !type.equalsIgnoreCase("Bad")) {
                return false;
            }
        }
        return true;
    }

    public boolean allColumnsAreFilled() {
        List<WebElement> rows = driver.findElements(dreamRows);
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            if (cols.size() != 3 ||
                cols.get(0).getText().isEmpty() ||
                cols.get(1).getText().isEmpty() ||
                cols.get(2).getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}

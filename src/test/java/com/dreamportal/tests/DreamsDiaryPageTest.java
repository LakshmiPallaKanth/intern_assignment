package com.dreamportal.tests;

import com.dreamportal.base.BaseTest;
import com.dreamportal.pages.DreamsDiaryPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class DreamsDiaryPageTest extends BaseTest {

    @Test
    public void validateDreamsDiaryPage() throws InterruptedException {
        // Switch to Diary tab (assumes index.html test opened the new tab)
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); // Assuming 0 = index.html, 1 = diary.html

        DreamsDiaryPage diary = new DreamsDiaryPage(driver);

        Assert.assertEquals(diary.getDreamCount(), 10, "Dream entries are not 10");
        Assert.assertTrue(diary.allDreamsAreGoodOrBad(), "Some dreams are not Good or Bad");
        Assert.assertTrue(diary.allColumnsAreFilled(), "Not all columns are filled");
    }
}

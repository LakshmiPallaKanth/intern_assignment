package com.dreamportal.tests;

import com.dreamportal.base.BaseTest;
import com.dreamportal.pages.IndexPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IndexPageTest extends BaseTest {

    @Test
    public void testIndexPage() throws InterruptedException {
        IndexPage index = new IndexPage(driver);

        // Wait for loader to disappear
        Thread.sleep(3000);
        Assert.assertFalse(index.isLoaderVisible(), "Loader did not disappear!");

        Assert.assertTrue(index.isMyDreamsButtonDisplayed(), "'My Dreams' button is not visible");

        index.clickMyDreams();
        // You can now switch tabs and test Diary and Summary
    }
}

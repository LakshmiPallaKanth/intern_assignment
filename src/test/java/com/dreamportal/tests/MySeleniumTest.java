package com.dreamportal.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class MySeleniumTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // ✅ Automatically downloads the correct ChromeDriver for your browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://arjitnigam.github.io/myDreams/");
    }

    @Test
    public void testPageTitle() {
        String title = driver.getTitle();
        System.out.println("🧪 Page title is: " + title);
        assert title.contains("Dream Portal");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

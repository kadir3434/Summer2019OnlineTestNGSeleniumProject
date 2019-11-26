package tests.day_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserFactory;
import utils.BrowserUtils;

import java.awt.*;

public class FileUploading {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
    }

    @Test
    public void Test1() {
        driver.findElement(By.linkText("File Upload")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\HOME\\Desktop\\01-JAVA_AND_ENVIRONMENTS.png");
        driver.findElement(By.id("file-submit")).click();
        BrowserUtils.wait(4);

        String expectedFileName = "01-JAVA_AND_ENVIRONMENTS.png";
        String actualFileName = driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actualFileName, expectedFileName, "File name is not correct!");
        BrowserUtils.wait(4);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}

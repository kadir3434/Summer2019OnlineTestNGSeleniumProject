package tests.day_10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class PopUpPractice {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
    }

    @Test(description = "click OK in popup message")
    public void Test1() {
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        driver.findElement(By.xpath("//button[text() = 'Click for JS Alert']")).click();
        BrowserUtils.wait(3);
        Alert alert = driver.switchTo().alert();
        alert.accept(); //to click OK
        BrowserUtils.wait(3);

    }

    @Test(description = "click cancel in PopUp message")
    public void Test2() {
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        driver.findElement(By.xpath("//button[2]")).click();
        BrowserUtils.wait(3);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText()); //print text of popUp message
        alert.dismiss(); //to click cancel
        String textMessage = driver.findElement(By.id("result")).getText();
        System.out.println(textMessage);
        BrowserUtils.wait(3);
    }

    @Test
    public void Test3() {
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        BrowserUtils.wait(5);
        driver.findElement(By.xpath("//button[3]")).click();
        BrowserUtils.wait(5);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Hello");
        BrowserUtils.wait(5);
        alert.accept();
        System.out.println(driver.findElement(By.id("result")).getText());
        BrowserUtils.wait(5);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}

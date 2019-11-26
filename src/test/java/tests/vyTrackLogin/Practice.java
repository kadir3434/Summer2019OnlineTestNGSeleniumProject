package tests.vyTrackLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class Practice {
    public static void main(String[] args) {
        //WebDriver driver = BrowserFactory.getDriver("chrome");
        BrowserFactory obj = new BrowserFactory();
        WebDriver driver = obj.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");

        //driver.findElement(By.id("prependedInput")).sendKeys("User25");
        //email.sendKeys("User25");
        //driver.findElement(By.className("span2")).sendKeys("User25");
        driver.findElement(By.name("_username")).sendKeys("User25");

        //driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        //driver.findElement(By.className("span2")).sendKeys("UserUser123"); couldn't find
        driver.findElement(By.name("_password")).sendKeys("UserUser123");

        driver.findElement(By.id("_submit")).click();


        //BrowserUtils.wait(4);
        //driver.close();
    }

}

package tests.day_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestsForNameLocator {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        driver.findElement(By.name("full_name")).sendKeys("Admin User");
        driver.findElement(By.name("email")).sendKeys("email@email.com");
        BrowserUtils.wait(2);
        driver.findElement(By.name("wooden_spoon")).click();

        BrowserUtils.wait(4);
        driver.quit();
    }

}

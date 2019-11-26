package tests.day_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestsForIdLocator {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement buttonDont = driver.findElement(By.id("disappearing_button"));
        BrowserUtils.wait(1);
        buttonDont.click();

        WebElement resultOfText = driver.findElement(By.id("result"));
        String actualResulOfText = resultOfText.getText();
        System.out.println(actualResulOfText);

        BrowserUtils.wait(3);
        driver.quit();
    }

}

package tests.day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class FindElementsTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //step 1: Open inspector from Chrome and find locator for the element
        //step 2: Create object of WebElement
        //Step3: Use WebElement
        String title = driver.getTitle();
        WebElement button = driver.findElement(By.id("form_submit"));
        //to click on the element
        button.click();
        String actualResult = driver.getTitle();
        if (title.equals(actualResult)) {
            System.out.println("Title didn't change... " + title);
        } else {
            System.out.println("Title changed from " + title + " to " + actualResult);
        }

        BrowserUtils.wait(4);


        driver.quit();
    }

}

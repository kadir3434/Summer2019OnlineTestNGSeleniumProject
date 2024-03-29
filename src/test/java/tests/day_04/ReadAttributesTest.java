package tests.day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class ReadAttributesTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement input = driver.findElement(By.name("email"));
        System.out.println(input.getAttribute("pattern"));
        input.sendKeys("adsas@sdfswdf.com");
        System.out.println(input.getAttribute("value"));
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        //alternative to click(), on if has type="submit"
        retrievePasswordButton.submit();
        BrowserUtils.wait(3);
        driver.close();
    }

}

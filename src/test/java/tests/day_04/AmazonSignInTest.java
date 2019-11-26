package tests.day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class AmazonSignInTest {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://amazon.com");

        WebElement accountAndSignInButton = driver.findElement(By.id("nav-link-accountList"));
        accountAndSignInButton.click();
        //homePageSignInButton.click();
        WebElement signInButton = driver.findElement(By.className("nav-action-inner"));
        signInButton.click();


        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("trying@email.com", Keys.ENTER);


        BrowserUtils.wait(3);
        driver.close();
    }



}

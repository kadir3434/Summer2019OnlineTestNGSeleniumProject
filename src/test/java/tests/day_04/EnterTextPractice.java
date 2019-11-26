package tests.day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class EnterTextPractice {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement inputBox = driver.findElement(By.name("email"));

        inputBox.sendKeys("abc@def.com", Keys.ENTER);
        BrowserUtils.wait(2);

        //WebElement button = driver.findElement(By.id("form_submit"));
        //button.click();

        String expectedUrl = "http://practice.cybertekschool.com/email_sent";
        String actualUrl = driver.getCurrentUrl();
        String expectedResult = "Your e-mail's been sent!";
        if(expectedUrl.equals(actualUrl)){
            System.out.println("URL Test passed");
        }else {
            System.out.println("URL Test failed");
        }

        WebElement message = driver.findElement(By.name("confirmation_message"));
        String actualResult = message.getText();

        if(expectedResult.equals(actualResult)){
            System.out.println("Confirmation message Test passed");
        }else {
            System.out.println("Confirmation message Test failed");
        }

        BrowserUtils.wait(3);
        driver.quit();

    }
}

package tests.day_06;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class BitrixLogin {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/");
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("hr41@cybertekschool.com");
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Log')]")).clear();
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//input[starts-with(@type,'tex')]")).sendKeys("hr41@cybertekschool.com");

        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("UserUser");
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();
        BrowserUtils.wait(3);
        driver.findElement(By.xpath("//*[contains(@title, 'Activity Stream')]")).click();

        BrowserUtils.wait(3);
        driver.quit();

        /*
                //*[contains(text(), 'Incorrect')]       (finding incorrect e mail or password message)

                //tagName[@attribute = 'value']
                //input[@name = 'USER_LOGIN']
         */


    }
}

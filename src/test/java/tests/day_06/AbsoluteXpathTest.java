package tests.day_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class AbsoluteXpathTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/");
        driver.findElement(By.className("login-btn")).click();
        //String warningMessage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/div/div/div[2]")).getText();
        String warningMessage = driver.findElement(By.xpath("//div[@class='errortext']")).getText();
        System.out.println(warningMessage);

        BrowserUtils.wait(2);
        driver.quit();
    }
}

package tests.Day_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class FramesPractice {
    private WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/frames");
    }

    @Test(description = "iFrame example")
    public void Test1(){
        driver.findElement(By.linkText("iFrame")).click();
        //since element imside a frame, element is not visible for selenium
        //without switching to the frame
        driver.switchTo().frame("mce_0_ifr");
        //without switching, we can not see inner HTML document
        //which one to use? id, name, index, webelement?
        //1. id or name
        //2. webelement   driver.findElement(By.cssSelector("iframe[class='some_frame']"));
        //3. index    [iFrame1, iFrame2, iFrame3...]
        WebElement inputArea = driver.findElement(By.id("tinymce"));
        String expectedTExt = "Your content goes here.";
        String actualText = inputArea.getText();
        Assert.assertEquals(actualText, expectedTExt);
        BrowserUtils.wait(2);
        inputArea.clear();
        BrowserUtils.wait(2);
        inputArea.sendKeys("Hi Friend...");
        BrowserUtils.wait(2);
        //top exit from the frame
        driver.switchTo().defaultContent();
    }

    //in case of nested frames
    //we must switch to first frame --> then again to another frame, taht is inside
    //--html
    //---frame#1
    //----frame#2
    @Test
    public void Test2(){
        //it's not switch to frame
        //it's a navigation action
        driver.findElement(By.linkText("Nested Frames")).click();
        //we switch to frame based on webelement
        driver.switchTo().frame(driver.findElement(By.cssSelector("[name='frame-bottom']")));
        //the reason why we are switching here
        //is because content that is inside a frame is not visible for selenium
        //it's like when you are on the first floor
        //trying to find what is on the second floor
        WebElement content = driver.findElement(By.tagName("body"));
        System.out.println(content.getText());
        driver.switchTo().defaultContent();//to exit from all frames, got to first floor
        driver.switchTo().frame("frame-top"); // second floor
        driver.switchTo().frame("frame-left"); // third floor
        System.out.println(driver.findElement(By.tagName("body")).getText());//print text of body
    }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}

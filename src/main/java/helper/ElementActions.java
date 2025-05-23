package helper;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementActions {

    public static void clickOnElement(AppiumDriver driver, By locator) {

        VerifyActions.isDisplayed(driver, locator);
        VerifyActions.isClickable(driver, locator);
        driver.findElement(locator).click();
    }

    public static void sendKeys(AppiumDriver driver, By locator, String keys) {
        try {
            ScrollingActions.scrollToFindElement(driver, locator);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        VerifyActions.isClickable(driver, locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(keys);
    }

    public static void clickOnEnter(AppiumDriver driver) {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).build().perform();
    }

    public static void clickOnRight(AppiumDriver driver, By locator) {
        VerifyActions.isClickable(driver, locator);
        driver.findElement(locator).sendKeys(Keys.ARROW_RIGHT);
    }

    public static String getElementText(AppiumDriver driver, By locator) {
        VerifyActions.isDisplayed(driver, locator);
        return driver.findElement(locator).getText();
    }

    public static void clear(AppiumDriver driver, By locator) {
        driver.findElement(locator).clear();
    }

    public static WebElement getElement(AppiumDriver driver, By locator) {
        return driver.findElement(locator);
    }

    public  static void waitElement(int mills){
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

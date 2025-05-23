package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScrollingActions {
    static JavascriptExecutor js;
    public static void scrollToTheEnd(WebDriver driver) {
        js= (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,2500)");
    }
    public static void  scrollToFindElement(WebDriver driver, By locator) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", driver.findElement(locator));
        Thread.sleep(2000);
    }

    public void scrollUpToFindElement(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-350)", "");
    }

}

package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LookUp {
    WebDriver driver;
    String label;
    String locator = "//*[contains(text(),'%s')]/ancestor::lightning-lookup-desktop//input";
    String optionLocator = "//*[@title='%s']";
    By waitLocator;
    WebDriverWait wait;

    public LookUp(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
        wait = new WebDriverWait(driver, 10);
    }

    public void select(String text) {
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
        isListOpened(text);
        driver.findElement(By.xpath(String.format(optionLocator, text))).click();
    }

    public void isListOpened(String text) {
        try {
            waitLocator = By.xpath(String.format(optionLocator, text));
            wait.until(ExpectedConditions.visibilityOfElementLocated(waitLocator));
        } catch (TimeoutException ex) {
            Assert.fail("Спиков аккаунтов не был загружен");
        }
    }
}

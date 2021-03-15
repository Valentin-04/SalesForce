package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {

    WebDriver driver;
    String label;
    String locator = "//*[contains(text(),'%s')]/ancestor::lightning-input//input";
    String dateLocator = "//*[contains(text(),'%s')]/ancestor::lightning-datepicker//input";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
    }

    public void addDate(String text) {
//        driver.findElement(By.xpath(String.format(locator, label))).click();
        driver.findElement(By.xpath(String.format(dateLocator, label))).sendKeys(text);
    }
}

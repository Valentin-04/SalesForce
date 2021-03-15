package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {
    WebDriver driver;
    String label;
    String locator = "//*[contains(text(),'%s')]/ancestor::lightning-textarea//textarea";
//    String optionLocator = "//*[text()='%s']";

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeText(String text) {
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public static final By MENU = By.xpath("//*[@title='Sales']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        try {
            driver.findElement(MENU);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}

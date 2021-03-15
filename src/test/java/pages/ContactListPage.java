package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ContactListPage extends BasePage {
    public static final By NEW_BUTTON = By.xpath("//*[@title='New']");
    public static final By PERMANENT_CONTACT_ELEMENT = By.xpath("//*[@title='Jack Tor']");
    public static final By CONTACT_ELEMENT = By.xpath("//*[@title='%s']");

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening contacts page")
    public void open() {
        driver.get("https://techmeskills.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
    }

    @Step("Click 'New' button")
    public void clickNew() {
        driver.findElement(NEW_BUTTON).click();
    }

    public void isContactPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(PERMANENT_CONTACT_ELEMENT));
        } catch (TimeoutException ex) {
            Assert.fail("Страница контактов не была загружена");
        }
    }
}

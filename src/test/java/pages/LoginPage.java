package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {
    public static final By LOGIN_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");
    String URL = "https://techmeskills.lightning.force.com/";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open Authorization page")
    public void open() {
        driver.get(URL);
    }

    @Step("Login")
    public void login(String username, String password) {
        driver.findElement(LOGIN_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }
}

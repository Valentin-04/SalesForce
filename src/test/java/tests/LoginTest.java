package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    //Add your login data before start the test
    String login = "";
    String password = "";

    @Test(description = "Log In")
    @Description("Authorization in SalesForce system")
    @Severity(SeverityLevel.BLOCKER)
    @Link("https://instagram.com")
    @Issue("COVID-19")
    @TmsLink("COVID-19")
    public void login() {
        loginSteps.login(login, password);
    }
}
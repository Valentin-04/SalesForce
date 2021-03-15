package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    String login = "kent94_77-f1tf@force.com";
    String password = "password01";

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
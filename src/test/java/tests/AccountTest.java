package tests;

import io.qameta.allure.*;
import models.Account;
import org.testng.annotations.Test;
import utils.Retry;

public class AccountTest extends BaseTest {
    //Add your login data before start the test
    String login = "";
    String password = "";

    @Test(description = "Creation of contact", retryAnalyzer = Retry.class)
    @Description("I'm creating contact for salesforce")
    @Severity(SeverityLevel.BLOCKER)
    @Link("https://instagram.com/dmitryrak11")
    @Issue("COVID-19")
    @TmsLink("COVID-19")
    public void createContact() {
        loginSteps.login(login, password);
        Account account = new Account("AWS", "BNS", "+3757777777", "+375888888888",
                "tut@tut.tut", "Investor", "Technology", "Jack",
                "kit", "kit", "kit", "kit",
                "kit", "kit", "kit", "kit", "kit",
                "kit", "kit", "kit");
        accountSteps.create(account);
        //TODO VALIDATE

    }
}

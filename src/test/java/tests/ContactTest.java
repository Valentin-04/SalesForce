package tests;

import io.qameta.allure.*;
import models.Contact;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    String login = "kent94_77-f1tf@force.com";
    String password = "password01";

    @Test(description = "Creation of contact") //, retryAnalyzer = Retry.class
    @Description("I'm creating contact for salesforce")
    @Severity(SeverityLevel.BLOCKER)
    @Link("https://instagram.com/dmitryrak11")
    @Issue("COVID-19")
    @TmsLink("COVID-19")
    public void createContact() {
        loginSteps.login(login, password);
        Contact contact = new Contact("Mr.", "Jhon", "Smith", "TMS",
                "title", "+3757777777", "+375888888888", "tut@tut.tut",
                "Jack", "kit", "kit", "kit",
                "kit", "kit", "kit", "kit", "kit",
                "kit", "kit", "+37599999999", "+3757777777",
                "+3757777777", "+3757777777", "Jessika", "kit",
                "Other", "1/1/1980", "kit");
        contactSteps.create(contact);
        //TODO VALIDATE

    }
}
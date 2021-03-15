package pages;

import io.qameta.allure.Step;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.LookUp;
import wrappers.TextArea;

public class NewContactModal extends BasePage {
    public static final By SAVE = By.xpath("//*[@name='SaveEdit']");

    public NewContactModal(WebDriver driver) {
        super(driver);
    }

    @Step("Creating contact: {contact.lastName}")
    public void createContact(Contact contact) {
        new DropDown(driver, "Salutation").choose(contact.getSalutation());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new LookUp(driver, "Account Name").select(contact.getAccountName());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Email").write(contact.getEmail());
        new LookUp(driver, "Reports To").select(contact.getReportsTo());
        new TextArea(driver, "Mailing Street").writeText(contact.getMailingStreet());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing State").write(contact.getMailingState());
        new Input(driver, "Postal Code").write(contact.getPostalCode());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());
        new TextArea(driver, "Other Street").writeText(contact.getOtherStreet());
        new Input(driver, "Other City").write(contact.getOtherCity());
        new Input(driver, "Other State").write(contact.getOtherState());
        new Input(driver, "Other Zip").write(contact.getOtherZip());
        new Input(driver, "Other Country").write(contact.getOtherCountry());
        new Input(driver, "Fax").write(contact.getFax());
        new Input(driver, "Home Phone").write(contact.getHomePhone());
        new Input(driver, "Other Phone").write(contact.getOtherPhone());
        new Input(driver, "Asst. Phone").write(contact.getAssistPhone());
        new Input(driver, "Assistant").write(contact.getAssistant());
        new Input(driver, "Department").write(contact.getDepartment());
        new DropDown(driver, "Lead Source").choose(contact.getLeadSource());
        new Input(driver, "Birthdate").addDate(contact.getBirthdate());
        new TextArea(driver, "Description").writeText(contact.getDescription());
    }

    public void save() {
        driver.findElement(SAVE).click();
    }
}

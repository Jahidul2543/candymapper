package pageobjects;

import applicationbase.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage {

    @FindBy(xpath = "//input[@data-aid='CONTACT_FORM_NAME']")
    private WebElement nameBox;
    @FindBy(xpath = "//textarea[@data-aid='CONTACT_FORM_MESSAGE']")
    private WebElement messageBox;

    @FindBy(id ="contact-form-submit")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@data-aid='CONTACT_EMAIL_ERR_REND']")
    private WebElement errorTest;

    public void dropUsALine(String name, String message){
        TestLogger.log("Send key to Name Box");

        // nameBox.sendKeys("Paul");
        //messageBox.sendKeys("Hi Hello!!!");
        //submitButton.click();
        ApplicationPageBase.sendKeys(nameBox, "NameBox", name);
        ApplicationPageBase.sendKeys(messageBox, "messageBox", message);
        ApplicationPageBase.click(submitButton, "submitButton");

    }

    public String getErrorMessage(){

      String errorMessage =  errorTest.getText();
      return errorMessage;

    }

}

package applicationbase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ApplicationPageBase {

    public static void sendKeys(WebElement element, String webElementName, String keys){
        TestLogger.log("Clear " + webElementName);
        element.clear();
        TestLogger.log("Cleared " + webElementName);
        TestLogger.log("Send Keys to " + webElementName );
        element.sendKeys(keys);
       TestLogger.log("Keys Sent to " + webElementName);
    }


    public static String getText(WebElement webElement, String webElementName){

        TestLogger.log("Getting Text from " + webElementName);
        String actualText =  webElement.getText();
        TestLogger.log("Actual text: " + actualText);

        return actualText;

    }
    public static void click(WebElement webElement, String webElementName){
        TestLogger.log("Click " + webElementName );
        webElement.click();
        TestLogger.log("Clicked " + webElementName);
    }

}

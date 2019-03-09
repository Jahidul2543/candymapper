package testobjects;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class HomePageTest extends BrowserDriver {

    HomePage objHomePage = null;

    @BeforeMethod
    public void initElements(){
        objHomePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void dropUsALineTest(){

        objHomePage.dropUsALine();
        String actualErrorMesage = objHomePage.getErrorMessage();
        Assert.assertEquals(actualErrorMesage, "Please enter a valid email address.");

    }



}

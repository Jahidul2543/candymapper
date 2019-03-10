package testobjects;

import base.BrowserDriver;
import com.sun.org.apache.regexp.internal.RE;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import xslsxreader.MyDataReader;

public class HomePageTest extends BrowserDriver {

    HomePage objHomePage = null;

    @BeforeMethod
    public void initElements(){
        objHomePage = PageFactory.initElements(driver, HomePage.class);
    }

    @DataProvider
    public Object[][] testData() throws Exception {
        MyDataReader mdt = new MyDataReader();
        mdt.setExcelFile("/Users/jahidul/IdeaProjects/candymapper/webcandymapper/testData/TestData1.xlsx");
       String[][] data = mdt.getExcelSheetData("Sheet3");
       return data;
    }



    @Test(dataProvider = "testData")
    public void dropUsALineTest(String name, String message, String expectedErrorMessage){

        objHomePage.dropUsALine(name, message);
        String actualErrorMesage = objHomePage.getErrorMessage();
        Assert.assertEquals(actualErrorMesage, expectedErrorMessage);

    }



}

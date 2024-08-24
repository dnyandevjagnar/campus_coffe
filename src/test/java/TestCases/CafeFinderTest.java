package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CafeFinderPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testBase.WebTestBase;
import utility.DropDownUtil;
import utility.WebDriverUtil;

public class CafeFinderTest extends WebTestBase {
    public CafeFinderPage cafeFinderPage;
   public HomePage homePage;
   public WebDriverUtil webDriverUtil;

    @BeforeMethod()
    public void preRequisite() {
        initialization();
         homePage = new HomePage();
        webDriverUtil=new WebDriverUtil();
      cafeFinderPage=new CafeFinderPage();
    }

    @Test(description = "verify the Cafe finder page open of not")
    public void verifyCafeFindBtnClickableOrNot(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closedAd2();
        homePage.closedAd();
        cafeFinderPage.setCafeFinderOpen();
        cafeFinderPage.setAddCafeFinderPage();
        cafeFinderPage.setFindBtn();
        softAssert.assertEquals(cafeFinderPage.getTextOfCamposCoffeeCafeFinderPage(),"CAMPOS COFFEE CAFE FINDER","CAFÉ FINDER page should be open");
        softAssert.assertAll();
    }

    @Test(description = "verify the find your cafe near find or not")
    public void verifyFindYourCafeNear(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closedAd2();
        homePage.closedAd();
        cafeFinderPage.setCafeFinderOpen();
        cafeFinderPage.freeDiscountClosedAd();
        cafeFinderPage.setFindBtn();
        softAssert.assertEquals(cafeFinderPage.getFindLocationPageText(),"YOUR LOCATION","YOUR LOCATION should be show");
        softAssert.assertAll();
    }
    @AfterMethod()
    public  void tearDown(){
        driver.close();
    }

}

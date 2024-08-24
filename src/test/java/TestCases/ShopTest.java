package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.ShopPage;
import testBase.WebTestBase;
import utility.DropDownUtil;

public class ShopTest extends WebTestBase {
    public HomePage homePage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;
    public ShopPage shopPage;
    public DropDownUtil dropDownUtil;
    @BeforeMethod
    public void preRequisite(){
        initialization();
        homePage =new HomePage();
        loginPage =new LoginPage();
        myAccountPage=new MyAccountPage();
        shopPage=new ShopPage();
        dropDownUtil=new DropDownUtil();

    }
    @Test(description = "verify the shop page button click or not ")
    public void shopTest(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closedAd2();
        homePage.closedAd();
        shopPage.shopPageOpen();
        softAssert.assertEquals(shopPage.getShopPageText(),"SHOWING 22 OF 107 RESULTS","SHop page should be open");
        softAssert.assertAll();
    }
    @Test(description = "verify the drop down")
    public void dropDownShopPage(){
        SoftAssert softAssert=new SoftAssert();
        homePage.closedAd2();
        homePage.closedAd();
        shopPage.shopPageOpen();
        softAssert.assertAll();
    }
    @AfterMethod
    public  void tearDown(){

        driver.close();
    }
}

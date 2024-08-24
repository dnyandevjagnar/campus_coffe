package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.RegistrationPage;
import testBase.WebTestBase;

public class RegistrationTest extends WebTestBase {
    public HomePage homePage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;
    public RegistrationPage registrationPage;

    @BeforeMethod
    public void preRequisite(){
        initialization();
        homePage=new HomePage();
        loginPage=new LoginPage();
        myAccountPage=new MyAccountPage();
        registrationPage=new RegistrationPage();
    }
  @Test(description = "verify registed success full or not")
    public void verifyTheRegisterOrNot(){
      SoftAssert softAssert=new SoftAssert();
      homePage.closedAd2();
      homePage.closedAd();
      homePage.clickOnLoginBtn();
      registrationPage.setClickHeretoRegisterBtn();
      registrationPage.register(prop.getProperty("username"), prop.getProperty("password"));
      softAssert.assertEquals(registrationPage.successfulText(),"MY ACCOUNT","Registration Successful ");
      softAssert.assertAll();
    }

    @AfterMethod
    public  void tearDown(){

        driver.close();
    }



}

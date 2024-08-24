package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.LostYourPasswordPage;
import pages.MyAccountPage;
import testBase.WebTestBase;

public class LostYourPasswordTest extends WebTestBase {

    public HomePage homePage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;
    public LostYourPasswordPage lostYourPasswordPage;


    @BeforeMethod
    public void preRequisite(){
        initialization();
        homePage=new HomePage();
        loginPage=new LoginPage();
        myAccountPage=new MyAccountPage();
        lostYourPasswordPage=new LostYourPasswordPage();
    }
    @Test(description = "Your password reset mail in your registered mail id")
    public void resetYourPassWord(){
        homePage.closedAd2();
        homePage.closedAd();
        homePage.clickOnLoginBtn();
        lostYourPasswordPage.setLostYourPasswordBtn();
        lostYourPasswordPage.loginMail(prop.getProperty("username"));

    }

    @AfterMethod
    public  void tearDown(){

        driver.close();
    }
}

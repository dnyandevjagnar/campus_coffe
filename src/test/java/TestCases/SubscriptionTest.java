package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.SubscriptionPage;
import testBase.WebTestBase;

public class SubscriptionTest extends WebTestBase {

    public HomePage homePage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;
    public SubscriptionPage subscriptionPage;

    @BeforeMethod
    public void preRequisite(){
        homePage =new HomePage();
        loginPage=new LoginPage();
        myAccountPage=new MyAccountPage();
        subscriptionPage=new SubscriptionPage();

    }
    @Test(description = "verify the drop Down Subscripts page" )
    public void dropDrown(){
        //subscriptionPage.setSubscriptionPageAdd();
        homePage.closedAd2();
        homePage.closedAd();

    }

    @AfterMethod
    public  void tearDown(){

        driver.close();
    }

}

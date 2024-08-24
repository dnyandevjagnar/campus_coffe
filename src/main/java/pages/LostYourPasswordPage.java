package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;
import utility.WebDriverUtil;

public class LostYourPasswordPage extends WebTestBase {
    @FindBy(xpath = "//input[@class='woocommerce-Input woocommerce-Input--text input-text']")
    WebElement userLoginTextBox;
    @FindBy(xpath = "//input[@class='woocommerce-Button button']")
    WebElement resetPasswordBtn;

    @FindBy(xpath = "//p[@class='woocommerce-LostPassword lost_password']")
    WebElement lostYourPasswordBtn;


    public LostYourPasswordPage(){
        PageFactory.initElements(driver,this);
    }
    public void setLostYourPasswordBtn(){
        WebDriverUtil.waitUntilElementToBeClickable(lostYourPasswordBtn);
    }
    public void  loginMail(String userName) {
        WebDriverUtil.sendKeysByElement(userLoginTextBox, userName);
        WebDriverUtil.waitUntilElementToBeClickable(resetPasswordBtn);
    }

}

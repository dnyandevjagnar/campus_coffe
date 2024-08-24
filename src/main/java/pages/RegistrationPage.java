package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;
import utility.WebDriverUtil;

public class RegistrationPage extends WebTestBase {
    @FindBy(id = "reg_email")
    WebElement registerPageEmailTextBox;

    @FindBy(id = "reg_password")
    WebElement registerPagePasswordTextBox;

    @FindBy(xpath = "//a[text()='Click here']")
    WebElement clickHeretoRegisterBtn;
    @FindBy(xpath = "//input[@value='Register']")
    WebElement registerBtn;
    @FindBy(xpath = "//a[text()='Please log in.']")
    WebElement ErrorMsgText;

    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement SuccessMsg;

    public RegistrationPage(){
        PageFactory.initElements(driver,this);
    }
    public void setClickHeretoRegisterBtn(){
        WebDriverUtil.waitUntilElementToBeClickable(clickHeretoRegisterBtn);
    }
    public void register(String ValidGmail,String StrongPassword){
        WebDriverUtil.sendKeysByElement(registerPageEmailTextBox,ValidGmail);
        WebDriverUtil.sendKeysByElement(registerPagePasswordTextBox,StrongPassword);
        WebDriverUtil.waitUntilElementToBeClickable(registerBtn);
    }
    public String registrationSuccessFullOrNot(){

        if(ErrorMsgText.getText().equalsIgnoreCase("Please log in.")){
        return ErrorMsgText.getText();
        }
        else {
            return SuccessMsg.getText();
        }
        }
    public String successfulText(){
        return SuccessMsg.getText();

    }

}

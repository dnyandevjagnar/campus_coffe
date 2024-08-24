package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;
import utility.WebDriverUtil;

public class LoginPage extends WebTestBase {
    @FindBy(id="username")  //path of username text box
    WebElement userNameTextBox;

    @FindBy(id="password")  //path of password text box
    WebElement passwordTextBox;

    @FindBy(xpath = "//input[@value='Log in']")   // path of login button
    WebElement loginBtn;

    @FindBy(xpath = "//a[text()='Click here']")
    WebElement clickHereToRegisterBtn;

    @FindBy(xpath = "//h2[text()='Register']")
    WebElement registerPage;
    @FindBy(xpath = "//a[text()='Lost your password?']")
    WebElement lostYourPasswordBtn;
    @FindBy(xpath = "//p[text()='Please enter your username or email address. You will receive a link to create a new password via email.']")
    WebElement lostYourPasswordPage;
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    public void  login(String userName,String password){
        WebDriverUtil.sendKeysByElement(userNameTextBox,userName);
        WebDriverUtil.sendKeysByElement(passwordTextBox,password);
        WebDriverUtil.waitUntilElementToBeClickable(loginBtn);
    }
    public void registerPageOpen(){
        WebDriverUtil.waitUntilElementToBeClickable(clickHereToRegisterBtn);
    }

    public String registerPageText(){

        return WebDriverUtil.getTextOfElement(registerPage);
    }
    public void lostYourPasswordPageOpen(){
        WebDriverUtil.waitUntilElementToBeClickable(lostYourPasswordBtn);
    }
    public String lostYourPasswordPageText(){
        return WebDriverUtil.getTextOfElement(lostYourPasswordPage);
    }
}


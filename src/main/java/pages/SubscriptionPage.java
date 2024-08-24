package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;
import utility.WebDriverUtil;

public class SubscriptionPage extends WebTestBase {

    @FindBy(xpath = "//button[@class='CloseButton__ButtonElement-sc-79mh24-0 irFqfi alford-CloseButton alford-close alford-ClosePosition--top-right']")
    WebElement subscriptionPageAdd;
    @FindBy(xpath = "//select[@id='sort']")
    WebElement sortBY;

    public SubscriptionPage(){
        PageFactory.initElements(driver,this);
    }

    public void setSubscriptionPageAdd(){
        WebDriverUtil.waitUntilElementToBeClickable(subscriptionPageAdd);
    }
    public void setSortBY(){
        WebDriverUtil.waitUntilElementToBeClickable(sortBY);
    }


}

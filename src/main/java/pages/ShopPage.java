package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;
import utility.WebDriverUtil;

public class ShopPage extends WebTestBase {
@FindBy(xpath= "//a[@href='https://camposcoffee.com/shop/']")
WebElement shopBtn;
@FindBy(xpath = "//div[@class='filter-bar__inner__section__results']")
WebElement findText;
public ShopPage(){
    PageFactory.initElements(driver,this);
}

public void shopPageOpen(){
    WebDriverUtil.waitUntilElementToBeClickable(shopBtn);
}
public String shopPageDropDown(WebElement element){
    WebDriverUtil.waitUntilElementToBeClickable(shopBtn);
   return element.getText();

}
public String getShopPageText(){
    return findText.getText();
}
}

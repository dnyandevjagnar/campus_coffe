package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;
import utility.WebDriverUtil;

public class CafeFinderPage extends WebTestBase {
    @FindBy(xpath = "//a[text()='Café Finder']")
    WebElement cafeFinderBtn;

    @FindBy(xpath = "//h6[text()='Campos Coffee Cafe Finder']")
    WebElement CamposCoffeeCafeFinderText;

    @FindBy(xpath = "//button[@class='filter-inner-button']")
    WebElement findBtn;
    @FindBy(xpath = "//li[@class='filter_item-list-item ng-binding ng-scope filter_item-list-item--selected']")
    WebElement nearMeBtn;
    @FindBy(xpath = "//button[@class='mc-closeModal']")
    WebElement freeDiscountAd;
    @FindBy(xpath = "//h2[@class='map-inner-header-result ng-scope']")
    WebElement findLocation;
    @FindBy(xpath = "//button[@title='Close']")
    WebElement addCafeFinderPage;
    public CafeFinderPage(){
        PageFactory.initElements(driver,this);
    }


    public void freeDiscountClosedAd(){

        WebDriverUtil.waitUntilElementToBeClickable(freeDiscountAd);
    }


    public void setCafeFinderOpen(){
        WebDriverUtil.waitUntilElementToBeClickable(cafeFinderBtn);

    }
    public void setNearMeBtn(){
        WebDriverUtil.waitUntilElementToBeClickable(nearMeBtn);
    }
    public void setFindBtn(){
        WebDriverUtil.waitUntilElementToBeClickable(findBtn);
    }
    public String getTextOfCamposCoffeeCafeFinderPage(){
        return WebDriverUtil.getTextOfElement(CamposCoffeeCafeFinderText);
    }
    public String getFindLocationPageText(){
        return WebDriverUtil.getTextOfElement(findLocation);
    }

    public void setAddCafeFinderPage(){
        WebDriverUtil.waitUntilElementToBeClickable(addCafeFinderPage);
    }
}

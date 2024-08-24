package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import testBase.WebTestBase;

public class DropDownUtil  extends WebTestBase {
    public static Select select;


    public static void  dropDown(WebElement element,int index) {
       select=new Select(element);
       select.selectByIndex(index);
    }

    public static void  dropDown(WebElement element,String visibleText) {
        select=new Select(element);
        select.selectByVisibleText(visibleText);
    }

}
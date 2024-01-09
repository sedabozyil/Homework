package Pages;

import org.openqa.selenium.By;
import io.github.sukgu.Shadow;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

import static utilities.Driver.driver;


public class Page {

    public Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public final By kampbutton = By.xpath("//*[@id='ins-editable-button-1580496494']");
    public final By magazabutton = By.xpath("//div/ul/li/a[contains(@title, 'Mağazalarımız') and contains(@class, 'fmi-menu-link')]");

    public void kampanyakabuledilir(){
        Action.clickElement(kampbutton);
        Shadow shadow = new Shadow(driver);
        shadow.findElementByXPath(("//*[.='Kabul Et']")).click();
    }
    public void magazaAcilir() throws Exception {
        Action.scrollUntilVisible(magazabutton);
        Action.clickElement(magazabutton);
    }

}




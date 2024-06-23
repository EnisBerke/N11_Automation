package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.List;

public class ResultPageAlternative extends BasePage {
    @FindBy(className = "resultText")
    private WebElement resultTextLocator;

    @FindBy(className = "productName")
    private WebElement productNameLocator;

    @FindAll(@FindBy(className = "productName"))
    public List<WebElement> productList;



    public ResultPageAlternative(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getResultTextLocator() {
        return resultTextLocator;
    }

    public void clickProductNameLocator() {
        productNameLocator.click();
    }

    public void clickToProduct(int index) {
        productList.get(index).click();
    }
}

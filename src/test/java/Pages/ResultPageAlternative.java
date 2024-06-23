package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPageAlternative extends BasePage {
    @FindBy(className = "resultText")
    private WebElement resultTextLocator;
    @FindBy(className = "productName")
    private WebElement productNameLocator;



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
}

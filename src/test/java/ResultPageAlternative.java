import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPageAlternative {
    private final WebDriver driver;

    private final By resultTextLocator = By.className("resultText");

    private final By productNameLocator = By.className("productName");



    public ResultPageAlternative(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getResultTextLocator() {
        return driver.findElement(resultTextLocator);
    }

    public void clickProductNameLocator() {
        driver.findElement(productNameLocator).click();
    }
}

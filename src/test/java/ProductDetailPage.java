import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage {
    private final WebDriver driver;

    private final By addToBasketLocator = By.className("addBasketUnify");

    public ProductDetailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddToCard() {
        driver.findElement(addToBasketLocator).click();
    }
}
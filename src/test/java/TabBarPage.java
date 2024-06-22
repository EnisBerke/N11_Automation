import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TabBarPage {
    private WebDriver driver;

    private final By notificationDenyButton = By.xpath("//*[@id=\"dengage-push-perm-slide\"]/div/div[2]/div[2]/button[1]");

    private final By searchBar = By.id("searchData");

    private final By basketHolder = By.className("myBasketHolder");

    private final By basketItemCount = By.className("basketTotalNum");

    public TabBarPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getActionBasketHolderNotificationDenyButton() {
        driver.findElement(notificationDenyButton).click();
    }

    public void getBasketHolder() {
        driver.findElement(basketHolder).click();
    }

    public void setSearchBar(String word) {
        driver.findElement(searchBar).sendKeys(word+ Keys.ENTER);
    }

    public String getBasketItemCount() {
       return driver.findElement(basketItemCount).getText();
    }
}

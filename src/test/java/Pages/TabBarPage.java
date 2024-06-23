package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabBarPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"dengage-push-perm-slide\"]/div/div[2]/div[2]/button[1]")
    private WebElement notificationDenyButton;

    @FindBy(id = "searchData")
    private WebElement searchBar;

    @FindBy(className = "myBasketHolder")
    private WebElement basketHolder;

    @FindBy(className = "basketTotalNum")
    private WebElement basketItemCount;

    public TabBarPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void getActionBasketHolderNotificationDenyButton() {
        notificationDenyButton.click();
    }

    public void getBasketHolder() {
        basketHolder.click();
    }

    public void setSearchBar(String word) {
        searchBar.sendKeys(word+ Keys.ENTER);
    }

    public String getBasketItemCount() {
       return basketItemCount.getText();
    }
}

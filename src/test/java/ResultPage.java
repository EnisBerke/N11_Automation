import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ResultPage {
    private final WebDriver driver;

    private final By resultTextLocator = By.className("resultText");

    private final By rightFilterPlaceLocator = By.className("filter-place-right filter-place-button-box");

    private final By filterPlaceSpecialTransfer = By.xpath("//*[@id=\"contentListing\"]/div/div[2]/div[2]/section/div[1]/div[2]/div[2]/div[1]");

    private final By filterPlaceDayTransfer = By.xpath("//*[@id=\"contentListing\"]/div/div[2]/div[2]/section/div[1]/div[2]/div[2]/div[2]");

    private final By filterPlace = By.className("filter-place-pin-box agt-filter-pick filter-place-popup-hover");

    private final By myLocationInfoPopup = By.id("myLocation-close-info");

    private final By filterLocationCity = By.id("headerMyLocationCityId");

    private final By filterLocationDistrict = By.id("headerMyLocationDistrictId");

    private final By filterLocationSelectButton = By.id("headerMyLocationDistrictId");

    private final By sortingTypeDropdown = By.className("selected-item");

    private final By productNameLocator = By.className("productName");

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getResultTextLocator() {
        return driver.findElement(resultTextLocator);
    }

    public WebElement getRightFilterPlaceLocator() {
        return driver.findElement(rightFilterPlaceLocator);
    }

    public WebElement getFilterPlaceSpecialTransfer() {
        return driver.findElement(filterPlaceSpecialTransfer);
    }

    public WebElement getFilterPlaceDayTransfer() {
        return driver.findElement(filterPlaceDayTransfer);
    }

    public void clickFilterPlace() {
        driver.findElement(filterPlace).click();
    }

    public void clickMyLocationInfoPopup() {
        driver.findElement(myLocationInfoPopup).click();
    }

    public WebElement getFilterLocationCity() {
       return driver.findElement(filterLocationCity);

    }

    public WebElement getFilterLocationDistrict() {
        return driver.findElement(filterLocationDistrict);
    }

    public void clickFilterLocationSelectButton() {
        driver.findElement(filterLocationSelectButton).click();
    }

    public void getSortingTypeDropdown() {
        WebElement dropDownElement = driver.findElement(sortingTypeDropdown);
        Select dropDown = new Select(dropDownElement);
        dropDown.selectByIndex(2);
    }

    public void clickProductNameLocator() {
        driver.findElement(productNameLocator).click();
    }
}

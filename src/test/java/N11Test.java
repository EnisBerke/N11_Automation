import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class N11Test extends BaseTest{

    TabBarPage tabBarPage;

    ResultPage resultPage;

    ResultPageAlternative resultPageAlternative;

    ProductDetailPage productDetailPage;

    @Test(priority = 1)
    public void searchTest() {
        driver.get("https://www.n11.com/");

        tabBarPage = new TabBarPage(driver);

        tabBarPage.setSearchBar("Mac Book");
    }

    @Test(priority = 2)
    public void resultTest() {
        resultPageAlternative = new ResultPageAlternative(driver);

        WebElement resultText = resultPageAlternative.getResultTextLocator();
        softAssert.assertTrue(resultText.isDisplayed());
        resultPageAlternative.clickProductNameLocator();

    }

    @Test(priority = 3)
    public void productBasket() throws InterruptedException {
        productDetailPage = new ProductDetailPage(driver);
        tabBarPage = new TabBarPage(driver);

        productDetailPage.clickAddToCard();
        String productCount = tabBarPage.getBasketItemCount();
        Thread.sleep(3000);
        softAssert.assertNotEquals(productCount,"0");
    }
}

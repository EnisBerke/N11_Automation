package Tests;

import Pages.ProductDetailPage;
import Pages.ResultPage;
import Pages.ResultPageAlternative;
import Pages.TabBarPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class N11Test extends BaseTest {

    TabBarPage tabBarPage;

    ResultPage resultPage;

    ResultPageAlternative resultPageAlternative;

    ProductDetailPage productDetailPage;

    @Test(priority = 1)
    public void searchTest() {
        tabBarPage = new TabBarPage(driver);
        tabBarPage.navigateTo("https://www.n11.com/");
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

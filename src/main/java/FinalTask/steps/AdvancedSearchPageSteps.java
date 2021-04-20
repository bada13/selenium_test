package FinalTask.steps;

import FinalTask.AdvancedSearchPage;
import FinalTask.CatalogHeadphonesYandex;
import FinalTask.CatalogTvYandex;
import FinalTask.MarketYandex;
import org.junit.Assert;
import ru.yandex.qatools.allure.annotations.Step;

public class AdvancedSearchPageSteps {

    @Step("Ввод цены От {0}")
    public void stepPriceFrom(String price){
        new AdvancedSearchPage().selectPriceFrom(price);
    }

    @Step("выбрать производителя {0}")
    public void stepManufacturer(String brand){
        new AdvancedSearchPage().selectManufacturer(brand);
    }

    @Step("Применить фильтр")
    public void stepSubmitFilter(){
        new AdvancedSearchPage().submitFilter.click();
    }

    @Step("Поиск первого товара на сайте TV")
    public void stepHeaderSearchFirstProductTv(){
        CatalogTvYandex catalogTvYandex = new CatalogTvYandex();
        String firstTv = catalogTvYandex.firstProduct.getText();
        MarketYandex marketYandex = new MarketYandex();
        marketYandex.headerSearch.sendKeys(firstTv);
        marketYandex.submitSearch.click();
        Assert.assertEquals(catalogTvYandex.firstProduct.getText(),firstTv);
    }

    @Step("Поиск первого товара на сайте Headphones")
    public void stepHeaderSearchFirstProductHeadphones(){
        CatalogHeadphonesYandex catalogHeadphonesYandex = new CatalogHeadphonesYandex();
        String firstHeadphones = catalogHeadphonesYandex.firstProduct.getText();
        MarketYandex marketYandex = new MarketYandex();
        marketYandex.headerSearch.sendKeys(firstHeadphones);
        marketYandex.submitSearch.click();
        Assert.assertEquals(catalogHeadphonesYandex.firstProduct.getText(),firstHeadphones);
        //System.out.printf(firstHeadphones);
    }



//======================================================================================

    @Step("Ввод цены От 20000")
    public void priceFromTv(){
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage();
        advancedSearchPage.priceFrom.click();
        advancedSearchPage.priceFrom.sendKeys("20000");
    }

    @Step("Ввод цены От 5000")
    public void priceFromHeadphones(){
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage();
        advancedSearchPage.priceFrom.click();
        advancedSearchPage.priceFrom.sendKeys("5000");
    }

    @Step("выбрать производителя Samsung")
    public void manufacturerSamsung(){
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage();
        advancedSearchPage.manufacturer.click();
        advancedSearchPage.manufacturer.sendKeys("Samsung");
        advancedSearchPage.findManufacturer.click();
    }

    @Step("выбрать производителя LG")
    public void manufacturerLg(){
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage();
        advancedSearchPage.manufacturer.click();
        advancedSearchPage.manufacturer.sendKeys("LG");
        advancedSearchPage.findManufacturer.click();
    }

    @Step("выбрать производителя Beats")
    public void manufacturerBeats(){
        AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage();
        advancedSearchPage.manufacturer.click();
        advancedSearchPage.manufacturer.sendKeys("Beats");
        advancedSearchPage.findManufacturer.click();
    }
}

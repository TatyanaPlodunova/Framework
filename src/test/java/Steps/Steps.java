package Steps;
import Business.HomePage;
import Business.ResultPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.util.List;



public class Steps {
    private HomePage homePage = new HomePage();
    private ResultPage resultPage = new ResultPage();

    Logger log = LoggerFactory.getLogger(HomePage.class);

    public void enterValueAndSearch(String searchValue) {
        log.error("Ввод значения " + searchValue + " для поиска");
        homePage.clickSearchButton();
        homePage.enterValueInSearchInput(searchValue);
        homePage.clickEnterOnSearchInput();
    }

    public void verifySearchResult(String searchValue) {
        List<Boolean> resultList = resultPage.getSearchResultList(searchValue);
        for (Boolean result : resultList) { // цикл для проверки каждой переменной
            Assert.assertTrue(result, "В результатах поиска нет искомого значения" + searchValue);
        }
    }
}

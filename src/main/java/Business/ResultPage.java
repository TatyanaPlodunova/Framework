package Business;

import Core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ResultPage {
    private final By searchResults = By.xpath("//a[@class='rf-serp-productname-link']");
    private final WebDriver driver = Driver.getWebDriver();

    public void verifySearchResult() {
        List<WebElement> searchResultElements = driver.findElements(searchResults);
        int size = searchResultElements.size();

        for (int i = 0; i < size; ++i) {
            WebElement searchResultElement = searchResultElements.get(i);
            String searchResultsText = searchResultElement.getText();
            searchResultsText.contains("iPhone 15");
            System.out.println(searchResultsText.contains("iPhone 15"));
        }
    }
}

//TODO
// все значения в скобках - вынести в переменные (iPhone 15) - по аналогии как мы сделали с названием сайта


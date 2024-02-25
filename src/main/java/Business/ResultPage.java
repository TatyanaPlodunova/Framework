package Business;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultPage extends BasePage {
    private final By searchResults = By.xpath("//a[@class='rf-serp-productname-link']");

    public void verifySearchResult(String result) {
        List<WebElement> searchResultElements = driver.findElements(searchResults);
        int size = searchResultElements.size();

        for (int i = 0; i < size; ++i) {
            WebElement searchResultElement = searchResultElements.get(i);
            String searchResultsText = searchResultElement.getText();
            searchResultsText.contains(result);
            System.out.println(searchResultsText.contains(result));
        }
    }
}

//TODO-done
// все значения в скобках - вынести в переменные (iPhone 15) - по аналогии как мы сделали с названием сайта


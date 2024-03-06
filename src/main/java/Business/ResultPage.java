package Business;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultPage extends BasePage {
    private final By searchResults = By.xpath("//a[@class='rf-serp-productname-link']");

    public List<Boolean> getSearchResultList(String result) { // для получения листа булиевых переменных
        List<WebElement> searchResultElements = driver.findElements(searchResults); // лист веб-элементов найденных по xpath
        int size = searchResultElements.size(); // размер листа веб-элементов
        List<Boolean> resultList = new ArrayList<>(); // лист булиевых переменных по результатам поиска

        for (int i = 0; i < size; ++i) { // цикл для сравнения результата поиска и получения булиевой переменной
            WebElement searchResultElement = searchResultElements.get(i); // вычленение i элемента из листа веб-элементов
            String searchResultsText = searchResultElement.getText(); // получение текста из элемента i
            Boolean finalResult = searchResultsText.contains(result); // получиние булиевой переменной по результатам сопоставления текста
            resultList.add(finalResult); // добавление булиевой переменной в лист resultList
        }

        return resultList; // возвращение листа булиевых переменных
    }

    public void verifySearchResult(List<Boolean> resultList) {
        int size = resultList.size(); // размер листа булиевых переменных
        for (int i = 0; i < size; ++i) { // цикл для проверки каждой переменной
            Boolean result = resultList.get(i); // вычленение i элемента из листа
            // Assert.assertTrue(result, "В результатах поиска нет искомого значения" + searchValue);
        }

    }}

// все значения в скобках - вынести в переменные (iPhone 15) - по аналогии как мы сделали с названием сайта
// TODO создать класс степс там где тест-джава.
//  добавить метод verifySearchResult. в цикле проверить ассерт - что у нас каждый результат из списка = тру


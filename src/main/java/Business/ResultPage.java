package Business;
import Core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ResultPage {
    private final By searchResults = By.xpath("//div[@class='rf-serp-explore-curated']");
    private final WebDriver driver = Driver.getWebDriver();

    public void verifySearchResult() {
        WebElement searchResultElement = driver.findElement(searchResults);
        String searchResultsText = searchResultElement.getText();
        searchResultsText.contains("iPhone 15");
        System.out.println(searchResultsText.contains("iPhone 15"));
    }
}

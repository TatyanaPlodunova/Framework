import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AppleTest {
    public static void main(String[] args) {
        // 1. Открыть сайт
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.apple.com/");

        // 2. Нажать кнопку поиска
        WebElement searchButton = driver.findElement(By.xpath("//a[@class='globalnav-link globalnav-link-search']"));
        searchButton.click();

        // 3. Найти "iPhone 15"
        int seconds = 5;
        Duration duration = Duration.ofSeconds(seconds);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='globalnav-searchfield-input']")));
        searchInput.isDisplayed();
        searchInput.sendKeys("iphone 15");
        searchInput.sendKeys(Keys.ENTER);

        // 4. Проверить, что результаты поиска содержат "iPhone 15"
        WebElement searchResults = driver.findElement(By.xpath("//div[@class='rf-serp-explore-curated']"));
        String searchResultsText = searchResults.getText();
        searchResultsText.contains("iPhone 15");
        System.out.println(searchResultsText.contains("iPhone 15"));
        driver.quit();
    }
}

// Test layer (находится в папке src -> test -> java)
// здесь будет тестовый класс AppleTest, в котором находится тестовый метод (тест).
// Класс может содержать набор тестов (методов).
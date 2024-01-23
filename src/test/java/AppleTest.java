import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppleTest {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.apple.com/");

        // 2. Нажать кнопку поиска
        WebElement searchButton = driver.findElement(By.xpath("//a[@class='globalnav-link globalnav-link-search']"));
        searchButton.click();

        // 3. Найти "iPhone 15"
        WebElement searchInput = driver.findElement(By.xpath("//input[@class='globalnav-searchfield-input']"));
        searchInput.sendKeys("iPhone 15", Keys.ENTER);

        // 4. Проверить, что результаты поиска содержат "iPhone 15"

        driver.quit();
    }
}

// Test layer (находится в папке src -> test -> java)
// здесь будет тестовый класс AppleTest, в котором находится тестовый метод (тест).
// Класс может содержать набор тестов (методов).
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppleTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.apple.com/");

        // 2. Нажать кнопку поиска
        WebElement searchButton = driver.findElement(By.xpath("//a[@class='globalnav-link globalnav-link-search']"));
        searchButton.click();

        // 3. Найти "iPhone 15"
        WebElement searchInput = driver.findElement(By.xpath("//input[@class='globalnav-searchfield-input']"));
        searchInput.isDisplayed();
        System.out.println(searchInput.isDisplayed());
        // проверить видимость черной выпадашки - по элементу который там есть (например кусочек текста)
        // проверить видимость поля с дополнительным аттрибутом(на скрине)

        // 4. Проверить, что результаты поиска содержат "iPhone 15"
        // локатор который не затрагивает новости, а затрагивает только телефоны

        driver.quit();
    }
}

// Test layer (находится в папке src -> test -> java)
// здесь будет тестовый класс AppleTest, в котором находится тестовый метод (тест).
// Класс может содержать набор тестов (методов).
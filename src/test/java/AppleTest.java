import Business.HomePage;
import Business.ResultPage;
import Core.Driver;
import org.openqa.selenium.WebDriver;
public class AppleTest {
    public static void main(String[] args) {
        WebDriver driver = Driver.getWebDriver(); // getWebDriver возвращает созданный объект driver
        Driver.openPage("https://www.apple.com/"); // 1. Открываем сайт

        HomePage homePage = new HomePage(); // создаем новый объект homePage класса HomePage
        homePage.clickSearchButton(); // 2. Нажимаем кнопку поиска
        homePage.clickSearchInput();  // 3. вводим поисковой запрос

        ResultPage resultPage = new ResultPage(); // создаем новый объект resultPage класса ResultPage
        resultPage.verifySearchResult(); // 4. проверяем поисковую выдачу

        Driver.closeBrowser(); // закрываем браузер
    }
}

// Test layer (находится в папке src -> test -> java)
// здесь будет тестовый класс AppleTest, в котором находится тестовый метод (тест).
// Класс может содержать набор тестов (методов).
// в последнем шаге нужно проверить, что каждый найденный элемент содержит искомое значение !!!

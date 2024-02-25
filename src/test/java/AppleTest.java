import Business.HomePage;
import Business.ResultPage;
import org.testng.annotations.Test;

public class AppleTest extends BaseTest {
    @Test(description = "Проверка соответствия результатов поиска запросу")
    public static void main(String[] args) {
        BaseTest.openBrowser();

        HomePage homePage = new HomePage(); // создаем новый объект homePage класса HomePage
        homePage.clickSearchButton(); // 2. Нажимаем кнопку поиска
        homePage.clickSearchInput();  // 3. вводим поисковой запрос

        ResultPage resultPage = new ResultPage(); // создаем новый объект resultPage класса ResultPage
        resultPage.verifySearchResult("iPhone 15"); // 4. проверяем поисковую выдачу

        BaseTest.closeBrowser();
    }
}

// Test layer (находится в папке src -> test -> java)
// здесь будет тестовый класс AppleTest, в котором находится тестовый метод (тест).
// Класс может содержать набор тестов (методов).
// в последнем шаге нужно проверить, что каждый найденный элемент содержит искомое значение !!!

//TODO-done поставить аннотацию @тест над методом и назвать его понятным названием

// todo выделить класс steps, где будут собраны типовые шаги



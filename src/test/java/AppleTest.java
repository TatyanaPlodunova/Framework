import Business.HomePage;
import Business.ResultPage;
import Steps.VerifyResult;
import org.testng.annotations.Test;
import org.testng.Assert;

public class AppleTest extends BaseTest {

    @Test(description = "Проверка соответствия результатов поиска запросу")
    public void verifySearchResult() {
        final String searchValue = "iPhone 15";
        HomePage homePage = new HomePage(); // создаем новый объект homePage класса HomePage
        homePage.clickSearchButton(); // 2. Нажимаем кнопку поиска
        homePage.enterValueInSearchInput();
        homePage.clickEnterOnSearchInput();
}}

// Test layer (находится в папке src -> test -> java)
// здесь будет тестовый класс AppleTest, в котором находится тестовый метод (тест).
// Класс может содержать набор тестов (методов).
// в последнем шаге нужно проверить, что каждый найденный элемент содержит искомое значение !!!

//поставить аннотацию @тест над методом и назвать его понятным названием

// todo выделить класс steps, где будут собраны типовые шаги

// todo - добавить логи slf4j (например к степам - подписать что делает степ) - погуглить



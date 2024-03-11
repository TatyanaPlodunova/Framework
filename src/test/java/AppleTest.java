import Steps.Steps;
import org.testng.annotations.Test;

public class AppleTest extends BaseTest {

    @Test(description = "Проверка соответствия результатов поиска запросу")
    public void verifySearchResult() {
        final String searchValue = "iPhone 15";

        Steps steps = new Steps();
        steps.enterValueAndSearch(searchValue);
        steps.verifySearchResult(searchValue);

    }
}

// Test layer (находится в папке src -> test -> java)
// здесь будет тестовый класс AppleTest, в котором находится тестовый метод (тест).
// Класс может содержать набор тестов (методов).
// в последнем шаге нужно проверить, что каждый найденный элемент содержит искомое значение !!!

//поставить аннотацию @тест над методом и назвать его понятным названием

// выделить класс steps, где будут собраны типовые шаги

// todo - добавить логи slf4j (например к степам - подписать что делает степ) - погуглить



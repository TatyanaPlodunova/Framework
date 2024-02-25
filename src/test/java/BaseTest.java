import Core.Driver;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {

    public static void openBrowser() {
        WebDriver driver = Driver.getWebDriver(); // getWebDriver возвращает созданный объект driver
        Driver.openPage("https://www.apple.com/");
    }

    public static void closeBrowser() {

        Driver.closeBrowser();
    }

}


// Создать класс BaseTest и унаследоваться от него.
// TODO-done BaseTest будет содержать открытие и закрытие браузера, необходимые настройки браузера - общие для всех тестов.
import Core.Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {

    @BeforeTest
    public static void openBrowser() {
        Driver.getWebDriver(); // открыли браузер
        Driver.openPage("https://www.apple.com/"); // открыли страницу в браузере
        Driver.maximizeWindow(); // развернули на весь экран
    }

    @AfterTest
    public static void closeBrowser() {

        Driver.closeBrowser();
    }

}

// Создать класс BaseTest и унаследоваться от него.
// BaseTest будет содержать открытие и закрытие браузера, необходимые настройки браузера - общие для всех тестов.

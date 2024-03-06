import Core.Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;


public class BaseTest {

    @BeforeTest
    public static void openBrowser() {
        Driver.getWebDriver();
        Driver.openPage("https://www.apple.com/");
    }

    @AfterTest
    public static void closeBrowser() {
        Driver.closeBrowser();
    }

}

// Создать класс BaseTest и унаследоваться от него.
// BaseTest будет содержать открытие и закрытие браузера, необходимые настройки браузера - общие для всех тестов.
package Business;

import Core.Driver;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected final WebDriver driver = Driver.getWebDriver();
}

// Создать класс BasePage и унаследоваться от него.
// BasePage будет содержать общее для всех страниц, например - драйвер



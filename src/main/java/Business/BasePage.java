package Business;

import Core.Driver;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    protected final WebDriver driver = Driver.getWebDriver();

    Logger log = LoggerFactory.getLogger(BasePage.class);

}

// Создать класс BasePage и унаследоваться от него.
// BasePage будет содержать общее для всех страниц, например - драйвер



package Business;

import Core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    private final By searchButton = By.xpath("//a[@id='globalnav-menubutton-link-search']");
    private final By searchInput = By.xpath("//input[@class='globalnav-searchfield-input']");

    public void clickSearchButton() {
        WebElement searchButtonElement = driver.findElement(searchButton);
        searchButtonElement.click();
    }

    public void clickSearchInput() {
        WebDriverWait wait = Driver.getWebDriverWait(); // ждем появления шторки с инпутом
        WebElement searchInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(searchInput));
        searchInputElement.sendKeys("iPhone 15");
        searchInputElement.sendKeys(Keys.ENTER);
    }
}

// Business layer (в папке src -> main -> java)
// здесь находится вся логика приложения, Page Object, классы с данными, степы
// Page object - классы, которые соответствуют каждой тестируемой странице приложения
// внутри элементы - поля класса и методы - что с этими элементами делаем.
// Все действия с элементами должны быть залогированы. Т.е. должен быть лог, в котором понятно описано действие.
//TODO-done
// By.xpath("//a[@class='globalnav-link globalnav-link-search']") - нестабильный локатор из-за пробела !!!

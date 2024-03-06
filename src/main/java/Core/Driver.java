package Core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {
    private static WebDriver driver; // поля в классе должны быть защищены private

    private Driver() {
    } // приватный конструктор драйвер, что бы невозможно было создать объект класса Driver в другом месте

    public static WebDriver getWebDriver() { // в методе указали WebDriver вместо void
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(); // объявляем переменную драйвер
        }
        return driver; // возвращаем driver типа WebDriver
    }

    // почитать про паттерн сингл тон
    // открытие браузера - сделали так, что бы открывался только один браузер

    public static void openPage(String page) { // дописали void т.к не надо return

        driver.get(page); // открываем ссылку в браузере
    }

    public static WebDriverWait getWebDriverWait() { // по аналогии с WebDriver getWebDriver()
        int seconds = 5;
        Duration duration = Duration.ofSeconds(seconds);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        return wait;
    }

    public static WebElement waitElementIsVisible(By element) {
        WebDriverWait wait = Driver.getWebDriverWait(); // ждем появления элемента
        WebElement elementIsVisible = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return elementIsVisible;
    }

    public static void closeBrowser() {

        driver.quit(); // закрываем браузер
    }
}

// Core layer (в папке src -> main -> java)
// class Driver - инициализация WebDriver, настройка браузера (Browser capabilities)

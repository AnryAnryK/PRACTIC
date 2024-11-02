package Yandex;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class YandexPageFindsTest {

	@Test

	@BeforeEach
		public void YandexPageFinds() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
		open("https://ya.ru");
//		Selenide.clearBrowserCookies(); // очистить кукис  - но КАПЧА всё равно лезет и её не убрать
//		Selenide.clearBrowserLocalStorage();  // очистить локал сториез  - но КАПЧА всё равно лезет и её не убрать
//		executeJavaScript("sessionStorage.clear();"); // очистить сессион сториез  - но КАПЧА всё равно лезет и её не убрать

//sleep(999999999);

//		$x(".//*[@id='text']").setValue("Яндекс");


	}


}

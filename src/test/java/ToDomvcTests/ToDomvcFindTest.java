package ToDomvcTests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class ToDomvcFindTest {
	@Test

	public void TodomvcFindTest(){
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

		step("1 Шаг: зайти на сайт https://todomvc.com/", () ->
		{open("https://todomvc.com/");});


		step("2 Шаг: нажать на _ View on GitHub", () ->
		{$x(".//*[@class='zocial ltgray']").click();});

		step("3 Шаг: нажать на Master и выбрать из выпадающего списка ветку UPDATE", () ->
		//{$x(".//span[@class='Box-sc-g0xbh4-0 bmcJak prc-Text-Text-0ima0']").click();}); -  с этим локатором почему-то не отрабатывало, хотя и в Элементах, и в Консоли ДевТулз он ищется
		{$x(".//*[@class='Box-sc-g0xbh4-0 CEgMp']").click();});
		{$x(".//*[@class='Box-sc-g0xbh4-0 exqcOX' and starts-with(text(), 'update')]").click();};


//		sleep(999999999);
	}
}

package SelenideTests.Lesson3;

import com.codeborne.selenide.Configuration;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FindInGitHubSelenideWikiSoftAssertionsJUnit5 {

	@Test
	@Description("Урок 3 - проверить, что в ГитХабе на странице Селенида есть пример кода для JUnit5")
	// УСПЕШНО !!!

	public void OpenGitHubPage() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";

		//  1 Шаг: Открыь страницу Github https://github.com/
		open("https://github.com/");

		//  2 Шаг: нажать на Поисковую строку
		$x(".//*[@data-target='qbsearch-input.inputButtonText']").click();

		//  3 Шаг: Ввести в поисковую строку слово Selenide и нажать Enter
		$x(".//*[@id='query-builder-test']").setValue("Selenide").pressEnter();

		//  4 Шаг: Нажать на строку / раздел Selenide
		$x(".//*[@class='Link__StyledLink-sc-14289xe-0 dIlPa']").click();

		//  5 Шаг: Перейти в раздел Wiki проекта (нажать на Раздел Wiki)
		$x(".//*[@id='wiki-tab']").click();

		//  6 Шаг: Убедиться, что в списке страниц (Pages) есть страница Soft assertions и нажать на неё
		$x(".//*[@href='/selenide/selenide/wiki/SoftAssertions']").shouldHave(text("Soft assertions"))
				.click();

		//  7 Шаг: Проверить, что внутри страницы есть пример кода для JUnit5
		$x(".//*[contains(text(), 'JUnit5 extension - ')]").shouldHave(text("JUnit5 extension - "));

		// УСПЕШНО !!!
	}
}

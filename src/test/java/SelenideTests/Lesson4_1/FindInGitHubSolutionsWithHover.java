package SelenideTests.Lesson4_1;

import com.codeborne.selenide.Configuration;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FindInGitHubSolutionsWithHover {

	@Test
	@Description("Урок 4 - проверить, что в ГитХабе меню Solutions -> Enterprize загрузилась нужная страница (например что заголовок - Build like the best")
	// УСПЕШНО !!!

	public void OpenGitHubPage() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";

		// 1 Шаг: Откройте страницу Github https://github.com/
		open("https://github.com/");

		//  2 Шаг: Навести курсор на Раздел "Solutions"
		$x(".//*[@class='HeaderMenu-link border-0 width-full width-lg-auto px-0 px-lg-2 py-lg-2 no-wrap d-flex flex-items-center flex-justify-between js-details-target' and contains(text(), 'Solutions')]")
				.hover();

		//  3 Шаг: Нажать на раздел Enterprize
		$x(".//*[@href='https://github.com/enterprise']")
				.click();

		//  4 Шаг: Проверить, что внутри страницы есть текст "To build, scale, and deliver secure software"
		$x(".//*[@class='Primer_Brand__Text-module__Text___pecHN Primer_Brand__Text-module__Text-font--mona-sans___GpzSG Primer_Brand__Text-module__Text--default___DChoE Primer_Brand__Text-module__Text--500___orDRu Primer_Brand__Text-module__Text--weight-normal___siVLX Primer_Brand__Hero-module__Hero-description___vG4iA']")
				.shouldHave(text("To build, scale, and deliver secure software."));

		// УСПЕШНО !!!
	}
}

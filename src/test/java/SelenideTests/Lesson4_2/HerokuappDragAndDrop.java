package SelenideTests.Lesson4_2;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HerokuappDragAndDrop {

	@Test
	@Description("Drag and drop - перенести автоматически фигуры с места на место и проверить исполнение")

	// УСПЕШНО !!!

	public void DragAndDrops() {
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";

		// 1 Шаг: Зайти на сайт https://the-internet.herokuapp.com/drag_and_drop
		open("https://the-internet.herokuapp.com/drag_and_drop");

		// 2 Шаг: Перенести фигуру А на место В
		// определить местоположение фигуры А
		// $x(".//*[@id='column-a']")
		// определить местоположение фигуры В
		// $x(".//*[@id='column-b']")
		//выполнить перемещение
		$x(".//*[@id='column-a']").dragAndDrop(DragAndDropOptions.to($x(".//*[@id='column-b']")));

		// 3 Шаг: Проверить перенос фигур
		$x(".//*[@id='column-a']").shouldHave(text ("B"));
		$x(".//*[@id='column-b']").shouldHave(text ("A"));

		// УСПЕШНО !!!
	}
}

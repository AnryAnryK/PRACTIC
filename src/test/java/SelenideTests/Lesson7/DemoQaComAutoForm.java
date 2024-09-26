package SelenideTests.Lesson7;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DemoQaComAutoForm {


	@Test
	@Description("автотест на проверку формы https://demoqa.com/automation-practice-form")

	//	УСПЕШНО !!!

	public void DemoQaComAutoFormTest() {

		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";

		// 1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form
		open("https://demoqa.com/automation-practice-form");

		// 2 Шаг: заполнить форму
		$x(".//*[@id='firstName']").setValue("Mark");
		$x(".//*[@id='lastName']").setValue("Petrov");
		$x(".//*[@id='userEmail']").setValue("MarkPetrov@mail.com");
		$x(".//*[@class='practice-form-wrapper']").$(byText("Male")).click();
		$x(".//*[@id='userNumber']").setValue("1234568910");
		$x(".//*[@id='dateOfBirthInput']").click();
		$x(".//*[@class='react-datepicker__month-select']").$(byText("January")).click();
		$x(".//*[@class='react-datepicker__year-select']").$(byText("1900")).click();
		$x(".//*[@class='react-datepicker__day react-datepicker__day--001']").click();
		$x(".//*[@id='subjectsInput']").setValue("English").pressEnter();
		$x(".//*[@id='hobbiesWrapper']").$(byText("Sports")).click();
		$x(".//*[@id='uploadPicture']").uploadFromClasspath("sampleFile1.jpeg");
		$x(".//*[@id='currentAddress']").setValue("Russia, Moscow 1");
		$x(".//*[@class=' css-1wa3eu0-placeholder']").click();
		$x(".//*[@id='stateCity-wrapper']").$(byText("Rajasthan")).click();
		$x(".//*[@class=' css-1wa3eu0-placeholder']").click();
		$x(".//*[@id='stateCity-wrapper']").$(byText("Jaiselmer")).click();
		$x(".//*[@id='submit']").click();

		// 3 Шаг: проверить данные заполнной формы
		$x(".//*[@id='example-modal-sizes-title-lg']").shouldHave(text("Thanks for submitting the form"));
		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']").shouldHave(text("Student Name"),
				text("Mark Petrov"),
				text("Student Email"),
				text("MarkPetrov@mail.com"),
				text("Gender"),
				text("Male"),
				text("Mobile"),
				text("1234568910"),
				text("Date of Birth"),
				text("01 January,1900"),
				text("Subjects"),
				text("English"),
				text("Hobbies"),
				text("Sports"),
				text("Picture"),
				text("sampleFile1.jpeg"),
				text("Address"),
				text("Russia, Moscow 1"),
				text("State and City"),
				text("Rajasthan Jaiselmer"));
	//	УСПЕШНО !!!
	}
}

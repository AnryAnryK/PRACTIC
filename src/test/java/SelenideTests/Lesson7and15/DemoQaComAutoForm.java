package SelenideTests.Lesson7and15;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class DemoQaComAutoForm extends DemoQaComAutoFormTestBase {


	@Test
	@Description("Автотест на проверку заполнения формы https://demoqa.com/automation-practice-form")
	@Owner("Калинченко Андрей Дмитриевич")

	//	УСПЕШНО !!!

	public void DemoQaComAutoFormTest() {

		// 1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form
		step("1 Шаг: зайти на сайт https://demoqa.com/automation-practice-form", () ->
		{
			open(website);
		});


		// 2 Шаг: Заполнить форму
		step("2 Шаг: Заполнить форму - Имя", () ->
		{
			$x(".//*[@id='firstName']").setValue("Mark");
		});

		step("2 Шаг: Заполнить форму - Фамилию", () ->
		{
			$x(".//*[@id='lastName']").setValue("Petrov");
		});

		step("2 Шаг: Заполнить форму - Электронную почту", () ->
		{
			$x(".//*[@id='userEmail']").setValue("MarkPetrov@mail.com");
		});

		step("2 Шаг: Заполнить форму - Пол", () ->
		{
			$x(".//*[@class='practice-form-wrapper']").$(byText("Male")).click();
		});

		step("2 Шаг: Заполнить форму - Телефон", () ->
		{
			$x(".//*[@id='userNumber']").setValue("1234568910");
		});

		step("2 Шаг: Заполнить форму - Дату рождения", () ->
		{
			$x(".//*[@id='dateOfBirthInput']").click();

			$x(".//*[@class='react-datepicker__month-select']").$(byText("January")).click();
			$x(".//*[@class='react-datepicker__year-select']").$(byText("1900")).click();
			$x(".//*[@class='react-datepicker__day react-datepicker__day--001']").click();
		});

		step("2 Шаг: Заполнить форму - Предмет / Область знаний/работы", () ->
		{
			$x(".//*[@id='subjectsInput']").setValue("English").pressEnter();
		});

		step("2 Шаг: Заполнить форму - Хобби", () ->
		{
			$x(".//*[@id='hobbiesWrapper']").$(byText("Sports")).click();
		});

		step("2 Шаг: Заполнить форму - Загрузить/прикрепить файл в форму", () ->
		{
			$x(".//*[@id='uploadPicture']").uploadFromClasspath("sampleFile1.jpeg");
		});

		step("2 Шаг: Заполнить форму - Адрес", () ->
		{
			$x(".//*[@id='currentAddress']").setValue("Russia, Moscow 1");
		});

		step("2 Шаг: Заполнить форму - Штат", () ->
		{
			$x(".//*[@class=' css-1wa3eu0-placeholder']").click();
			$x(".//*[@id='stateCity-wrapper']").$(byText("Rajasthan")).click();
		});

		step("2 Шаг: Заполнить форму - Город", () ->
		{
			$x(".//*[@class=' css-1wa3eu0-placeholder']").click();
			$x(".//*[@id='stateCity-wrapper']").$(byText("Jaiselmer")).click();
			$x(".//*[@id='submit']").click();
		});


		// 3 Шаг: Проверить данные заполненной формы
		step("3 Шаг: Проверить данные заполненной формы - наличие подтверждающей фразы 'Thanks for submitting the form'", () -> {
			$x(".//*[@id='example-modal-sizes-title-lg']").shouldHave(text("Thanks for submitting the form"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Имя и Фамилия - 'Mark Petrov'", () -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Student Name"))
					.sibling(0)
					.shouldHave(text("Mark Petrov"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Электронная почта - 'MarkPetrov@mail.com'", () -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Student Email"))
					.sibling(0)
					.shouldHave(text("MarkPetrov@mail.com"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Пол - 'Male'", () -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Gender"))
					.sibling(0)
					.shouldHave(text("Male"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Телефон - '1234568910'", () -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Mobile"))
					.sibling(0)
					.shouldHave( text("1234568910"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Дата рождения - '01 January,1900'", () -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Date of Birth"))
					.sibling(0)
					.shouldHave(
					text("01 January,1900"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Предмет / Область знаний/работы  - 'English'", () -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Subjects"))
					.sibling(0)
					.shouldHave(text("English"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Хобби - 'Sports'", () -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Hobbies"))
					.sibling(0)
					.shouldHave(text("Sports"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Picture - соответствует загруженной с названием 'sampleFile1.jpeg'", () -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Picture"))
					.sibling(0)
					.shouldHave(text("sampleFile1.jpeg"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Адрес - 'Russia, Moscow 1'", () -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "Address"))
					.sibling(0)
					.shouldHave(text("Russia, Moscow 1"));
		});

		step("3 Шаг: Проверить данные заполненной формы - Штат и Город - 'Rajasthan Jaiselmer'", () -> {
			$x(".//*[@class='table table-dark table-striped table-bordered table-hover']")
					.$(byTagAndText("td", "State and City"))
					.sibling(0)
					.shouldHave(text("Rajasthan Jaiselmer"));
		});
//sleep(99999999);
		//	УСПЕШНО !!!
	}
}

package com.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class RequestUseer_4_1 {
	public static ApplicationManager app;
	WebDriver driver;
	

	public RequestUseer_4_1() {

		app = new ApplicationManager();
	}

	public SelenideElement country() {
		return $(By.xpath("//button[@class='sc-1dpxixq-1 bvhcuL']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement city() {
		return $(By.xpath("//div[@class='v5642n-2 dnVDWX']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement registration() {
		return $(By.xpath("//div[@class='sc-1y6fcg8-0 eTHDaY']/a[2]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement foneRegistration() {
		return $(By.xpath("//input[@class='cdmgs6-0 jdIpCj']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonGetCod() {
		return $(By.xpath("//button[@class='sc-1axihy7-0 gUwxDj ikliex-0 kjGnwh']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement getCode() {
		return $(By.xpath("//div[@id='debug-el-userauth']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement foneCode() {
		return $(By.xpath("//div[@class='kl0w5y-0 bTHkdg']/input")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement logo() {
		return $(By.xpath("//div[@class='p3mxh6-5 gdFSzl sc-1t0aznu-3 nGYiY']/a")).waitUntil(visible, app.timeOut);
	}


	public SelenideElement allCars() {
		return $(By.xpath("//li[@class='fsagm4-10 gvIwSB']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonCar() {
		return $(By.xpath("//div[@class='fsagm4-8 chsxSE']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement boxCars() {
		return $(By.xpath("//div[@class='fsagm4-4 ehOeFP']/span[2]")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement TextProblem() {
		return $(By.xpath("//input[@class='sc-1e1hxoi-0 RIqIQ']"))
				.waitUntil(visible, app.timeOut);

	}

	public SelenideElement buttonCreate() {
		return $(By.xpath("//div[@class='sc-1d6e934-0 jQScHq']/a")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement Car() {
		return $(By.xpath("//div[@class='sc-1bvlbv7-2 kXVMsf' and text()='Марка*']")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement TextCar() {
		return $(By.xpath("//input[@class='ym-record-keys qumbcf-13 fekDJk']")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement choiceCar() {
		return $(By.xpath("//div[@class='qumbcf-8 huqCte']")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement Model() {
		return $(By.xpath("//div[@class='sc-1bvlbv7-2 kXVMsf' and text()='Модель*']")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement choiceModel() {
		return $(By.xpath("//div[@class='qumbcf-8 huqCte' and text()='Carina']")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement Year() {
		return $(By.xpath("//div[@class='sc-1bvlbv7-2 kXVMsf' and text()='Год выпуска*']")).waitUntil(visible,
				app.timeOut);

	}

	public SelenideElement choiceYear() {
		return $(By.xpath("//div[@class='qumbcf-8 huqCte' and text()='2004']")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement validText() {
		return $(By.xpath("//textarea[@class='ym-record-keys u21bug-29 ctAVqI']")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement checkboxTruck() {
		return $(By.xpath("//label[@class='u21bug-28 whyzi' and text()='Необходим эвакуатор']")).waitUntil(visible,
				app.timeOut);

	}

	public SelenideElement checkboxParts() {
		return $(By.xpath("//label[@class='u21bug-28 whyzi' and text()='Собственные запчасти']")).waitUntil(visible,
				app.timeOut);

	}

	public SelenideElement Foto() {
		return $(By.xpath("//input[@class='u21bug-12 deXtYa']")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement buttonNext() {
		return $(By.xpath("//button[@class='u21bug-14 fhnjhw ikliex-0 hNhYAC']")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement mapTextBox() {
		return $(By.xpath("//input[@placeholder='Адрес']")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement mapSendKeys() {
		return $(By.xpath("//input[@value='Красная Площадь, Red Square, Москва, Russia']")).waitUntil(visible,
				app.timeOut);

	}

	public SelenideElement selectPointMap() {
		return $(By.xpath("//div[@class='gmqkzt-1 kfmkvM']")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement priceRepair() {
		return $(By.xpath("//input[@class='ym-record-keys u21bug-23 cvMOqo u21bug-22 AzGlt']")).waitUntil(visible,
				app.timeOut);

	}

	public SelenideElement buttonCreateRequest() {
		return $(By.xpath("//button[@class='u21bug-14 fhnjhw ikliex-0 hNhYAC']")).waitUntil(visible, app.timeOut);

	}
	public SelenideElement buttonGoRequest() {
		return $(By.xpath("//button[@class='sc-1oowb9x-4 jSJZmh ikliex-0 hNhYAC']")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement fone() {
		return $(By.xpath("//div[@class='wsng4a-10 dVEZqw']/input")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement buttonGetCode() {
		return $(By.xpath("//button[@class='wsng4a-8 gxeJjx ikliex-0 hNhYAC']")).waitUntil(visible, app.timeOut);

	}

	
	public SelenideElement ValidTextAutot() {
		return $(By.xpath("//p[@class='pk1ykc-2 cKFYKP sc-12xhjma-4 iaxHzO sc-12xhjma-0 fcjoGk']")).waitUntil(visible, app.timeOut);

	}
	public SelenideElement ValidTextProblem() {
		return $(By.xpath("//div[@class='sc-1d7kws4-1 gUPMXJ']/span")).waitUntil(visible, app.timeOut);

	}
	public SelenideElement ValidTextPrice() {
		return $(By.xpath("//div[@class='pk1ykc-0 gQlxxW' and text()='500,00']")).waitUntil(visible, app.timeOut);

	}
	public SelenideElement ValidTextParts() {
		return $(By.xpath("//div[@class='pk1ykc-0 gQlxxW' and text()='Свои запчасти']")).waitUntil(visible, app.timeOut);

	}
	public SelenideElement ValidTextTruck() {
		return $(By.xpath("//div[@class='pk1ykc-0 gQlxxW' and text()='Нужен эвакуатор']")).waitUntil(visible, app.timeOut);

	}
	
	public SelenideElement ValidTextAnsver() {
		return $(By.xpath("//div[@class='sc-12h8l1h-0 gWHVlu']/span")).waitUntil(visible, app.timeOut);

	}

	public void start() {

		country().click();
//		city().click();

	}

	public void RegButton() {
		registration().click();
		sleep(1000);

	}

	public void foneReg() {
		Random random = new Random();
		int n = 5000000 + random.nextInt(9999999 - 5000000);
		String phone = "996"+n;
		System.out.println(n);
		System.out.println(phone);
		foneRegistration().sendKeys(phone);
		buttonGetCod().click();
		sleep(1000);
		String code = getCode().getText();
		System.out.println(code);
		foneCode().sendKeys(code);
		logo().click();
	}

	public void textBox() {
		TextProblem().sendKeys("Мой автомобиль не заводится!");
		sleep(1000);
		buttonCreate().click();
	}

	public void menuCar() {

//		Car().click();

		TextCar().sendKeys("toyota");
		sleep(1000);

		choiceCar().click();
		sleep(1000);
	}

	public void menuModel() {

//		Model().click();

		choiceModel().click();
		sleep(1000);
	}

	public void menuYear() {

//		Year().click();
		choiceYear().click();
		sleep(1000);
	}

	public void validTextBox() {

		String nameTextProblem = validText().getText();
		System.out.println(nameTextProblem);
		Assert.assertEquals(nameTextProblem, "Мой автомобиль не заводится!");

	}

	public void checkBox() {

		checkboxTruck().click();
		sleep(1000);
		checkboxParts().click();
		sleep(1000);

	}

	public void downloadFoto() {

//		Foto().sendKeys("C:\\123.jpg");

		sleep(1000);

	}

	public void nextPage() {

		buttonNext().click();

	}

	public void choiceMapMarker() {

		mapTextBox().sendKeys("Красная Площадь, Red Square, Москва, Russia");
		sleep(3000);
		mapSendKeys().sendKeys(Keys.ENTER);
//		selectPointMap().click();
		sleep(3000);
		priceRepair().sendKeys("500");
		buttonCreateRequest().click();
		sleep(1000);
		buttonGoRequest().click();
		sleep(3000);

	}

	public void expectedResultValidText() {

		ValidTextAutot().shouldHave(text("Acura Integra, 2013"));
		ValidTextProblem().shouldHave(text("Стучит двигатель"));
		ValidTextPrice().shouldHave(text("500,00"));
		ValidTextParts().shouldHave(text("Свои запчасти"));
		ValidTextTruck().shouldHave(text("Нужен эвакуатор"));
		ValidTextAnsver().shouldHave(text("Ждем ответ от автосервиса"));


	}
	public void loginPage() {

		app.login().start();
		app.login().RegButton();
		app.login().foneReg();
		app.login().textBox();
		app.login().menuCar();
		app.login().menuModel();
		app.login().menuYear();
		app.login().checkBox();
		app.login().nextPage();
		app.login().choiceMapMarker();
//		app.login().expectedResultValidText();
			}

}

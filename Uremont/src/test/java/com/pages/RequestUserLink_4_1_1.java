package com.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class RequestUserLink_4_1_1 {
	public static ApplicationManager app;
	WebDriver driver;
	
	public RequestUserLink_4_1_1() {

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
	
	public SelenideElement fone() {
		return $(By.xpath("//input[@class='cdmgs6-0 jdIpCj']")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement buttonGetCode() {
		return $(By.xpath("//button[@class='sc-1axihy7-0 gUwxDj ikliex-0 kjGnwh']")).waitUntil(visible, app.timeOut);

	}
	public SelenideElement getCode() {
		return $(By.xpath("//div[@id='debug-el-userauth']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement foneCode() {
		return $(By.xpath("//div[@class='kl0w5y-0 bTHkdg']/input")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement requestButton() {
		return $(By.xpath("//div[@class='sc-1wpe5yn-10 cRZZZU']/a")).waitUntil(visible, app.timeOut);
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
	public SelenideElement textBox() {
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
	
		public SelenideElement vinBox() {
			return $(By.xpath("//input[@class='ym-record-keys u21bug-25 kwVarD']")).waitUntil(visible, app.timeOut);
			
		}
		
		public SelenideElement buttonNext() {
			return $(By.xpath("//button[@class='u21bug-14 fhnjhw ikliex-0 hNhYAC']")).waitUntil(visible, app.timeOut);

		}
		
	public SelenideElement textSTO() {
		return $(By.xpath("//div[@class='u21bug-16 jYbTDZ' and text()='Тестовый СТО 3']")).waitUntil(visible, app.timeOut);
		
	}
	public SelenideElement priceRepair() {
		return $(By.xpath("//input[@class='ym-record-keys u21bug-23 cvMOqo u21bug-22 AzGlt']")).waitUntil(visible, app.timeOut);

	}
	public SelenideElement buttonCreateRequest() {
		return $(By.xpath("//button[@class='u21bug-14 fhnjhw ikliex-0 hNhYAC']")).waitUntil(visible, app.timeOut);

	}
	public SelenideElement buttonGoRequest() {
		return $(By.xpath("//button[@class='sc-1oowb9x-4 jSJZmh ikliex-0 hNhYAC']")).waitUntil(visible, app.timeOut);
		
	}

	public SelenideElement ValidTextAutot() {
		return $(By.xpath("//p[@class='pk1ykc-2 cKFYKP sc-12xhjma-4 iaxHzO sc-12xhjma-0 fcjoGk']")).waitUntil(visible,
				app.timeOut);

	}

	public SelenideElement ValidTextProblem() {
		return $(By.xpath("//div[@class='sc-1d7kws4-1 gUPMXJ']/span")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement ValidTextPrice() {
		return $(By.xpath("//div[@class='pk1ykc-0 gQlxxW' and text()='500,00']")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement ValidTextParts() {
		return $(By.xpath("//div[@class='pk1ykc-0 gQlxxW' and text()='Свои запчасти']")).waitUntil(visible,
				app.timeOut);

	}

	public SelenideElement ValidTextTruck() {
		return $(By.xpath("//div[@class='pk1ykc-0 gQlxxW' and text()='Нужен эвакуатор']")).waitUntil(visible,
				app.timeOut);

	}

	public SelenideElement ValidTextAnsver() {
		return $(By.xpath("//div[@class='sc-12h8l1h-0 gWHVlu']/span")).waitUntil(visible, app.timeOut);

	}
//	public SelenideElement validText() {
//		return $(By.xpath("//p[@class='sc-1fp6d3s-1 iUdmhV']")).waitUntil(visible, app.timeOut);
//	}

	public void start() {

		country().click();
//		city().click();

	}

	public void regButton() {
		registration().click();
		sleep(1000);

	}

	public void foneReg() {
		
		fone().sendKeys("996707"+app.tt);
		buttonGetCode().click();
		sleep(1000);
		String code = getCode().getText();
		System.out.println(code);
		foneCode().sendKeys(code);
		getWebDriver().get("https://uremont.dev/service/600103");
		requestButton().click();
//		country().click();
//		city().click();
//		buttonGetCode().click();
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

	public void textProblem() {

		textBox().sendKeys("Стучит ходовка"+app.tt);
		sleep(1000);
	}

	public void checkBox() {

		checkboxTruck().click();
		sleep(1000);
		checkboxParts().click();
		sleep(1000);
	}

	public void downloadFoto() {

//		Foto().sendKeys("D:\\Selenium\\123.jpg");	
		sleep(1000);

	}

	public void textVIN() {

		vinBox().sendKeys("WVWZZZ3CZ8E059499");
		sleep(1000);
	}

	public void nextPage() {

		buttonNext().click();
		sleep(1000);
	}

	public void validTextSTO() {

		String nameTextSTO = textSTO().getText();
		System.out.println(nameTextSTO);
		Assert.assertEquals(nameTextSTO, "Автосервис Тестовый СТО 3");

	}

	public void choicePrice() {

		priceRepair().sendKeys("500");
		sleep(1000);
		buttonCreateRequest().click();
		sleep(1000);
		buttonGoRequest().click();
		sleep(3000);

	}

//	public void choiceDateButton() {
//		
////		choiceDate().click();
//		buttonNext().click();
//				
//	
//	}

	public void expectedResultValidText() {

		ValidTextAutot().shouldHave(text("Toyota Corolla, 2004"));
		ValidTextProblem().shouldHave(text("Стучит ходовка"+app.tt));
		ValidTextPrice().shouldHave(text("500,00"));
		ValidTextParts().shouldHave(text("Свои запчасти"));
		ValidTextTruck().shouldHave(text("Нужен эвакуатор"));
		ValidTextAnsver().shouldHave(text("Ждем ответ от автосервиса"));

	}

	public void requestUser() {

		app.reqUser().start();
		app.reqUser().regButton();
		app.reqUser().foneReg();
		app.reqUser().menuCar();
		app.reqUser().menuModel();
		app.reqUser().menuYear();
		app.reqUser().textProblem();
		app.reqUser().checkBox();
		app.reqUser().textVIN();
		app.reqUser().nextPage();
		app.reqUser().validTextSTO();
		app.reqUser().choicePrice();
//		app.reqUser().expectedResultValidText();
	}

}

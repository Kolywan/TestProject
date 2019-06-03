package com.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class RequestGuest_4_2 {
	public static ApplicationManager app;
	WebDriver driver;

	public RequestGuest_4_2() {

		app = new ApplicationManager();
	}

//	System.out.println(app.sms().smsCode("9166356002"));
	// img[@src='/static/img/youlaMarker.svg']

	public SelenideElement country() {
		return $(By.xpath("//button[@class='sc-1dpxixq-1 bvhcuL']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement city() {
		return $(By.xpath("//div[@class='v5642n-2 dnVDWX']")).waitUntil(visible, app.timeOut);
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

	public SelenideElement fone() {
		return $(By.xpath("//div[@class='wsng4a-10 dVEZqw']/input")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement buttonGetCode() {
		return $(By.xpath("//button[@class='wsng4a-8 gxeJjx ikliex-0 hNhYAC']")).waitUntil(visible, app.timeOut);

	}

	public SelenideElement getCode() {
		return $(By.xpath("//div[@id='debug-el-newbid']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement foneCode() {
		return $(By.xpath("//div[@class='kl0w5y-0 eSlUIg']/input")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonGoRequest() {
		return $(By.xpath("//button[@class='sc-1oowb9x-4 jSJZmh ikliex-0 hNhYAC']")).waitUntil(visible, app.timeOut);

	}
	public void start() {

		country().click();
//		city().click();

//		Assert.assertTrue(driver.findElements(allCar()).size()==1157);

		String title = getWebDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Выбери свой автосервис | Uremont");
//		
		// https://selenide.org/javadoc/4.6/com/codeborne/selenide/SelenideElement.html
		// https://selenide.org/javadoc/2.4/com/codeborne/selenide/WebDriverRunner.html#getWebDriver()

//		List<WebElement> Cars = getWebDriver().findElements(allCars);

//		List<WebElement> Cars = driver.findElements(allCars);
//		
//		for (int i = 1; i < Cars.size(); i++){
//            buttonCar().click();
//            driver.findElement(By.xpath("//div[@class='fsagm4-9 cWcDnT']//li[" + i + "]")).click();
//            System.out.println(i);
//            boxCars().click();}
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

	}

//	public void choiceDateButton() {
//		
////		choiceDate().click();
//		buttonNext().click();
//				
//	
//	}

	public void foneSMS() {
		Random random = new Random();
		int n = 5000000 + random.nextInt(9999999 - 5000000);
		String phone = "996"+n;
		System.out.println(n);
		System.out.println(phone);
		fone().sendKeys(phone);
		buttonGetCode().click();
		sleep(1000);
		String code = getCode().getText();
		System.out.println(code);
		foneCode().sendKeys(code);
		buttonGoRequest().click();
		sleep(3000);

	}

//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("alert('HELLO');");

	public void singUpWthoutAuz() {

		app.mainPage().start();
		app.mainPage().textBox();
		app.mainPage().menuCar();
		app.mainPage().menuModel();
		app.mainPage().menuYear();
		app.mainPage().validTextBox();
		app.mainPage().checkBox();
		app.mainPage().downloadFoto();
		app.mainPage().nextPage();
		app.mainPage().choiceMapMarker();
//		app.mainPage().choiceDateButton();	
		app.mainPage().foneSMS();

	}

}

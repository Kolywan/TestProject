package com.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class CostRepair_6_1 {
	public static ApplicationManager app;
	WebDriver driver;
	
	public CostRepair_6_1() {

		app = new ApplicationManager();
	}


	public SelenideElement country() {
		return $(By.xpath("//button[@class='sc-1dpxixq-1 bvhcuL']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement city() {
		return $(By.xpath("//div[@class='v5642n-2 dnVDWX']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement login() {
		return $(By.xpath("//div[@class='sc-1y6fcg8-0 eTHDaY']/a[3]")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement foneSTO() {
		return $(By.xpath("//input[@class='cdmgs6-0 jdIpCj' and @placeholder='Телефон']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement password() {
		return $(By.xpath("//div[@class='mfd6sh-2 cyUzk sc-10rw1t5-0 efxJEz']/input")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement loginButton() {
		return $(By.xpath("//button[@class='mfd6sh-0 bYllXZ ikliex-0 kjGnwh']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement selectRepair() {
		return $(By.xpath("//div[@class='phlcbi-0 jaDJrL' and text()='Стучит ходовка"+app.tt+"']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonRepair() {
		return $(By.xpath("//button[@class='ikliex-0 cAvyHd']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement inputPrice() {
		return $(By.xpath("//div[@class='sc-106oc1s-13 gRpsjU']/div[1]//input[@placeholder='Стоимость, ₽']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement inputSell() {
		return $(By.xpath("//div[@class='sc-106oc1s-13 gRpsjU']/div[1]//input[@placeholder='Скидка, %']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement inputPriceParts() {
		return $(By.xpath("//div[@class='sc-106oc1s-13 gRpsjU']/div[2]//input[@placeholder='Стоимость, ₽']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement inputSellParts() {
		return $(By.xpath("//div[@class='sc-106oc1s-13 gRpsjU']/div[2]//input[@placeholder='Скидка, %']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textBox() {
		return $(By.xpath("//textarea[@class='sc-106oc1s-18 jePixP']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonNext() {
		return $(By.xpath("//button[@class='ikliex-0 kNrvbn']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement answerSTO() {
		return $(By.xpath("//div[@class='v5mdtj-2 hulvHU' and text()='Ваши ответы']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement validPrice() {
		return $(By.xpath("//p[@class='sc-12xhjma-5 iBHcDy' and text()='342,00']")).waitUntil(visible, app.timeOut);
	}
	
	public void start() {

		country().click();
//		city().click();
		login().click();
	}

	public void foneLogin() {
		foneSTO().sendKeys("9770000004");
		sleep(1000);
		password().sendKeys("79770000004");
		sleep(1000);
		loginButton().click();
		sleep(3000);
	
	}
	public void selectUser() {
		selectRepair().click();
		sleep(1000);
		buttonRepair().click();
		sleep(1000);
	
	}
	public void priceRepair() {
		inputPrice().sendKeys("280");
		inputSell().sendKeys("10");
		sleep(1000);
		inputPriceParts().sendKeys("100");
		inputSellParts().sendKeys("10");
		sleep(1000);
		textBox().sendKeys("Окончательно");
		sleep(1000);
		buttonNext().click();
		answerSTO().click();
		selectRepair().click();
		sleep(2000);

	}
	
	public void expectedResultValidText() {

		validPrice().shouldHave(text("342,00"));



	}
	public void repairSTOPage() {
		app.costRepair().start();
		app.costRepair().foneLogin();
		app.costRepair().selectUser();
		app.costRepair().priceRepair();
		app.costRepair().expectedResultValidText();
		
	}
}

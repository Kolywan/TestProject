package com.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;


public class RegistrationSTO_2 {
	public static ApplicationManager app;
	
	

	
	WebDriver driver;

	public RegistrationSTO_2() {

		app = new ApplicationManager();
	}

	
	
//public int test() {
//		int test=100;
//		return test;
//	}
	
	

	public SelenideElement country() {
		
		return $(By.xpath("//button[@class='sc-1dpxixq-1 bvhcuL']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement city() {
		return $(By.xpath("//div[@class='v5642n-2 dnVDWX']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement registration() {
		return $(By.xpath("//div[@class='sc-1y6fcg8-0 eTHDaY']/a[3]")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement newReg() {
		return $(By.xpath("//div[@class='sc-1lsxg9w-0 dOBEOi']/a[2]")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement nameSTO() {
		return $(By.xpath("//div[@class='mfd6sh-2 cyUzk sc-10rw1t5-0 efxJEz']/input")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement foneRegistration() {
		return $(By.xpath("//input[@class='cdmgs6-0 jdIpCj' and @placeholder='Телефон']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement buttonGetCod() {
		return $(By.xpath("//button[@class='sc-2vk69y-0 kFuUkv ikliex-0 kjGnwh']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement getCode() {
		return $(By.xpath("//div[@id='debug-el-serviceauth']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement foneCode() {
		return $(By.xpath("//div[@class='mfd6sh-2 cyUzk sc-10rw1t5-0 efxJEz']/input")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement buttonLoginSTO() {
		return $(By.xpath("//button[@class='mfd6sh-0 bYllXZ ikliex-0 kjGnwh']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement validText() {
		return $(By.xpath("//p[@class='sc-1fp6d3s-1 bCucBH']")).waitUntil(visible, app.timeOut);
	}
	public void start() {

		country().click();
//		city().click();
	}

	public void RegButton() {
		registration().click();
		sleep(1000);
		newReg().click();
		sleep(1000);
	}

	public void foneReg() {
		
		nameSTO().sendKeys("Мастер-Ломастер"+app.tt);		
		foneRegistration().sendKeys("996700"+app.tt);
		buttonGetCod().click();
		foneRegistration().sendKeys("996700"+app.tt);
		String code = getCode().getText();
		System.out.println(code);
		foneCode().sendKeys(code);
//		foneCod().sendKeys(app.sms().smsCode());
//		sleep(30000);
		buttonLoginSTO().click();
		sleep(1000);
	}
	public void expectedResult() {
		
		validText().shouldHave(text("На данный момент у вас нет активных заявок"));
	}
	public void RegNewSTO() {
		app.regSTO().start();
		app.regSTO().RegButton();
		app.regSTO().foneReg();
		app.regSTO().expectedResult();
	}
}

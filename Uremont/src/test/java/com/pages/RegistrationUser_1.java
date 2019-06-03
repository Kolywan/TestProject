package com.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class RegistrationUser_1 {
	public static ApplicationManager app;
	WebDriver driver;

	public RegistrationUser_1() {

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
	
	public SelenideElement validText() {
		return $(By.xpath("//p[@class='sc-1fp6d3s-1 iUdmhV']")).waitUntil(visible, app.timeOut);
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
	}
	
	public void expectedResult() {
		
		validText().shouldHave(text("У вас еще нет заявок. Самое время начать"));
	}
	
	public void RegNewUser() {
		
		app.PageReg().start();
		app.PageReg().RegButton();
		app.PageReg().foneReg();
		app.PageReg().expectedResult();
	}

}

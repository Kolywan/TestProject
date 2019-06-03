package com.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class GoSTO_9_2 {
	public static ApplicationManager app;
	WebDriver driver;
	int n = 2191;
	public GoSTO_9_2() {

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
	
	public SelenideElement directButton() {
		return $(By.xpath("//button[@class='sc-1eiuds-2 gPpFEW ikliex-0 fZkGhk']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement controlRepairdButton() {
		return $(By.xpath("//div[@class='sc-1v5nxjj-4 dfZLlr sc-1v5nxjj-1 ceTHqo']/span")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement cancelRepairButton() {
		return $(By.xpath("//div[@class='sc-1v5nxjj-3 itPBxk']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement agreeButton() {
		return $(By.xpath("//button[@class='ikliex-0 hNhYAC']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement repeatButton() {
		return $(By.xpath("//a[@class='ikliex-0-t kALJtx']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement nextButton() {
		return $(By.xpath("//button[@class='u21bug-14 fhnjhw ikliex-0 hNhYAC']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement creatButton() {
		return $(By.xpath("//button[@class='u21bug-14 fhnjhw ikliex-0 hNhYAC']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement goRequest() {
		return $(By.xpath("//button[@class='sc-1oowb9x-4 jSJZmh ikliex-0 hNhYAC']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement validSTO() {
		return $(By.xpath("//a[@class='h6xccg-0 fgBnkD']")).waitUntil(visible, app.timeOut);
	}

	public void start() {

		country().click();
//		city().click();
	}

	public void RegButton() {
		registration().click();
	}

	public void foneReg() {
		foneRegistration().sendKeys("996707"+n);
		buttonGetCod().click();
		sleep(1000);
		String code = getCode().getText();
		System.out.println(code);
		foneCode().sendKeys(code);
		sleep(3000);
	}

	public void directRepair() {
		directButton().click();
		sleep(3000);
	}
	public void canceltRepair() {
		controlRepairdButton().click();
		cancelRepairButton().click();
		agreeButton().click();
		sleep(3000);
	}
	public void reapetRepair() {
		controlRepairdButton().click();
		cancelRepairButton().click();
		agreeButton().click();
		repeatButton().click();
		nextButton().click();
		creatButton().click();
		goRequest().click();
		sleep(3000);
	}
//	public void expectedResult() {
//		
//		validText().shouldHave(text("У вас еще нет заявок. Самое время начать"));
//	}
//	
	public void directionSTO() {
		
		app.goSTO().start();
		app.goSTO().RegButton();
		app.goSTO().foneReg();
		app.goSTO().directRepair();
		app.goSTO().canceltRepair();
		app.goSTO().reapetRepair();
//		app.goSTO().expectedResult();
	}

}

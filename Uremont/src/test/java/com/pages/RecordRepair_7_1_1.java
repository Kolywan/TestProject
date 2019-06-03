package com.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class RecordRepair_7_1_1 {
	public static ApplicationManager app;
	WebDriver driver;
	
	public RecordRepair_7_1_1() {

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
	
	public SelenideElement goAnswerButton() {
		return $(By.xpath("//a[@class='ikliex-0-t kALJtx']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement recordButton() {
		return $(By.xpath("//button[@class='ikliex-0 hNhYAC']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement cashButton() {
		return $(By.xpath("//button[@class='sc-68zysm-9 ieAWhY ikliex-0 fZkGhk']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement agreeButton() {
		return $(By.xpath("//button[@class='sc-68zysm-9 ieAWhY ikliex-0 hNhYAC']")).waitUntil(visible, app.timeOut);
	}
	
	public SelenideElement validSTO() {
		return $(By.xpath("//a[@class='h6xccg-0 fgBnkD']")).waitUntil(visible, app.timeOut);
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
	
	public SelenideElement agree2Button() {
		return $(By.xpath("//button[@class='ikliex-0 hNhYAC']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement allButton() {
		return $(By.xpath("//div[@class='sc-1rine9c-0 ilLCMQ' and text()='Все заявки']")).waitUntil(visible, app.timeOut);
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


	public void start() {

		country().click();
//		city().click();
	}

	public void RegButton() {
		registration().click();
	}

	public void foneReg() {
		foneRegistration().sendKeys("996707"+app.pp);
		buttonGetCod().click();
//		sleep(260000);
//		buttonGetCod().click();
		String code = getCode().getText();
		System.out.println(code);
		foneCode().sendKeys(code);
		
	}
	public void goSTO() {
		goAnswerButton().click();
		sleep(1000);
		recordButton().click();
		sleep(1000);
		cashButton().click();
		sleep(1000);
		agreeButton().click();
	}
	
	public void expectedResult() {
		
		validSTO().shouldHave(text("Тестовый СТО 3"));
		
	}
	public void directRepair() {
		directButton().click();
		sleep(3000);
	}
	public void canceltRepair() {
		controlRepairdButton().click();
		sleep(2000);
		cancelRepairButton().click();
		sleep(1000);
		agree2Button().click();
		sleep(3000);
	}
	public void reapetRepair() {
		allButton().click();
		sleep(1000);
		repeatButton().click();
		sleep(1000);
		nextButton().click();
		sleep(1000);
		creatButton().click();
		goRequest().click();
		sleep(3000);
	}
	public void repairСash() {
		
		app.recordRepair().start();
		app.recordRepair().RegButton();
		app.recordRepair().foneReg();
		app.recordRepair().goSTO();
		app.recordRepair().expectedResult();
		app.recordRepair().directRepair();
		app.recordRepair().canceltRepair();
		app.recordRepair().reapetRepair();
	}

}

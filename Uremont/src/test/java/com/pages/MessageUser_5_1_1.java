package com.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class MessageUser_5_1_1 {
	public static ApplicationManager app;
	WebDriver driver;
	
	public MessageUser_5_1_1() {

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
	
	public SelenideElement massegeButton() {
		return $(By.xpath("//div[@class='sc-102se75-3 dkBmWy' and text()='Сообщения']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement requestButton() {
		return $(By.xpath("//div[@class='sc-102se75-3 dkBmWy' and text()='Заявки']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement goAnswerButton() {
		return $(By.xpath("//a[@class='ikliex-0-t kALJtx']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement messageSTOButton() {
		return $(By.xpath("//a[@class='weef6m-0 yXRLR ikliex-0-t dhcAdS']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement selectSTO() {
		return $(By.xpath("//div[@class='sc-19qylx2-3 hFSMun' and text()='Тестовый СТО 3']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement textBox() {
		return $(By.xpath("//input[@class='idgm86-3 gSUxWp']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement sendPhoto() {
		return $(By.xpath("//label[@class='idgm86-4 kPLXoO']/input")).waitUntil(visible, app.timeOut);
	}


	public void start() {

		country().click();
//		city().click();
	}

	public void RegButton() {
		registration().click();
		
	}

	public void foneReg() {
		foneRegistration().sendKeys("996707"+app.tt);
		buttonGetCod().click();
		sleep(1000);
		String code = getCode().getText();
		System.out.println(code);
		foneCode().sendKeys(code);
//		String code = getCode().getAttribute("textContent");
//		System.out.println(code);
//		foneCode().sendKeys(code);
	}
	public void sendMessage() {
		sleep(1000);
		goAnswerButton().click();
		sleep(1000);
		messageSTOButton().click();
		sleep(3000);
		selectSTO().click();
		sleep(1000);
		textBox().sendKeys("Сделайте скидку"+app.tt);
		sendPhoto().sendKeys("C:\\123.jpg");
		sleep(3000);
		textBox().sendKeys(Keys.ENTER);
		requestButton().click();
		sleep(1000);
		massegeButton().click();
		sleep(1000);
		selectSTO().click();
		sleep(2000);
	}
	
//	public void expectedResult() {
//		
//		validText().shouldHave(text("У вас еще нет заявок. Самое время начать"));
//	}
	
	public void GoMessageUser() {
		
		app.messageUser().start();
		app.messageUser().RegButton();
		app.messageUser().foneReg();
		app.messageUser().sendMessage();
	}

}

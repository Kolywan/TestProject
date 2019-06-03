package com.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class MessageSTO_5_2_1 {
	public static ApplicationManager app;
	WebDriver driver;
	
//	
//
//	
//	List<Integer> nums = new ArrayList<Integer>();
//	public void addNumber(Integer n) {
//		int min = 10;
//		int max = 999;
//		int diff = max - min;
//		Random random = new Random();
//		int n = random.nextInt(diff+1);
//		nums.add(n);
//	};
//
//	
//	
//	String text = "Сколько стоит услуга"+nums;
//	double n = 10 + Math.random()*90;
//	String text = "Сколько стоит услуга"+n;
	
	public MessageSTO_5_2_1() {

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
	
	public SelenideElement messageButton() {
		return $(By.xpath("//div[@class='sc-102se75-3 dkBmWy' and text()='Сообщения']")).waitUntil(visible, app.timeOut);
	}

	public SelenideElement selectMessage() {
		return $(By.xpath("//p[@class='sc-2uzrp6-0 lbSjhT' and text()='Стучит ходовка" + app.tt + "...']")).waitUntil(visible, app.timeOut);
	}
	public SelenideElement selectMessage2() {
		return $(By.xpath("//div[@class='sc-102se75-3 dkBmWy' and text()='Заявки']")).waitUntil(visible, app.timeOut);
	}
		public SelenideElement messageBox() {
		return $(By.xpath("//input[@class='idgm86-3 gSUxWp']")).waitUntil(visible, app.timeOut);
	}
		public SelenideElement sendPhoto() {
		return $(By.xpath("//label[@class='idgm86-4 kPLXoO']/input")).waitUntil(visible, app.timeOut);
	}
		public SelenideElement buttonSendText() {
		return $(By.xpath("//div[@class='idgm86-2 hdrPxT']")).waitUntil(visible, app.timeOut);
	}	
		public SelenideElement validText() {
		return $(By.xpath("//div[@class='sc-1gqkp7p-0 dotnzR' and text()='Скидок Не будет']")).waitUntil(visible, app.timeOut);
	}
	public void start() {
		country().click();
//		city().click();
		login().click();
	}
	
	public void clickMessage() {
	
		messageButton().click();
		sleep(4000);
		selectMessage().click();

	}
	public void sendMessage() {
		sleep(1000);
		messageBox().sendKeys("Скидок Не будет");
		sendPhoto().sendKeys("C:\\123.jpg");
		messageBox().sendKeys(Keys.ENTER);
		sleep(1000);
		selectMessage2().click();
		sleep(1000);
		messageButton().click();
		sleep(1000);
		selectMessage().click();
		sleep(2000);
	}

	public void foneLogin() {

		foneSTO().sendKeys("9770000004");
		sleep(1000);
		password().sendKeys("79770000004");
		loginButton().click();
	
	}
	public void expectedResult() {

		validText().shouldHave(text("Скидок Не будет"));
		sleep(2000);
	}
	public void GoMessageSTO() {
		app.messageSTO().start();
		app.messageSTO().foneLogin();
		app.messageSTO().clickMessage();
		app.messageSTO().sendMessage();
		app.messageSTO().expectedResult();
		
	}
}

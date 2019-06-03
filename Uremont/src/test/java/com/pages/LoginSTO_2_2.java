package com.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import com.main.appmanager.ApplicationManager;

public class LoginSTO_2_2 {
	public static ApplicationManager app;
	WebDriver driver;

	public LoginSTO_2_2() {

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
	public void start() {

		country().click();
//		city().click();
		login().click();
		sleep(1000);
	}

	public void foneLogin() {
		foneSTO().sendKeys("9770000004");
		password().sendKeys("79770000004");
		sleep(1000);
		loginButton().click();
		sleep(3000);

	}
	
	public void LoginSTOPage() {
		app.loginSTO().start();
		app.loginSTO().foneLogin();
	}
}

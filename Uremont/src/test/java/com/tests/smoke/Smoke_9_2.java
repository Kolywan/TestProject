package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_9_2 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	// 1. Авторизация / регистрация клиента через вход
	// https://docs.google.com/spreadsheets/d/1xDcLDZbFXnwcLlaj1pQxIdvl6caGL2p2PkcJ8GS9DG0/edit#gid=0
	
	public void smoke1() throws Exception {

		app.goSTO().directionSTO();

	}


}

package com.tests.smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.common.BaseTest;

public class Smoke_4_2_1 extends BaseTest {

	@Parameters()
	@Test(groups = { "smoke" }, priority = 1)
	
	// 4.2.1 Создание прямой заявки гостем
	// https://docs.google.com/spreadsheets/d/1xDcLDZbFXnwcLlaj1pQxIdvl6caGL2p2PkcJ8GS9DG0/edit#gid=0
	
	public void smoke1() throws Exception {

		app.reqGuest().RegNewUser();

	}


}

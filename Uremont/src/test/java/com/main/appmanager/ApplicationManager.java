package com.main.appmanager;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

import java.io.File;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.base.common.Logs;
import com.codeborne.selenide.Configuration;
import com.data.Data;
import com.data.DelEmails;
import com.data.GetCodeSMS;
import com.data.GetEmail;
import com.pages.RequestUseer_4_1;
import com.pages.MessageSTO_5_2_1;
import com.pages.MessageUser_5_1_1;
import com.pages.LoginSTO_2_2;
import com.pages.CostRepair_6_1;
import com.pages.GoSTO_9_2;
import com.pages.RequestGuest_4_2;
import com.pages.RegistrationUser_1;
import com.pages.RecordRepair_7_1_1;
import com.pages.RegistrationSTO_2;
import com.pages.RequestGuestLink_4_2_1;
import com.pages.RequestUserLink_4_1_1;

public class ApplicationManager {

	public int timeOut = 5000;
    
	
	public int tt= 6969;
	public int pp= 6968;
	
	protected static Logs logs;
	// ##########################
	protected Data data;
	// ##########################
	// Pages

	protected RequestUseer_4_1 login;
	protected RegistrationSTO_2 regSTO;
	protected LoginSTO_2_2 loginSTO;
	protected RequestGuest_4_2 mainPage;
	protected RequestUserLink_4_1_1 reqUser;
	protected RequestGuestLink_4_2_1 reqGuest;
	protected RegistrationUser_1 PageReg;
	protected DelEmails deleteMails;
	protected GetEmail getEmail;
	protected MessageUser_5_1_1 messageUser;
	protected MessageSTO_5_2_1 messageSTO;
	protected CostRepair_6_1 costRepair;
	protected GetCodeSMS sms;
	protected RecordRepair_7_1_1 recordRepair;
	protected GoSTO_9_2 goSTO;

	// ##########################

	public static ApplicationManager app;

	public static ApplicationManager getInstance(String url, String platform) throws Exception {
		app = new ApplicationManager();
		File DriverPath = new File("");

		System.setProperty("webdriver.chrome.driver", DriverPath.getAbsolutePath() + "\\drivers\\chromedriver.exe");

		System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tT %4$s %5$s%6$s%n");
		// LoggingPreferences logs = new LoggingPreferences();
		// logs.enable(LogType.BROWSER, Level.ALL);
		// logs.enable(LogType.CLIENT, Level.ALL);
		// logs.enable(LogType.DRIVER, Level.ALL);
		// logs.enable(LogType.PERFORMANCE, Level.ALL);
		// logs.enable(LogType.PROFILER, Level.ALL);
		// logs.enable(LogType.SERVER, Level.ALL);
		// ChromeOptions options = new ChromeOptions();
		// DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		// capabilities.setCapability(CapabilityType.LOGGING_PREFS, logs);
		// options.addArguments("start-maximized");
		// capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		Configuration.startMaximized = true;
		open(url);
		return app;
	}

	public void tearDown() throws Exception {
		close();

	}

	// ##############################

	public Logs logs() {
		return logs = new Logs();
	}

	// ##############################

	public Data data() {
		return data = new Data();
	}

	// ##############################

	public DelEmails deleteMails() {
		return deleteMails = new DelEmails();
	}

	// ##############################

	public GetEmail getEmail() {
		return getEmail = new GetEmail();
	}

	// ##############################

	// ##############################

	public GetCodeSMS sms() {
		return sms = new GetCodeSMS();
	}

	// ##############################

	public RequestUseer_4_1 login() {
		return login = new RequestUseer_4_1();
	}
	public RegistrationSTO_2 regSTO() {
		return regSTO = new RegistrationSTO_2();
	}
	public LoginSTO_2_2 loginSTO() {
		return loginSTO = new LoginSTO_2_2();
	}
	public RegistrationUser_1 PageReg() {
		return PageReg = new RegistrationUser_1();
	}
	
	public RequestGuest_4_2 mainPage() {
		return mainPage = new RequestGuest_4_2();
	}
	public RequestUserLink_4_1_1 reqUser() {
		return reqUser = new RequestUserLink_4_1_1();
	}
	public RequestGuestLink_4_2_1 reqGuest() {
		return reqGuest = new RequestGuestLink_4_2_1();
	}
	public MessageUser_5_1_1 messageUser() {
		return messageUser = new MessageUser_5_1_1();
	}
	public MessageSTO_5_2_1 messageSTO() {
		return messageSTO = new MessageSTO_5_2_1();
	}
	public CostRepair_6_1 costRepair() {
		return costRepair = new CostRepair_6_1();
	}
	public RecordRepair_7_1_1 recordRepair() {
		return recordRepair = new RecordRepair_7_1_1();
	}
	public GoSTO_9_2 goSTO() {
		return goSTO = new GoSTO_9_2();
	}

	// ##############################

	public void switchLoging() throws SecurityException, IOException {
		// set logger Level for RemoteWebDriver
		Logger logger = Logger.getLogger(RemoteWebDriver.class.getName());
		logger.setLevel(Level.ALL);
		// delete all Handlers
		for (Handler handler : logger.getHandlers()) {
			logger.removeHandler(handler);
		}
		// create Console Handler and define level ALL
		ConsoleHandler console = new ConsoleHandler();
		console.setLevel(Level.INFO);
		logger.addHandler(console);
		// create File Handler and define level ALL
		File log = new File("log.txt");
		FileHandler file = new FileHandler(log.getAbsolutePath());
		file.setLevel(Level.ALL);
		file.setFormatter(new SimpleFormatter());
		logger.addHandler(file);
	}

}

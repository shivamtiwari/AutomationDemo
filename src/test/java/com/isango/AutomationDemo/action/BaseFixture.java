package com.isango.AutomationDemo.action;

import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.isango.AutomationDemo.Utilities.Utilities;
import com.isango.AutomationDemo.pageUI.*;

public class BaseFixture {
	public WebDriver driver;
	public DesiredCapabilities capabilities;
	HomePageUI homePage;
	ProductPageUI productPage;
	CheckOutPageUI checkoutPage;
	LoginAndPaymentPageUI paymentPage;
	ConfirmationPageUI confirmationPage;
	public static URL url;

	public void startBrowserSession(String Bro) {
		Reporter.log("Browser Name : " + Bro);
		if (getYamlVal("ExecutionType").equalsIgnoreCase("remote")) {
			initBrowserSessionRemote(Bro);			
			String gridSessionId = ((RemoteWebDriver) driver).getSessionId().toString();
			System.out.println(" ***Selenium Grid SESSION_ID: "
							+ gridSessionId
							+ "***\n http://jenkins.mindtap.corp.web:4444/grid/api/testsession?session="
							+ gridSessionId);
		} else {
			initBrowserSessionLocal(Bro);
		}
	}

	public void initBrowserSessionRemote(String Bro) {
		capabilities = new DesiredCapabilities();
		capabilities.setJavascriptEnabled(true);
		capabilities.setBrowserName(Bro);
		try {
			url = new URL(System.getProperty("ipaddress",
					getYamlVal("RemoteIP")));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver = new RemoteWebDriver(url, capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		initPageObjects();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	public void initBrowserSessionLocal(String Bro) {
		capabilities = new DesiredCapabilities();
		capabilities.setJavascriptEnabled(true);
		if (Bro.equalsIgnoreCase("firefox")) {
			capabilities.setBrowserName("firefox");
			driver = new FirefoxDriver();
			addAllBrowserSetup(driver);
		} else if (Bro.equalsIgnoreCase("iexplore")) {
			System.setProperty("webdriver.ie.driver", "src/test/resources/otherDriverFiles/IEDriverServer.exe");
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setJavascriptEnabled(true);
			driver = new InternetExplorerDriver(dc);
		} else if (Bro.equalsIgnoreCase("chrome")) {
			capabilities.setBrowserName("chrome");
			System.setProperty("webdriver.chrome.driver", "src/test/resources/otherDriverFiles/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		initPageObjects();
		driver.manage().window().maximize();
	}

	private static void addAllBrowserSetup(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().setPosition(new Point(0, 0));
		java.awt.Dimension screenSize = Toolkit.getDefaultToolkit()
				.getScreenSize();
		Dimension dim = new Dimension((int) screenSize.getWidth(),
				(int) screenSize.getHeight());
		driver.manage().window().setSize(dim);
	}

	public void initPageObjects() {
		homePage = new HomePageUI(driver);
		productPage = new ProductPageUI(driver);
		checkoutPage = new CheckOutPageUI(driver);
		paymentPage = new LoginAndPaymentPageUI(driver);
		confirmationPage = new ConfirmationPageUI(driver);
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void stopBrowserSession() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void waitForSync() {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//*")));
	}

	public void waitForElementToVisible(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOf(e));
	}

	public void setUpDataFile(String dataFilePath) {
		Utilities.setYamlFilePath(dataFilePath);
	}

	public String getYamlVal(String yamlMapObj) {
		return Utilities.getYamlValue(yamlMapObj);
	}

	public void hardWait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
			System.out.println("Can't wait...");
		}
	}
	
	public void executeJs(String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script, (Object) null);
	}

	public void SelectElementFromDropdown(WebElement selectElement,
			String selectorType, String sel) {
		Select select = new Select(selectElement);
		if (selectorType.equalsIgnoreCase("index")) {
			select.selectByIndex(Integer.parseInt(sel));
		}
		if (selectorType.equalsIgnoreCase("visibleText")) {
			select.selectByVisibleText(sel);
		}
		if (selectorType.equalsIgnoreCase("value")) {
			select.selectByValue(sel);
		}
	}
}
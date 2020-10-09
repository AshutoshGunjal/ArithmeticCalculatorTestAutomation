package resources;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeInitialize {

	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException {

		// setting the path for the chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

}

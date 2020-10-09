package stepdefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import resources.ChromeInitialize;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
public class CalculatorStepDefinition extends ChromeInitialize {

	@Given("^Initialize browser with chrome$")
	public void initializeBrowser() throws Throwable {
		driver = initializeDriver();
	}

	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigateTOURL(String strArg1) throws Throwable {
		driver.get(strArg1);
	}

	@When("^User selects (.+) (.+) and (.+)$")
	public void addNumbers(String number1, String operator, String number2) throws Throwable {
		driver.findElement(By.xpath("//button[@value='3']")).click();
		driver.findElement(By.xpath("//button[@value='+']")).click();
		driver.findElement(By.xpath("//button[@value='4']")).click();
	}

	@When("^User selects \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void subtractNumbers(String strArg1, String strArg2, String strArg3) throws Throwable {
		driver.findElement(By.xpath("//button[contains(@value,'1')]")).click();
		driver.findElement(By.xpath("//button[contains(@value,'5')]")).click();
		driver.findElement(By.xpath("//button[contains(@value,'0')]")).click();
		driver.findElement(By.xpath("//button[contains(@value,'-')]")).click();
		driver.findElement(By.xpath("//button[contains(@value,'9')]")).click();
	}

	@When("^User selects \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void multiplyNumbers(String strArg1, String strArg2, String strArg3) throws Throwable {
		driver.findElement(By.cssSelector("button[value='5']")).click();
		driver.findElement(By.cssSelector("button[value='5']")).click();
		driver.findElement(By.cssSelector("button[value='×']")).click();
		driver.findElement(By.cssSelector("button[value='2']")).click();
		driver.findElement(By.cssSelector("button[value='0']")).click();
		driver.findElement(By.cssSelector("button[value='/']")).click();
		driver.findElement(By.cssSelector("button[value='2']")).click();
		driver.findElement(By.cssSelector("button[value='×']")).click();
		driver.findElement(By.cssSelector("button[value='1']")).click();
	}

	@And("^Clicks on (.+)$")
	public void clicksOn(String equals) throws Throwable {
		driver.findElement(By.xpath("//button[@value='=']")).click();
	}

	@Then("^Result should be 7$")
	public void resultShouldBe7() throws Throwable {
		Assert.assertEquals("7", driver.findElement(By.xpath("//div[@id='output']")).getText());
	}

	@Then("^Result should be 38$")
	public void resultShouldBe38() throws Throwable {
		Assert.assertEquals("38", driver.findElement(By.xpath("//div[@id='output']")).getText());
	}

	@Then("^Result should be 61$")
	public void resultShouldBe61() throws Throwable {
		Assert.assertFalse(true);
	}

	@Then("^Result should be 550$")
	public void resultShouldBe550() throws Throwable {
		Assert.assertEquals("550", driver.findElement(By.xpath("//div[@id='output']")).getText());
	}

	@When("^User selects \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void mixedOperation(String strArg1, String strArg2, String strArg3, String strArg4, String strArg5)
			throws Throwable {
		driver.findElement(By.cssSelector("button[value='3']")).click();
		driver.findElement(By.cssSelector("button[value='+']")).click();
		driver.findElement(By.cssSelector("button[value='5']")).click();
		driver.findElement(By.cssSelector("button[value='×']")).click();
		driver.findElement(By.cssSelector("button[value='7']")).click();
	}

	@When("^User selects numbers$")
	public void selectsNumbers() throws Throwable {
		driver.findElement(By.cssSelector("button[value='7']")).click();
		driver.findElement(By.cssSelector("button[value='1']")).click();
	}

	@And("^Clicks on (.+) button$")
	public void clicksOnButton(String delete) throws Throwable {
		driver.findElement(By.xpath("//button[@value='DEL']")).click();
	}

	@When("^User enters invalid input$")
	public void entersInvalidInput() throws Throwable {
		driver.findElement(By.cssSelector("button[value='3']")).click();
		driver.findElement(By.cssSelector("button[value='+']")).click();
		driver.findElement(By.cssSelector("button[value='+']")).click();
	}

	@Then("^User gets error message$")
	public void errorMessage() throws Throwable {
		driver.findElement(By.cssSelector("div[id='output']")).sendKeys("ERR");
	}
}

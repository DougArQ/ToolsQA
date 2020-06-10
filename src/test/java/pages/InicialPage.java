package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InicialPage {

	public InicialPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	WebElement btnElements;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
	WebElement btnForms;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]")
	WebElement btnAlerts;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]")
	WebElement btnWidgets;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]")
	WebElement btnInteractions;

	
	public WebElement btnElements() {
		return btnElements;
	}

	public WebElement btnForms() {
		return btnForms;
	}

	public WebElement btnAlerts() {
		return btnAlerts;
	}

	public WebElement btnWidgets() {
		return btnWidgets;
	}

	public WebElement btnInteractions() {
		return btnInteractions;

	}

}

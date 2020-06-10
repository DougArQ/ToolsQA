package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import managers.DriverManager;
import pages.FormsPage;
import pages.InicialPage;

public class preencherForm {

	WebDriver driver;
	DriverManager dm = new DriverManager();
	InicialPage inicial;
	FormsPage forms;

	@Before
	public void conectar() {
		driver = dm.selectBrowser("chrome");
		inicial = new InicialPage(driver);
		forms = new FormsPage(driver);
		driver.get("http://demoqa.com/");
	}

	@Test
	public void preencherForms() throws InterruptedException {
		inicial.btnForms().click();
		Thread.sleep(3000);
		forms.btnPraticeForms().click();
		forms.txtFirstName().sendKeys("Douglas");
		forms.txtlastName().sendKeys("Ramos");
		forms.txtuserEmail().sendKeys("douglasramos.adm@gmail.com");
		forms.selecionarSexo("male");
		forms.txtuserNumber("1691958491");
		forms.txtdateOfBirth().click();
		forms.selecionarData(13);
		Thread.sleep(9000);
		
		

	}

	@After
	public void desconectar() {
		driver.close();

	}
}

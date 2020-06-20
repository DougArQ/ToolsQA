package steps;

import managers.DriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.FormsPage;
import pages.InicialPage;

import java.util.concurrent.TimeUnit;

public class preencherForm {

	WebDriver driver;
	DriverManager dm = new DriverManager();
	InicialPage inicial;
	FormsPage forms;

	private Select mes;
	private Select ano;
	// Faker

	@Before
	public void conectar() {
		driver = dm.selectBrowser("chrome");
		inicial = new InicialPage(driver);
		forms = new FormsPage(driver);
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
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

		mes = new Select(forms.listaMes());
		mes.selectByVisibleText("August");

		ano = new Select(forms.listaAno());
		ano.selectByVisibleText("1981");

		forms.listaDias().click();
		forms.preencherSubjects("English", "Computer Science", "Maths");
		forms.selecionarHobbie("reading");
		forms.txtAddress().sendKeys("Avenida Rodrigo Fernando Grillo, 587");
		forms.listState().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		forms.preencherState("Rajasthan");

	}

//	@After
//	public void desconectar() {
//		driver.close();
//	}
}

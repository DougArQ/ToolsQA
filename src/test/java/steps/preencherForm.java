package steps;

import managers.DriverManager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
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
		jse.executeScript("scrollBy(0,250)", ""); //Scroll na tela para coseguir visualizar os campos estado e cidade.
		forms.preencherStateCity("Uttar Pradesh", "Merrut");
//		forms.preencherState("Uttar Pradesh");
//		forms.preencherCity("Merrut");
		forms.btnSubmit().click();
		Assert.assertEquals("Thanks for submitting the form", forms.validaMsg());
		Thread.sleep(2000);
		forms.btnClose().click();
	}

//	@After
//	public void desconectar() {
//		driver.close();
//	}
}

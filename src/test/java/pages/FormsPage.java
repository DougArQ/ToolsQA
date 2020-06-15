package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormsPage {

	public FormsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/span[1]")
	WebElement btnPraticeForms;

	@FindBy(id = "firstName")
	WebElement txtFirstName;

	@FindBy(id = "lastName")
	WebElement txtlastName;

	@FindBy(id = "userEmail")
	WebElement txtuserEmail;

	// Gender
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/label[1]")
	WebElement male;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[2]/label[1]")
	WebElement female;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[3]/label[1]")
	WebElement other;

	@FindBy(id = "userNumber")
	WebElement txtuserNumber;

	@FindBy(id = "dateOfBirthInput")
	WebElement txtdateOfBirth;

	@FindBy(className = "react-datepicker__month-select")
	WebElement listaMes;

	@FindBy(className = "react-datepicker__week")
	WebElement listaDias;

	@FindBy(className = "react-datepicker__year-select")
	WebElement listaAno;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]")
	WebElement txtSubjects;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/div[2]/div[1]/label[1]")
	WebElement checkSports;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/div[2]/div[2]/label[1]")
	WebElement checkReading;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/div[2]/div[3]/label[1]")
	WebElement checkMusic;

	public WebElement btnPraticeForms() {
		return btnPraticeForms;
	}

	public WebElement txtFirstName() {
		return txtFirstName;
	}

	public WebElement txtlastName() {
		return txtlastName;
	}

	public WebElement txtuserEmail() {
		return txtuserEmail;
	}

	public void selecionarSexo(String sexo) {

		if (sexo == "male") {
			male.click();
		} else if (sexo == "female") {
			female.click();
		} else {
			other.click();
		}

	}

	public void txtuserNumber(String telefone) {

		Integer QtdNumeros = telefone.length();
		System.out.println(QtdNumeros);

		if (QtdNumeros == 10) {
			txtuserNumber.sendKeys(telefone);
		} else if (QtdNumeros != 10) {
			System.out.println("Número Inválido, digite novamente");
		}
	}

	public WebElement txtdateOfBirth() {
		return txtdateOfBirth;
	}

	public WebElement listaMes() {
		return listaMes;
	}

	public WebElement listaDias() {
		return listaDias;
	}

	public WebElement listaAno() {
		return listaAno;
	}

	public void selecionarData(Integer dia) {

		Select dropdown = new Select(listaDias);
		dropdown.selectByIndex(dia);

	}

	public WebElement txtSubjects() {
		return txtSubjects;
	}

	public WebElement checkSports() {
		return checkSports;
	}
	
	public WebElement checkReading() {
		return checkReading;
	}
	
	public WebElement checkMusic() {
		return checkMusic;
	}
	
//	public void selecionarHobbie(String hobbie) {
//
//		if (hobbie == "sports") {
//			checkSports.click();
//		} else if (hobbie == "reading") {
//			checkReading.click();
//		} else {
//			checkMusic.click();
//		}
	


	}



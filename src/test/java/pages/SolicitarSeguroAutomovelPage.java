package pages;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.KillDriver;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SolicitarSeguroAutomovelPage {

	public void acessarPagina(String url) {
		getDriver().navigate().to(url);
		getDriver().findElement(By.id("nav_automobile")).click();
	}
	
	public void verificarAcessoAPagina(String nomePagina) {
		String titulo = getDriver().findElement(By.id("app_sub_title")).getText();
		assertEquals(nomePagina,titulo);
	}
	
	public void preencherCampoMake(String valor) {
		Select dropdown = new Select(getDriver().findElement(By.id("make")));
		dropdown.selectByValue(valor);
	}
	
	public void preencherCampoEnginePerformance(String valor) {
		getDriver().findElement(By.id("engineperformance")).sendKeys(valor);
	}
	
	public void preencherCampoDateManufacture(String data) {
		getDriver().findElement(By.id("dateofmanufacture")).sendKeys(data);
	}
	
	public void preencherCampoNumberSeats(String valor) {
		Select dropdown = new Select(getDriver().findElement(By.id("numberofseats")));
		dropdown.selectByValue(valor);
	}
	
	public void preencherCampoFuel(String valor) {
		Select dropdown = new Select(getDriver().findElement(By.id("fuel")));
		dropdown.selectByValue(valor);
	}
	
	public void preencherCampoListPrice(String valor) {
		getDriver().findElement(By.id("listprice")).sendKeys(valor);
	}
	
	public void preencherCampoLicensePlateNumber(String valor) {
		getDriver().findElement(By.id("licenseplatenumber")).sendKeys(valor);
	}
	
	public void preencherCampoAnnualMileage(String valor) {
		getDriver().findElement(By.id("annualmileage")).sendKeys(valor);
	}
	
	public void preencherCampoFirstName(String valor) {
		getDriver().findElement(By.id("firstname")).sendKeys(valor);
	}
	
	public void preencherCampoLastName(String valor) {
		getDriver().findElement(By.id("lastname")).sendKeys(valor);
	}
	
	public void preencherCampoBirthDate(String data) {
		getDriver().findElement(By.id("birthdate")).sendKeys(data);
	}
	
	public void preencherCampoCountry(String valor) {
		Select dropdown = new Select(getDriver().findElement(By.id("country")));
		dropdown.selectByValue(valor);
	}
	
	public void preencherCampoZipCode(String valor) {
		getDriver().findElement(By.id("zipcode")).sendKeys(valor);
	}
	
	public void preencherCampoOccupation(String valor) {
		Select dropdown = new Select(getDriver().findElement(By.id("occupation")));
		dropdown.selectByValue(valor);
	}
	
	public void preencherCampoHobbies(String valor) {
		WebElement checkbox = getDriver().findElement(By.id(valor));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
	    js.executeScript("arguments[0].click();", checkbox);
	}
	
	public void preencherCampoStartDate(String valor) {
		getDriver().findElement(By.id("startdate")).sendKeys(valor);
	}
	
	public void preencherCampoInsuranceSum(String valor) {
		Select dropdown = new Select(getDriver().findElement(By.id("insurancesum")));
		dropdown.selectByValue(valor);
	}
	
	public void preencherCampoMeritRating(String valor) {
		Select dropdown = new Select(getDriver().findElement(By.id("meritrating")));
		dropdown.selectByValue(valor);
	}
	
	public void preencherCampoDamageInsurance(String valor) {
		Select dropdown = new Select(getDriver().findElement(By.id("damageinsurance")));
		dropdown.selectByValue(valor);
	}
	
	public void preencherCampoOptionalProducts(String valor) {
		WebElement checkbox = getDriver().findElement(By.id(valor));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
	    js.executeScript("arguments[0].click();", checkbox);
	}
	
	public void preencherCampoCourtesyCar(String valor) {
		Select dropdown = new Select(getDriver().findElement(By.id("courtesycar")));
		dropdown.selectByValue(valor);
	}
	
	public void preencherPreco(String valor) {
		WebElement checkbox = getDriver().findElement(By.id(valor));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
	    js.executeScript("arguments[0].click();", checkbox);
	}
	
	public void preencherCampoEmail(String valor) {
		getDriver().findElement(By.id("email")).sendKeys(valor);
	}
	
	public void preencherCampoUsername(String valor) {
		getDriver().findElement(By.id("username")).sendKeys(valor);
	}
	
	public void preencherCampoPassword(String valor) {
		getDriver().findElement(By.id("password")).sendKeys(valor);
	}
	
	public void preencherCampoConfirmPassword(String valor) {
		getDriver().findElement(By.id("confirmpassword")).sendKeys(valor);
	}
	
	public void pressionarBotaoEnviar() {
		getDriver().findElement(By.id("sendemail")).click();
	}
	
	public void pressionarBotaoPorNome(String nome) {
		WebElement botao = getDriver().findElement(By.name(nome));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
	    js.executeScript("arguments[0].click();", botao);
	}
	
	public String retornaMensagemSucesso() {
		return getDriver().findElement(By.xpath("//div[@class = 'sweet-alert showSweetAlert visible']//h2")).getText();
	}
	
	public void fecharDriver() {
		KillDriver();
	}
}

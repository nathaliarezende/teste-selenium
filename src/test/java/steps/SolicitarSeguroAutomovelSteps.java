package steps;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.SolicitarSeguroAutomovelPage;


public class SolicitarSeguroAutomovelSteps {
	
	private SolicitarSeguroAutomovelPage seguroAutomovelPage = new SolicitarSeguroAutomovelPage();
	
	@Dado("que o usuario se encontra na pagina de solicitacao de seguro de automovel")
	public void que_o_usuario_se_encontra_na_pagina_de_solicitacao_de_seguro_de_automovel() {
		seguroAutomovelPage.acessarPagina("http://sampleapp.tricentis.com/101/index.php");
		seguroAutomovelPage.verificarAcessoAPagina("Vehicle Insurance Application");
	}

	@Quando("preencher o formulario Enter Vehicle Data")
	public void preencher_o_formulario_enter_vehicle_data() {
		seguroAutomovelPage.preencherCampoMake("Volkswagen");
		seguroAutomovelPage.preencherCampoEnginePerformance("82");
		seguroAutomovelPage.preencherCampoDateManufacture("10/25/2015");
		seguroAutomovelPage.preencherCampoNumberSeats("5");
		seguroAutomovelPage.preencherCampoFuel("Diesel");
		seguroAutomovelPage.preencherCampoListPrice("23000");
		seguroAutomovelPage.preencherCampoLicensePlateNumber("OTZ-2585");
		seguroAutomovelPage.preencherCampoAnnualMileage("1100");
		seguroAutomovelPage.pressionarBotaoPorNome("Next (Enter Insurant Data)");
	}

	@Quando("preencher o formulario Enter Insurant Data")
	public void preencher_o_formulario_enter_insurant_data() {
		seguroAutomovelPage.preencherCampoFirstName("Aparecida");
		seguroAutomovelPage.preencherCampoLastName("Santos");
		seguroAutomovelPage.preencherCampoBirthDate("05/01/1990");
		seguroAutomovelPage.preencherCampoCountry("Brazil");
		seguroAutomovelPage.preencherCampoZipCode("37200000");
		seguroAutomovelPage.preencherCampoOccupation("Employee");
		seguroAutomovelPage.preencherCampoHobbies("bungeejumping");
		seguroAutomovelPage.pressionarBotaoPorNome("Next (Enter Product Data)");
	}

	@Quando("preencher o formulario Enter Product Data")
	public void preencher_o_formulario_enter_product_data() {
		seguroAutomovelPage.preencherCampoStartDate("11/11/2022");
		seguroAutomovelPage.preencherCampoInsuranceSum("5000000");
		seguroAutomovelPage.preencherCampoMeritRating("Bonus 6");
		seguroAutomovelPage.preencherCampoDamageInsurance("Full Coverage");
		seguroAutomovelPage.preencherCampoOptionalProducts("EuroProtection");
		seguroAutomovelPage.preencherCampoCourtesyCar("No");
		seguroAutomovelPage.pressionarBotaoPorNome("Next (Select Price Option)");
	}

	@Quando("preencher o formulario Select Price Option")
	public void preencher_o_formulario_select_price_option() {
		seguroAutomovelPage.preencherPreco("selectplatinum");
		seguroAutomovelPage.pressionarBotaoPorNome("Next (Send Quote)");
	}

	@Quando("preencher o formulario Send Quote")
	public void preencher_o_formulario_send_quote() {
		seguroAutomovelPage.preencherCampoEmail("aparecida.santos@gmail.com");
		seguroAutomovelPage.preencherCampoUsername("aparecida");
		seguroAutomovelPage.preencherCampoPassword("Ap123456");
		seguroAutomovelPage.preencherCampoConfirmPassword("Ap123456");
		seguroAutomovelPage.pressionarBotaoEnviar();
	}

	@Entao("devera visualizar a mensagem {string}")
	public void devera_visualizar_a_mensagem(String string) {
	    assertEquals(string, seguroAutomovelPage.retornaMensagemSucesso());
	}

	@After
	public void fechar_navegador() {
	    seguroAutomovelPage.fecharDriver();
	}
}

package steps;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.SolicitarSeguroAutomovelPage;


public class SolicitarSeguroAutomovelSteps {
	
	private SolicitarSeguroAutomovelPage seguroAutomovelPage = new SolicitarSeguroAutomovelPage();
	
	@Quando("acessar a url {string}")
	public void acessar_a_url(String string) {
		seguroAutomovelPage.acessarPagina(string);
	}

	@Entao("devera ter acesso ao formulario de {string}")
	public void devera_ter_acesso_ao_formulario_de(String string) {
		seguroAutomovelPage.verificarAcessoAPagina(string);
	}
	
	@Dado("que o usuario se encontra na aba {string}")
	public void que_o_usuario_se_encontra_na_aba(String string) {
		//VERIFICAR
	}

	@Quando("preencher o campo Make com {string}")
	public void preencher_o_campo_make_com(String string) {
		seguroAutomovelPage.preencherCampoMake(string);
	}

	@Quando("preencher o campo Engine Performance com {string}")
	public void preencher_o_campo_engine_performance_com(String string) {
		seguroAutomovelPage.preencherCampoEnginePerformance(string);
	}

	@Quando("preencher o campo Date of Manufacture com {string}")
	public void preencher_o_campo_date_of_manufacture_com(String string) {
		seguroAutomovelPage.preencherCampoDateManufacture(string);
	}

	@Quando("preencher o campo Number of Seats com {string}")
	public void preencher_o_campo_number_of_seats_com(String string) {
		seguroAutomovelPage.preencherCampoNumberSeats(string);
	}

	@Quando("preencher o campo Fuel Type com {string}")
	public void preencher_o_campo_fuel_type_com(String string) {
		seguroAutomovelPage.preencherCampoFuel(string);
	}

	@Quando("preencher o campo List Price com {string}")
	public void preencher_o_campo_list_price_com(String string) {
		seguroAutomovelPage.preencherCampoListPrice(string);
	}

	@Quando("preencher o campo License Plate Number com {string}")
	public void preencher_o_campo_license_plate_number_com(String string) {
		seguroAutomovelPage.preencherCampoLicensePlateNumber(string);
	}

	@Quando("preencher o campo Annual Mileage com {string}")
	public void preencher_o_campo_annual_mileage_com(String string) {
		seguroAutomovelPage.preencherCampoAnnualMileage(string);
	}
	
	@Quando("preencher o campo Name com {string}")
	public void preencher_o_campo_name_com(String string) {
		seguroAutomovelPage.preencherCampoFirstName(string);
	}

	@Quando("preencher o campo Last Name com {string}")
	public void preencher_o_campo_last_name_com(String string) {
		seguroAutomovelPage.preencherCampoLastName(string);
	}

	@Quando("preencher o campo Date of Birth com {string}")
	public void preencher_o_campo_date_of_birth_com(String string) {
		seguroAutomovelPage.preencherCampoBirthDate(string);
	}

	@Quando("preencher o campo Country com {string}")
	public void preencher_o_campo_country_com(String string) {
		seguroAutomovelPage.preencherCampoCountry(string);
	}

	@Quando("preencher o campo Zip Code com {string}")
	public void preencher_o_campo_zip_code_com(String string) {
		seguroAutomovelPage.preencherCampoZipCode(string);
	}

	@Quando("preencher o campo Occupation com {string}")
	public void preencher_o_campo_occupation_com(String string) {
		seguroAutomovelPage.preencherCampoOccupation(string);
	}

	@Quando("preencher o campo Hobbies com {string}")
	public void preencher_o_campo_hobbies_com(String string) {
		seguroAutomovelPage.preencherCampoHobbies(string);
	}
	
	@Quando("preencher o campo Start Date com {string}")
	public void preencher_o_campo_start_date_com(String string) {
		seguroAutomovelPage.preencherCampoStartDate(string);
	}

	@Quando("preencher o campo Insurance Sum com {string}")
	public void preencher_o_campo_insurance_sum_com(String string) {
		seguroAutomovelPage.preencherCampoInsuranceSum(string);
	}

	@Quando("preencher o campo Merit Rating com {string}")
	public void preencher_o_campo_merit_rating_com(String string) {
		seguroAutomovelPage.preencherCampoMeritRating(string);
	}

	@Quando("preencher o campo Damage Insurance com {string}")
	public void preencher_o_campo_damage_insurance_com(String string) {
		seguroAutomovelPage.preencherCampoDamageInsurance(string);
	}

	@Quando("preencher o campo Optional Products com {string}")
	public void preencher_o_campo_optional_products_com(String string) {
		seguroAutomovelPage.preencherCampoOptionalProducts(string);
	}

	@Quando("preencher o campo Courtesy Car com {string}")
	public void preencher_o_campo_courtesy_car_com(String string) {
		seguroAutomovelPage.preencherCampoCourtesyCar(string);
	}
	
	@Quando("selecionar a opcao de preco {string}")
	public void selecionar_a_opcao_de_preco(String string) {
		seguroAutomovelPage.preencherPreco(string);
	}
	
	@Quando("preencher o campo Email com {string}")
	public void preencher_o_campo_email_com(String string) {
		seguroAutomovelPage.preencherCampoEmail(string);
	}

	@Quando("preencher o campo Username com {string}")
	public void preencher_o_campo_username_com(String string) {
		seguroAutomovelPage.preencherCampoUsername(string);
	}

	@Quando("preencher o campo Password com {string}")
	public void preencher_o_campo_password_com(String string) {
		seguroAutomovelPage.preencherCampoPassword(string);
	}

	@Quando("preencher o campo Confirm Password com {string}")
	public void preencher_o_campo_confirm_password_com(String string) {
		seguroAutomovelPage.preencherCampoConfirmPassword(string);
	}

	@Quando("pressionar o botao para enviar formulario")
	public void pressionar_o_botao_para_enviar_formulario() {
	    seguroAutomovelPage.pressionarBotaoEnviar();
	}
	
	@Quando("pressionar o botao {string}")
	public void pressionar_o_botao(String string) {
		seguroAutomovelPage.pressionarBotaoPorNome(string);
	}

	@Entao("sera redirecionado para a aba {string}")
	public void sera_redirecionado_para_a_aba(String string) {
		//VERIFICAR
	}
	
	@Entao("devera visualizar a mensagem {string}")
	public void devera_visualizar_a_mensagem(String string) {
	    assertEquals(string, seguroAutomovelPage.retornaMensagemSucesso());
	    seguroAutomovelPage.fecharDriver();
	}

}

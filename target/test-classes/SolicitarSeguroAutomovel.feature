#language: pt
Funcionalidade: Soliciacao de seguro de automovel

Cenario: Deve acessar a pagina de solicitacao de seguro de automovel
	Quando acessar a url "http://sampleapp.tricentis.com/101/index.php"
	Entao devera ter acesso ao formulario de "Vehicle Insurance Application"
	
Cenario: Deve preencher o formulario da aba Enter Vehicle Data
	Dado que o usuario se encontra na aba "Enter Vehicle Data"
	Quando preencher o campo Make com "Volkswagen"
	E preencher o campo Engine Performance com "82"
	E preencher o campo Date of Manufacture com "10/25/2015"
	E preencher o campo Number of Seats com "5"
	E preencher o campo Fuel Type com "Diesel"
	E preencher o campo List Price com "23000"
	E preencher o campo License Plate Number com "OTZ-2585"
	E preencher o campo Annual Mileage com "1100"
	E pressionar o botao "Next (Enter Insurant Data)"
	Entao sera redirecionado para a aba "Enter Insurant Data"
	
Cenario: Deve preencher o formulario da aba Enter Insurant Data
	Dado que o usuario se encontra na aba "Enter Insurant Data"
	Quando preencher o campo Name com "Aparecida"
	E preencher o campo Last Name com "Santos"
	E preencher o campo Date of Birth com "05/01/1990"
	E preencher o campo Country com "Brazil"
	E preencher o campo Zip Code com "37200000"
	E preencher o campo Occupation com "Employee"
	E preencher o campo Hobbies com "bungeejumping"
	E sera redirecionado para a aba "Enter Product Data"
	E pressionar o botao "Next (Enter Product Data)"
	Entao sera redirecionado para a aba "Enter Product Data"
	
Cenario: Deve preencher o formulario da aba Enter Product Data
	Dado que o usuario se encontra na aba "Enter Product Data"
	Quando preencher o campo Start Date com "11/11/2022"
	E preencher o campo Insurance Sum com "5000000"
	E preencher o campo Merit Rating com "Bonus 6"
	E preencher o campo Damage Insurance com "Full Coverage"
	E preencher o campo Optional Products com "EuroProtection"
	E preencher o campo Courtesy Car com "No"
	E pressionar o botao "Next (Select Price Option)"
	Entao sera redirecionado para a aba "Select Price Option"
	
Cenario: Deve preencher o formulario da aba Select Price Option
	Dado que o usuario se encontra na aba "Select Price Option"
	Quando selecionar a opcao de preco "selectplatinum"
	E pressionar o botao "Next (Send Quote)"
	Entao sera redirecionado para a aba "Send Quote"
	
Cenario: Deve preencher o formulario da aba Send Quote
	Dado que o usuario se encontra na aba "Send Quote"
	Quando preencher o campo Email com "aparecida.santos@gmail.com"
	E preencher o campo Username com "aparecida"
	E preencher o campo Password com "Ap123456"
	E preencher o campo Confirm Password com "Ap123456"
	E pressionar o botao para enviar formulario
	Entao devera visualizar a mensagem "Sending e-mail success!"

	

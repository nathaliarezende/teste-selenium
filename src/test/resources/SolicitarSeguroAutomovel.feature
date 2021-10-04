#language: pt
Funcionalidade: Soliciacao de seguro de automovel
	
	Como um potencial cliente
	Gostaria de preencher o formulario de seguros
	Para cotar o valor do seguro para automovel
	
Contexto: 
	Dado que o usuario se encontra na pagina de solicitacao de seguro de automovel
	
Cenario: Deve preencher o formulario completo com sucesso
	Quando preencher o formulario Enter Vehicle Data
	E preencher o formulario Enter Insurant Data
	E preencher o formulario Enter Product Data
	E preencher o formulario Select Price Option
	E preencher o formulario Send Quote
	Entao devera visualizar a mensagem "Sending e-mail success!"
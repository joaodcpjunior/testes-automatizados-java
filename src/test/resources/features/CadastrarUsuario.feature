#language: pt
#enconding: UTF-8

@CadastrarUsuario
Funcionalidade: Cadastrar Usuario

	@cadastro
	Cenario: cadastrar usuario
		Quando eu acionar a aba admin
		E eu acionar o botao add
		E informar no campo employee name "Fiona Grace"
		E informar no campo username "GameMaster3"
		E informar no campo password "Agoravai3562!"
		E informar no campo confirmar password "Agoravai3562!"
		E acionar o botao salvar
		Entao o sistema cadastra o usuario "GameMaster3"
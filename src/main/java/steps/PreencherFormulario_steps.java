package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.ProfilePage;
import pages.UserAccountPage;

public class PreencherFormulario_steps {

	private HomePage home = new HomePage();
	private ProfilePage perfil = new ProfilePage();
	private UserAccountPage userAccount = new UserAccountPage();
	
	String currencySymbol;


	@Dado("acesso o menu User Account")
	public void acessoOMenuUserAccount() {
		home.validarPageHome()
			.acesarPerfil();
		perfil.validarProfilePage()
			.acessarUserAccount();
		
	}
	
	@Quando("preencher e salvar o formulario")
	public void preencherESalvarOFormulario() {
		userAccount.validarUserAccountPage()
			.preencherFormulario()
			.salvarFormulario();
	}
	
	@Entao("e apresentado a mensagem {string}")
	public void eApresentadoAMensagem(String texto) {
		userAccount.mensagemFalha(texto);
	}

}

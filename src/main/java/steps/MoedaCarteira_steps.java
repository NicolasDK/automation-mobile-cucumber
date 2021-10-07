package steps;

import static org.junit.Assert.assertEquals;

import appiumCore.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HoldingsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;
import pages.ProfilePage;
import pages.SettingsPage;

public class MoedaCarteira_steps {

	private LoginPage login = new LoginPage();
	private HomePage home = new HomePage();
	private ProfilePage perfil = new ProfilePage();
	private SettingsPage settings = new SettingsPage();
	private HoldingsPage holdings = new HoldingsPage();
	private MenuPage menu = new MenuPage();

	String currencySymbol;
	
	@After
	public static void resetarApp() {
		DriverFactory.getDriver().resetApp();
	}
	
	@Dado("que acesse o app diretamente sem efetuar a autenticacao MFA")
	public void queAcesseOAppDiretamenteSemEfetuarAAutenticacaoMFA() {
		login.inserirPassword();
	}

	@Quando("alterar a moeda da minha carteira para {string}")
	public void alterarAMoedaDaMinhaCarteiraPara(String moeda) {
		home.validarPageHome()
			.acesarPerfil();
		perfil.validarProfilePage()
			.acessarSettings();
		settings.validarSettingsPage()
			.acessarCurrency()
			.validarSelectCurrency()
			.selecionarCurrency(moeda);
	}

	@Entao("ao verificar a carteira o saldo deve ser apresentado em dolar com o simbolo {string}")
	public void aoVerificarACarteiraOSaldoDeveSerApresentadoEmDolarComOSimbolo(String simbolo) {
		menu.voltar().voltar();
		home.validarPageHome();
		menu.acessarHoldings();
		holdings.validarHoldingsPage();

		assertEquals(holdings.obterHouldingSymbol(), simbolo);
	}
	
}

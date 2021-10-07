package pages;

import org.openqa.selenium.By;

import appiumCore.BasePage;

public class SettingsPage extends BasePage {
	
	By currency = By.id("io.klever.secure.exchange:id/currency");
	
	public SettingsPage validarSettingsPage() {
		obterTitulo().equals("Settings");
		return this;
	}
	
	public SettingsPage acessarCurrency() {
		clicar(currency);
		return this;
	}
	
	public SettingsPage validarSelectCurrency() {
		obterHeader().equals("Select currency");
		return this;
	}
	
	public SettingsPage selecionarCurrency(String currency) {
		clicarPorTexto(currency);
		return this;
	}
	
}

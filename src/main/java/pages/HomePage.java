package pages;

import org.openqa.selenium.By;

import appiumCore.BasePage;

public class HomePage extends BasePage {
	
	By profile = By.id("io.klever.secure.exchange:id/profileIcon");
	By titlePage = By.id("io.klever.secure.exchange:id/title");
	
	public HomePage validarPageHome() {
		obterTitulo().contains("Hello");
		return this;
	}
	
	public HomePage acesarPerfil() {
		 clicar(profile);
		 return this;
	}
	
}

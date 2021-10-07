package pages;

import org.openqa.selenium.By;

import appiumCore.BasePage;

public class ProfilePage extends BasePage {
	
	By profile = By.id("io.klever.secure.exchange:id/profileIcon");
	By settings = By.id("io.klever.secure.exchange:id/profile_settings");
	By userAccount = By.id("io.klever.secure.exchange:id/profile_user_account");
	
	public ProfilePage validarProfilePage() {
		obterTitulo().equals("Profile");
		return this;
	}
	
	public ProfilePage acessarSettings() {
		clicar(settings);
		return this;
	}
	
	public ProfilePage acessarUserAccount() {
		clicar(userAccount);
		return this;
	}
	
}

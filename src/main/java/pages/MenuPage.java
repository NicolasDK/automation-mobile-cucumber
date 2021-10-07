package pages;

import org.openqa.selenium.By;

import appiumCore.BasePage;

public class MenuPage extends BasePage {

	By home = By.id("io.klever.secure.exchange:id/tab_home_nav_graph");
	By holdings = By.id("io.klever.secure.exchange:id/tab_holding_nav_graph");
	By back = By.id("io.klever.secure.exchange:id/back");

	public MenuPage acessarHome() {
		clicar(home);
		return this;
	}

	public MenuPage acessarHoldings() {
		clicar(holdings);
		return this;
	}

	public MenuPage voltar() {
		clicar(back);
		return this;
	}

}

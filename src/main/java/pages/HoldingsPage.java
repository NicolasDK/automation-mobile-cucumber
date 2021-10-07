package pages;

import org.openqa.selenium.By;

import appiumCore.BasePage;

public class HoldingsPage extends BasePage {

	By holdingSymbol = By.id("io.klever.secure.exchange:id/txt_holding_symbol");

	public HoldingsPage validarHoldingsPage() {
		obterTitulo().equals("Holdings");
		return this;
	}

	public String obterHouldingSymbol() {
		return obterTexto(holdingSymbol);
	}
}

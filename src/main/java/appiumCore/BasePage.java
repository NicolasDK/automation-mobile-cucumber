package appiumCore;

import static appiumCore.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {
	
	By titulo = By.id("io.klever.secure.exchange:id/title");
	By header = By.id("io.klever.secure.exchange:id/header");

	public void inserirTexto(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
	}
	
	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public void clicarPorTexto(String texto) {
		clicar(By.xpath("//*[@text='" + texto + "']"));
	}
	
	public void contemTexto(String texto) {
		getDriver().findElementByXPath("//*[@text='" + texto + "']").isDisplayed();
	}
	
	public String obterTitulo() {
		return getDriver().findElement(titulo).getAttribute("text");
	}
	
	public String obterHeader() {
		return getDriver().findElement(header).getAttribute("text");
	}

	public void clicar(By by) {
		getDriver().findElement(by).click();
	}	
}

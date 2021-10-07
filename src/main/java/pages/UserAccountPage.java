package pages;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;

import appiumCore.BasePage;

public class UserAccountPage extends BasePage {
	
	Faker faker = new Faker();

	By street1 = By.id("io.klever.secure.exchange:id/edt_street_1");
	By street2 = By.id("io.klever.secure.exchange:id/edt_street_2");
	By city = By.id("io.klever.secure.exchange:id/edt_city");
	By state = By.id("io.klever.secure.exchange:id/edt_state");
	By country = By.id("io.klever.secure.exchange:id/edt_country");
	By zipCode = By.id("io.klever.secure.exchange:id/edt_zipcode");

	By save = By.id("io.klever.secure.exchange:id/btn_save_edt_user_account");

	public UserAccountPage validarUserAccountPage() {
		obterTitulo().equals("Profile edit");
		return this;
	}

	public UserAccountPage preencherFormulario() {
		inserirTexto(street1, faker.address().streetName());
		inserirTexto(street2, faker.address().streetName());
		inserirTexto(city, faker.address().city());
		inserirTexto(state, faker.address().state());
		inserirTexto(country, faker.address().country());
		inserirTexto(zipCode, faker.address().zipCode());
		return this;
	}
	
	public UserAccountPage salvarFormulario() {
		clicar(save);
		return this;
	}
	
	public UserAccountPage mensagemFalha(String texto) {
		contemTexto(texto);
		return this;
	}
	
	


	//DriverFactory.getDriver().findElementById("io.klever.secure.exchange:id/edt_street_1").sendKeys("Rua X");
	//DriverFactory.getDriver().findElementById("io.klever.secure.exchange:id/edt_street_2").sendKeys("Rua Y");
	//DriverFactory.getDriver().findElementById("io.klever.secure.exchange:id/edt_city").sendKeys("Cidade A");
	//DriverFactory.getDriver().findElementById("io.klever.secure.exchange:id/edt_state").sendKeys("Estado B");
	//DriverFactory.getDriver().findElementById("io.klever.secure.exchange:id/edt_country").sendKeys("Pais C");
	//DriverFactory.getDriver().findElementById("io.klever.secure.exchange:id/edt_zipcode").sendKeys("12345678");
	//
	//DriverFactory.getDriver().findElementById("io.klever.secure.exchange:id/btn_save_edt_user_account").isEnabled();
	//DriverFactory.getDriver().findElementById("io.klever.secure.exchange:id/btn_save_edt_user_account").click();
	//
	//DriverFactory.getDriver().findElementById("mensagem.falha").isEnabled();
	//DriverFactory.getDriver().findElementById("mensagem.falha").getText().equals("");
}

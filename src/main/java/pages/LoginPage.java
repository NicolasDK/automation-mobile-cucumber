package pages;

import static appiumCore.DriverFactory.getDriver;
import static utils.ArquivoProps.getProp;

import java.io.IOException;

import org.openqa.selenium.By;

public class LoginPage {

	public LoginPage inserirPassword() {
		if (!getDriver().findElements(By.xpath("//*[@text='PIN']")).isEmpty()) {

			String pass = "";
			try {
				pass = getProp().getProperty("password");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			char[] array = pass.toCharArray();

			for (int index = 0; index < array.length; index++) {
				getDriver().findElement(By.xpath("//*[@text='" + array[index] + "']")).click();
			}

			if (!getDriver().findElements(By.xpath("//*[@text='Confirm your PIN']")).isEmpty()) {
				for (int index = 0; index < array.length; index++) {
					getDriver().findElement(By.xpath("//*[@text='" + array[index] + "']")).click();
				}
			}
		}
		return this;
	}
	
}

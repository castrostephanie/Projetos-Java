package configuracoes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GerenciadorChromeDriver extends GerenciadorDeDriver {

	@Override
	public void createWebDriver() {
		ChromeOptions options = new ChromeOptions();
		this.driver = new ChromeDriver(options);
	}
}

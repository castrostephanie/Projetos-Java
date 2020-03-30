package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PageObject.ComprarPage;
import configuracoes.DriverManagerFactory;
import configuracoes.DriverType;
import configuracoes.GerenciadorDeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.*;
import cucumber.api.java.pt.*;


public class StepsComprar {
	public static GerenciadorDeDriver gerenciadorDeDriver;
	public static WebDriver driver;
	public static ComprarPage comprarPage;
	
	@Before
	public void acessarSite() {
		gerenciadorDeDriver = DriverManagerFactory.getGerenciadorDeDriver(DriverType.CHROME);
		driver = gerenciadorDeDriver.getWebDriver();
		driver.manage().window().maximize();
		comprarPage = new ComprarPage(driver);
	}
		
		@Dado("Que eu acesse o site Automation Practice")
		public void acessar_site() {
			driver.get("http://automationpractice.com/index.php");
		}
		
		@Quando("Clicar em DRESSES") 
		public void clicar_dresses() {							
			ComprarPage comprar_page = new ComprarPage(driver); 
			comprar_page.clickDresses();
		}
		
		@Quando("Clicar na opção - Summer Dresses opção Printed Summer Dress") 
		public void clicar_summerdress() {
			ComprarPage comprar_page = new ComprarPage(driver);
			comprar_page.clickSummerDresses();
		}
			
		@Quando("Clicar em Printed Summer Dress")
		public void clicar_printed() {
			ComprarPage comprar_page = new ComprarPage(driver);
			comprar_page.clickPrinted();	
		}
		
		@Dado("Clicar no campo Quantity")
		public void clicar_quantity() {
			ComprarPage comprar_page = new ComprarPage(driver);
			comprar_page.clickQuantity();
		}
		
		@Quando("Clicar em size e selecionar a opção S")
		public void clicar_size() {
			ComprarPage comprar_page = new ComprarPage(driver);
			comprar_page.clickSize();	
		}
		
		@Quando("Clicar em cima do Yellow")
		public void clicar_color() {
			ComprarPage comprar_page = new ComprarPage(driver);
			comprar_page.clickColor();
		}
		
		@Quando("Clicar em cima da opção Add cart")
		
		@Quando("Clicar em cima de Proceed to Chekout")
		
		@Quando("Visualizar a pagina de sign in")
		
		@Quando("Preencher os campos email e password <emailadress> e <password>")
		
		@Quando("Clicar no botão de sing in ")
		
		@Quando("Clicar em proceed to chechout")
		
		@Quando("Clicar em Pay by back wire ")
		
		@Quando("Clicar em I confirm my order")
		
		@Entao("o boleto sera gerado")
		
		
		
		
		
		
		
		
		
		
	@After
	public void encerraSessao() {
		driver.quit();
	}
	
}


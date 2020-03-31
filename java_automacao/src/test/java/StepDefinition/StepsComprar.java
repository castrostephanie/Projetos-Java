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
		public void clicar_cart() {
			ComprarPage comprar_page = new ComprarPage(driver);
			comprar_page.clickAddcart();
		}
		
		@Quando("Clicar em cima de Proceed to Chekout")
		public void clicar_proceed() {
			ComprarPage comprar_page = new ComprarPage(driver);
			comprar_page.clickProceed();
		}	
		
		@Quando("Clicar em cima de Proceed to chekout outra vez ")
		public void proceed_two() {
			ComprarPage comprar_page = new ComprarPage(driver);
			comprar_page.ClickProceedTwo();
		}
		
		@Quando("Visualizar a pagina de sign in")
		public void visualizar_singin() {
			ComprarPage comprar_page = new ComprarPage(driver);	
		}
		
		@Quando("Preencher os campos email e password {string} e {string}")
		public void preencher_campo(String emailaddress, String password) throws InterruptedException {
			comprarPage.setEmail(emailaddress);
			comprarPage.setPassword(password);
		}
		
		@Quando("Clicar no botão de sing in ")
		public void clicar_singin() {
			ComprarPage comprar_page = new ComprarPage(driver);		
			comprar_page.clickSingin();
		}
		
		@Quando("Clicar em proceed to chechout")
		public void proceed_chechout() {
			ComprarPage comprar_page = new ComprarPage(driver);
			comprar_page.clickProceedcheckout();
		}
		
		@Quando("Clicar em Terms")
		public void clicar_terms() {
			ComprarPage comprar_page = new ComprarPage(driver);
			comprar_page.clickTerms();
		}
		
		@Quando("Clicar em proceed ckeckout novamente")
		public void proceed_theree() {
			ComprarPage comprar_page = new ComprarPage(driver);
			comprar_page.clickProceedthree();
		}
		
		@Quando("Clicar em Pay by back wire ")
		public void pay_by() {
			ComprarPage comprar_page = new ComprarPage(driver);
			comprar_page.clickPayby();
		}
		
		@Quando("Clicar em I confirm my order")
		public void my_order() {
			ComprarPage comprar_page = new ComprarPage(driver);
			comprar_page.clickMyorder();
		}
		
		@Entao("o boleto sera gerado")
		public void gerar_boleto() throws InterruptedException {
		Thread.sleep(2000);
		ComprarPage comprar_page = new ComprarPage(driver);
		comprar_page.clickBoleto();
		
		}		
		
	@After
	public void encerraSessao() {
		driver.quit();
	}
	
}


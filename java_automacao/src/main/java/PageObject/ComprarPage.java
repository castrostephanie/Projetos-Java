package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComprarPage {
	WebDriver driver;
	
	public ComprarPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	private By dresses = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]");
	private By printed = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a");
	private By summerdresses = By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[3]/a");
	private By quantity = By.xpath("//*[@id=\"quantity_wanted\"]");
	private By size = By.xpath("//*[@id=\"group_1\"]");
	private By color = By.xpath("//*[@id=\"color_13\"]");
	private By addcart = By.xpath("//*[@id=\"add_to_cart\"]/button");
	private By proceed = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
	private By proceedtwo = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
	private By email = By.xpath("//*[@id=\"email\"]");
	private By password = By.xpath("//*[@id=\"SubmitLogin\"]");
	private By proceedcheckout = By.xpath("//*[@id=\"center_column\"]/form/p/button");
	private By terms = By.xpath("//*[@id=\"form\"]/div/p[2]/label");
	private By proceedthree = By.xpath("//*[@id=\"form\"]/p/button");
	private By payby = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p");
	private By myorder = By.xpath("//*[@id=\"cart_navigation\"]/button");
	private By boleto = By.xpath("//*[@id=\"center_column\"]/div");
	
	public void clickDresses() {
		driver.findElement(dresses).click();
	}
	
	public void clickPrinted() {
		driver.findElement(printed).click(); 
	}
	
	public void clickSummerDresses() {
		driver.findElement(summerdresses).click();
	}

	public void clickQuantity() {
		driver.findElement(quantity).click();
	}
	
	public void clickSize() {
		driver.findElement(size).click();
	}
	
	public void clickColor() {
		driver.findElement(color).click();
	}
	
	public void clickAddcart() {
		driver.findElement(addcart).click();
	}
	
	public void clickProceed() {
		driver.findElement(proceed).click();
	}
	
	public void ClickProceedTwo() {
		driver.findElement(proceedtwo).click();
	}
	
	public void setEmail(String Username) {
		driver.findElement(email).sendKeys("dossantos@leonardopereira.com");
	}
	
	public void setPassword(String passsword) {
		driver.findElement(password).sendKeys("teste");
	}
	
	public void clickProceedcheckout() {
		driver.findElement(proceedcheckout).click();
	}
	
	public void clickTerms() {
		driver.findElement(terms).click();
	}
	
	public void clickProceedthree() {
		driver.findElement(proceedthree).click();
	}
	
	public void clickPayby() {
		driver.findElement(payby).click();
	}
	
	public void clickMyorder() {
		driver.findElement(myorder).click();
	}
	
	public void clickBoleto() {
		driver.findElement(boleto).click();
	}
}




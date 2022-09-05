package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	public By Login = By.xpath("//a[@data-testid='loc-login']");
	public By naoSouCliente = By.xpath("//a[@class='nao-sou-cliente']");
	public By nome = By.xpath("//input[@formcontrolname='nome']");
	public By cpf = By.xpath("//input[@formcontrolname='documento']");
	public By m = By.xpath("//div[@class='mat-radio-container']//input[@id='mat-radio-3-input']");
	public By ddd = By.xpath("//input[@formcontrolname='ddd']");
	public By cel = By.xpath("//input[@formcontrolname='numero']");
	public By email = By.xpath("//input[@formcontrolname='email']");
	public By ddd1 = By.xpath("//input[@formcontrolname='confirmarDDD']");
	public By cel1 = By.xpath("//input[@formcontrolname='confirmarNumero']");
	public By email1 = By.xpath("//input[@formcontrolname='confirmarEmail']");
	public By senha = By.xpath("//input[@formcontrolname='senha']");
	public By senha1 = By.xpath("//input[@formcontrolname='confirmarSenha']");
	public By autorizo = By.xpath("//button[@class='send-email']/ds-icon");
	public By continuar = By.xpath("//button[@class='ds-button ds-button--primary ds-button--md']");

}

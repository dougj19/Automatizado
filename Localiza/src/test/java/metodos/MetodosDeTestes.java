package metodos;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MetodosDeTestes {
	

	WebDriver driver;

	public void abrirNavegador() {

		String url = "https://www.localiza.com/brasil/pt-br";
		String navegador = "Chrome";

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedrivers.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("*************** TESTE INICIADO***************");

	}

	public void clicarEmCampos() {

		driver.findElement(By.xpath("//a[@data-testid='loc-login']")).click();

	}

	public void clicarMasculino() {
		driver.findElement(By.xpath("//label[@for='mat-radio-11-input']")).click();

	}

	public void autorizo() {
		driver.findElement(By.xpath("//button[@class='send-email']/ds-icon")).click();
	}

	public void continuar() {
		driver.findElement(By.xpath("//button[@class='ds-button ds-button--primary ds-button--md']")).click();
	}

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicarPorTexto(String atributo, String texto) {
		driver.findElement(By.xpath("//" + atributo + "[text()='" + texto + "']")).click();
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");
	}

	public void pause(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void aguardarElemento(By elemento) {
		WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(elemento));
	}

	public void fecharNavegador() {
		driver.quit();
	}

	// public void submit(By elemento) {
	// driver.findElement(elemento).submit();
	// }
}

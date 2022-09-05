package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.ElementosWeb;
import metodos.MetodosDeTestes;

public class Localiza {

	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador();
	}

	@After
	public void fecharNavegador() throws Exception {
		// metodos.fecharNavegador();
	}

	@Test
	public void clicarLogin() {
		metodos.clicar(el.Login);
		metodos.clicar(el.naoSouCliente);
		metodos.preencher(el.nome, "Douglas Santos");
		metodos.scroll(0, 250);
		metodos.preencher(el.cpf, "111.257.750-50");
		metodos.preencher(el.ddd, "11");
		metodos.preencher(el.cel, "951583801");
		metodos.preencher(el.email, "doug@gmail.com");
		metodos.preencher(el.ddd1, "11");
		metodos.preencher(el.cel1, "951583801");
		metodos.preencher(el.email1, "doug@gmail.com");
		metodos.preencher(el.senha, "12345678");
		metodos.preencher(el.senha1, "12345678");
		metodos.preencher(el.m, " Masculino ");
		metodos.clicar(el.autorizo);
		metodos.clicar(el.continuar);
		metodos.pause(3000);
		//metodos.scroll(0, 350);
		//gitHub

		

	}

}

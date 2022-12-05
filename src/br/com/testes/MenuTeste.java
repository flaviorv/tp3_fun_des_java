package br.com.testes;
import br.com.tp2.Menu;

public class MenuTeste {
	public static void main(String[] args)   {
		
			try {
				Menu.invocarMenu();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}finally {
				System.out.println("Programa finalizado.");
			}
	}
}

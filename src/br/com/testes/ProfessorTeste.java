package br.com.testes;

import br.com.tp2.Professor;

public class ProfessorTeste {
	public static void main(String[] args) {
		Professor maria = new Professor();
		Professor alfredo = new Professor();
		Professor padrao = new Professor();
		
		maria.setNome("Maria Aparecida Carneiro");
		alfredo.setNome("Alfredo Gonçalves Barbosa");
		
		System.out.println("--método split no Set e classe StringBuilder no Get--");
		System.out.println(maria.getNome());
		System.out.println(alfredo.getNome());
		System.out.println(padrao.getNome());
	}
}

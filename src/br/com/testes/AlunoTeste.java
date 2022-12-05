package br.com.testes;
import br.com.tp2.Aluno;

public class AlunoTeste {

	public static void main(String[] args){
		Aluno flavio = new Aluno();
		Aluno joao = new Aluno();
		Aluno joana = new Aluno( );
		String[] alunos = new String[3];
		
		flavio.setNome("Flavio Rezende Varoto");
		joao.setNome("Joao Silverio Gomes");
		joana.setNome("Joana Costa Furtado");
		
		alunos[0] = flavio.getNome();
		alunos[1] = joao.getNome();
		alunos[2] = joana.getNome();
		
		System.out.println("--substring no método Set com StringBuilder no método Get-- \n");
		for(int a = 0; a < alunos.length; a++) {
			System.out.println(alunos[a]);
		}	
	}
}


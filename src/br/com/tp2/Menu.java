package br.com.tp2;

public class Menu {
	public static void invocarMenu() throws Exception {
		int opcao;	
		
		
		do{
			System.out.println("Digite [1] para: Registrar notas de um novo aluno");
			System.out.println("Digite [2] para: Consultar boletim de um aluno");
			System.out.println("Digite [3] para: Consultar notas da turma");
			System.out.println("Digite [4] para: Sair");
			opcao = Boletim.sc.nextInt();
			if(opcao == 1) {
				Boletim.registrarNotas();
			}else if(opcao == 2) {
				Boletim.consultarBoletim();
			}else if(opcao == 3) {
				Boletim.consultarNotasTurma();
			}
			
		}while(opcao != 4);
		Boletim.sc.close();
		System.out.println("Programa finalizado com sucesso.");			
	}
}

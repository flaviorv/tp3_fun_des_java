package br.com.tp2;

public class Professor {
	private String primeiroNome;
	private String segundoNome;
	private String terceiroNome;
	
	public Professor() {
		primeiroNome = "José";
		segundoNome = "Cláudio";
		terceiroNome = "Machado";
	}
	
	public void setNome(String nome) {
		String[] nomeArray = nome.split(" ");
		this.primeiroNome = nomeArray[0];
		this.segundoNome = nomeArray[1];
		this.terceiroNome = nomeArray[2];
	}
	
	public String getNome() {
		StringBuilder sb = new StringBuilder();
		sb.append("*");
		sb.append(primeiroNome);
		sb.append(" ");
		sb.append(segundoNome);
		sb.append(" ");
		sb.append(terceiroNome);
		sb.append(" ");
		
		return sb.toString();
	}
}

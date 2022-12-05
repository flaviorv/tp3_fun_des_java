package br.com.tp2;

public class Aluno {
	private float avaliacao1;
	private float avaliacao2;
	private String primeiroNome;
	private String segundoNome;
	private String terceiroNome;
	
	
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
	
	public void setNome(String nome) {
		primeiroNome = nome.substring(0, nome.indexOf(" "));
		segundoNome = nome.substring(nome.indexOf(" "), nome.lastIndexOf(" ")).trim();
		terceiroNome = nome.substring(nome.lastIndexOf(" ")).trim();
	}
	
	public float getAvaliacao1() {
		return avaliacao1;
	}
	
	public float getAvaliacao2() {
		return avaliacao2;
	}
	
	public void setAvaliacao1(float avaliacao1) {
		this.avaliacao1 =  avaliacao1;
	}
	public void setAvaliacao2(float avaliacao2) {
		this.avaliacao2 =  avaliacao2;
	}
	
}

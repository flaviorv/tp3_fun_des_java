package br.com.exceptions;

public class LimiteUltrapassadoException extends Exception {

	private static final long serialVersionUID = 1L;

	public LimiteUltrapassadoException(String mensagem) {
		super(mensagem);
	}
}

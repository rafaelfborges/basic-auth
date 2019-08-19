package br.com.rafaelfborges.auth;

public class Usuario {
	private String usuario;
	private String senha;
	private int numTentativas;
	
	public Usuario(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
		this.numTentativas = 5;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}

	public int getNumTentativas() {
		return numTentativas;
	}
	
	public void setNumTentativas() {
		this.numTentativas--;
	}
}

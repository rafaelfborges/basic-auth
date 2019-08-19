package br.com.rafaelfborges.auth;

public class Usuario {
	private String usuario;
	private String senha;
	
	public Usuario(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}
}

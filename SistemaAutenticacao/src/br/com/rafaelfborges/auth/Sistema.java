package br.com.rafaelfborges.auth;
import java.util.ArrayList;

public class Sistema {
	private ArrayList<Usuario> usuarios;
	
	public Sistema() {
		usuarios = new ArrayList<Usuario>();
	}
	
	public void cadastrarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public void autenticaUsuario(String usuario, String senha) {		
		for(Usuario temp : usuarios) {
			if(temp.getUsuario().equals(usuario) && temp.getSenha().equals(senha)) {
				System.out.println("Bem vindo, " + temp.getUsuario() + ".");
			} else {
				System.out.println("Login ou senha incorreto, tente novamente mais tarde.");
			}
		}
	}
}

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
	
	public boolean autenticarUsuario(String usuario, String senha) {
		Usuario temp = null;
		for(Usuario u : usuarios) {
			if(u.getUsuario().equals(usuario)) {
				temp = u;
				break;
			}
		}
		if(temp != null) {
			if(temp.getNumTentativas() > 0) {
				if(temp.getSenha().equals(senha)) {
					System.out.println("Sucesso, redirecionando...");
					return true;
				} else {
					System.out.println("Usuário ou senha inválida!");
					temp.setNumTentativas();
				}
			} else {
				System.out.println("Usuário bloqueado, contate o administrador!");
				return true;
			}
		} else {
			System.out.println("Usuário ou senha inválida!");
		}
		return false;
	}
}

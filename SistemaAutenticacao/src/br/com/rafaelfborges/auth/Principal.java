/**
 * 
 */
package br.com.rafaelfborges.auth;

/**
 * @author Rafael Fernando Borges
 * Exercício disciplina Segurança da Informação.
 */
public class Principal {

	public static void main(String[] args) {
		String usuario, senha;
		
		Sistema sistema = new Sistema();
		Usuario usuario1 = new Usuario("rafael", "12345");
		sistema.cadastrarUsuario(usuario1);
		
		usuario = "rafael";
		senha = "12345";
		
		sistema.autenticaUsuario(usuario, senha);
	}
}

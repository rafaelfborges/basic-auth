/**
 * 
 */
package br.com.rafaelfborges.auth;
import java.util.Scanner;

/**
 * @author Rafael Fernando Borges
 * Execício disciplina Segurança da Informação.
 */
public class Principal {

	private static Scanner sc;

	public static void main(String[] args) {
		boolean menu = false;
		String usuario, senha;
		
		Sistema sistema = new Sistema();
		Usuario usuario1 = new Usuario("rafael", "12345");
		Usuario usuario2 = new Usuario("fernando", "54321");
		Usuario usuario3 = new Usuario("borges", "09876");
		
		sistema.cadastrarUsuario(usuario1);
		sistema.cadastrarUsuario(usuario2);
		sistema.cadastrarUsuario(usuario3);
		
		sc = new Scanner(System.in);
		
		while(menu == false) {
			System.out.print("Digite o usuário: ");
			usuario = sc.nextLine();
			
			System.out.print("Digite a senha: ");
			senha = sc.nextLine();
			
			menu = sistema.autenticarUsuario(usuario, senha);
		}
	}
}

package questao2;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		var usuario = new Usuario();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Nome: ");
		usuario.setNome(scn.nextLine());
		System.out.print("Senha: ");
		usuario.setSenha(scn.nextLine());	
		
		
		scn.close();

	}

}

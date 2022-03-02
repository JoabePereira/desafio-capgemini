package questao1;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite o valor de n: ");
		int n = scn.nextInt();
		
		imprime(n);
		
		scn.close();	
		
	}
	
	public static void imprime(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = (n - i); j >= 1; j--) {
				System.out.print(" ");
			}
			for (int x = 1; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

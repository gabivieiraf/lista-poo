package ex6;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
	private int numero;
	
	public int sortear() {
		Random r = new Random();
		numero = r.nextInt(100);
		System.out.println("Numero sorteado.");
		return numero;
		
	}
	
	public void adivinhar() {
		int entrada;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um numero inteiro de 0 a 99: ");
		entrada = s.nextInt();
		do {
			if (entrada < 0 || entrada > 99) {
				System.out.println("Numero invalido. Digite um numero entre 0 e 99.");
				entrada = s.nextInt();
			}
			else if (numero > entrada) {
				System.out.println("Errou! Digite um numero maior que " + entrada + ":");
				entrada = s.nextInt();
			}
			else if (numero < entrada) {
			System.out.println("Errou! Digite um numero menor que " + entrada + ":");
			entrada = s.nextInt();
		}
		}
		while (numero != entrada);
			System.out.println("Parabéns! Voce acertou o numero.");
			System.out.println("O numero sorteado foi: " + numero);
			s.close();

	}
	
}

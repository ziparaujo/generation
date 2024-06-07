package lacoscondicionais;

import java.util.Scanner;

public class Lista01Ex02 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int numero;
		String positivoOuNegativo, parOuImpar;
		
		System.out.println("Digite um número inteiro: ");
		numero = read.nextInt();
		
		if(numero > 0) {
			positivoOuNegativo = "positivo.";
		} else if(numero < 0) {
			positivoOuNegativo = "negativo.";
		} else {
			positivoOuNegativo = "zero.";
		}
		
		if(numero % 2 == 0) {
			parOuImpar = "par";
		} else {
			parOuImpar = "ímpar";
		}
		
		System.out.println("O número " + numero + " é " + parOuImpar + " e " + positivoOuNegativo);
		
		read.close();
	}
}

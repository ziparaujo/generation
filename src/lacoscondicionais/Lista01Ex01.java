package lacoscondicionais;

import java.util.Scanner;

public class Lista01Ex01 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int A, B, C, soma;
		
		System.out.println("Digite o número A: ");
		A = read.nextInt();
		System.out.println("Digite o número B: ");
		B = read.nextInt();
		System.out.println("Digite o número C: ");
		C = read.nextInt();
		
		soma = A + B;
		
		if(soma > C) {
			System.out.println("A soma de A + B (" + A + " + " + B + " = " + soma + ") é maior que C (" + C + ")");
		} else if(soma < C) {
			System.out.println("A soma de A + B (" + A + " + " + B + " = " + soma + ") é menor que C (" + C + ")");
		} else {
			System.out.println("A soma de A + B (" + A + " + " + B + " = " + soma + ") é igual à C (" + C + ")");
		}
		
		read.close();
	}
}

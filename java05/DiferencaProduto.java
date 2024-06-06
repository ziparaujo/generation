package projeto.java05;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Número 1: ");
		n1 = read.nextFloat();
		System.out.println("Número 2: ");
		n2 = read.nextFloat();
		System.out.println("Número 3: ");
		n3 = read.nextFloat();
		System.out.println("Número 4: ");
		n4 = read.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		System.out.println("Diferença: " + diferenca);
		read.close();
	}

}

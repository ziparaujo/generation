package java05;

import java.util.Scanner;

public class AbonoSalario {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite o seu salário: ");
		salario = read.nextFloat();
		System.out.println("Digite o abono: ");
		abono = read.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Seu novo salário é: R$" + novoSalario);
		read.close();
	}

}
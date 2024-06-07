package java05;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite o salário bruto: ");
		salarioBruto = read.nextFloat();
		System.out.println("Digite o adicional noturno: ");
		adicionalNoturno = read.nextFloat();
		System.out.println("Digite as horas extras: ");
		horasExtras = read.nextFloat();
		System.out.println("Digite os descontos: ");
		descontos = read.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		System.out.printf("Salário líquido: %.2f", salarioLiquido);		
		read.close();
	}

}

package projeto.lacoscondicionais;

import java.util.Scanner;

public class Lista02Ex06 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String nome;
		String cargo = null;
		int codigoCargo;
		float salario;
		double novoSalario = 0;
		
		System.out.println("Digite seu nome: ");
		nome = read.nextLine();
		System.out.println("Código do cargo: ");
		codigoCargo = read.nextInt();
		System.out.println("Salário: ");
		salario = read.nextFloat();
		
		switch (codigoCargo) {
		case 1: {
			novoSalario = salario + (salario * 0.1);
			cargo = "Gerente";
			break;
		}
		case 2: {
			novoSalario = salario + (salario * 0.07);
			cargo = "Vendedor";
			break;
		}		
		case 3: {
			novoSalario = salario + (salario * 0.09);
			cargo = "Supervisor";
			break;
		}
		case 4: {
			novoSalario = salario + (salario * 0.06);
			cargo = "Motorista";
			break;
		}
		case 5: {
			novoSalario = salario + (salario * 0.05);
			cargo = "Estoquista";
			break;
		}
		case 6: {
			novoSalario = salario + (salario * 0.08);
			cargo = "Técnico de TI";
			break;
		}
		default:
			System.out.println("Código do cargo inválido.");
		}
		
		if(cargo != null) {			
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: " + cargo);
			System.out.println("Salário: R$" + novoSalario);
		}

		read.close();
		
	}
}

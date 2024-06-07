package lacoscondicionais;

import java.util.Scanner;

public class Lista01Ex03 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String nome, aptoOuNao;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Informações");
		System.out.println("Nome: ");
		nome = read.nextLine(); 	
		System.out.println("Idade: ");
		idade = read.nextInt();
		System.out.println("Primeira doação? (true or false)");
		primeiraDoacao = read.nextBoolean();
		
		aptoOuNao = " não está apto";
		if(idade >= 18 && idade <= 69) {
			if(idade > 60) {
				if(!primeiraDoacao) {
					aptoOuNao = " está apto";
				}
			} else {
				aptoOuNao = " está apto";				
			}
		}
		
		System.out.println(nome + aptoOuNao + " para doar sangue.");
		
		read.close();
	}
}

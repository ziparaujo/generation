package projeto.lacosrepeticao;

import java.util.Scanner;

public class Lista02Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String resposta = "s";
		int totalBackend = 0, totalMulherCisTransFront = 0, totalHomemCisTransMobileMaior40 = 0;
		int totalNaoBinariosFullStackMenor30 = 0, totalPessoas = 0, somaIdade = 0;
		int idade, identidadeGenero, pessoaDev;
		double mediaIdade;
		
		while(resposta.equals("s")) {
			System.out.printf("\nIdade: ");
			idade = sc.nextInt();
			System.out.printf("Identidade de gênero: ");
			identidadeGenero = sc.nextInt();			
			System.out.printf("Pessoa desenvolvedora: ");
			pessoaDev = sc.nextInt();
			
			totalPessoas ++;
			somaIdade += idade;
			
			if(pessoaDev == 1) {
				totalBackend++;
			} else if((identidadeGenero == 1 || identidadeGenero == 4) && pessoaDev == 2) {
				totalMulherCisTransFront++;
			} else if((identidadeGenero == 2 || identidadeGenero == 5) && pessoaDev == 3 && idade > 40) {
				totalHomemCisTransMobileMaior40++;
			} else if(identidadeGenero == 3 && pessoaDev == 4 && idade < 30) {
				totalNaoBinariosFullStackMenor30++;
			}
			
			System.out.println("\nDeseja continuar? (S/N)");
			resposta = sc.next().toLowerCase();
			
			sc.nextLine();
		}
		
		mediaIdade = somaIdade / totalPessoas;
		
		System.out.printf("\nTotal de pessoas desenvolvedoras backend: %d", totalBackend);
		System.out.printf("\nTotal de mulheres cis e trans desenvolvedoras frontend: %d", totalMulherCisTransFront);
		System.out.printf("\nTotal de homens cis e trans desenvolvedores mobile maiores de 40 anos: %d", totalHomemCisTransMobileMaior40);
		System.out.printf("\nTotal de pessoas não binárias desenvolvedoras fullstack menores que 30 anos: %d", totalNaoBinariosFullStackMenor30);
		System.out.printf("\nO número total de pessoas que responderam a pesquisa: %d", totalPessoas);
		System.out.printf("\nA média de idade das pessoas que responderam à pesquisa: %.2f", mediaIdade);
		
		sc.close();
	}
}

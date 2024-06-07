package lacosrepeticao;

import java.util.Scanner;

public class Lista02Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalMenor = 0, totalMaior = 0;
		
		while(true) {
			System.out.printf("Digite uma idade: ");
			int idade = sc.nextInt();
			
			if(idade < 0) break;
			
			if(idade < 21) totalMenor++;
	        if(idade > 50) totalMaior++;
		}
		
		System.out.printf("\nTotal de pessoas menores de 21 anos: %d \nTotal de pessoas maiores de 50 anos: %d", totalMenor, totalMaior);
		
		sc.close();
	}
}

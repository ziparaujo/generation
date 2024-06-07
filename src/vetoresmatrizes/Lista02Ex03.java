package vetoresmatrizes;

import java.util.Scanner;

public class Lista02Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int linha = 3, coluna = 3;
		int[][] matriz = new int[linha][coluna];
		int somaPrincipal = 0, somaSecundaria = 0;
		
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				System.out.printf("Digite o número da %dº linha e %dº coluna: ", i + 1, j + 1);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nElementos da diagonal principal: ");
		for(int i = 0; i < linha; i++) {
			System.out.printf("%d ", matriz[i][i]);
			somaPrincipal += matriz[i][i];
		}
		
		System.out.println("\nElementos da diagonal secundária: ");
		for(int i = 0; i < linha; i++) {
			System.out.printf("%d ", matriz[i][2 - i]);
			somaSecundaria += matriz[i][2 - i];
		}
		
		System.out.printf("\nSoma dos elementos da diagonal principal: %d", somaPrincipal);
		System.out.printf("\nSoma dos elementos da diagonal secundária: %d", somaSecundaria);
	
		
		sc.close();
	}

}

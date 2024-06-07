package vetoresmatrizes;

import java.util.Scanner;

public class Lista01Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		boolean encontrei = false;
		int posicao = 0;
		
		System.out.printf("Digite o número que você deseja encontrar: ");
		numero = sc.nextInt();
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] == numero) {
				posicao = i;
				encontrei = true;
				break;
			}
		}
		
		if(encontrei) {
			System.out.printf("\nO número %d está localizado na posição: %d", numero, posicao);			
		} else {
			System.out.printf("\nO número %d não foi encontrado!", numero);
		}

		sc.close();
	}
}

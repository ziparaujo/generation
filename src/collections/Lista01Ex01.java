package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista01Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		String cor;
		ArrayList<String> listaCores = new ArrayList<>();
		
		while(i < 5) {
			System.out.printf("Digite uma cor: ");
			cor = sc.nextLine();
			
			listaCores.add(cor);
			i++;
		}
		
		System.out.println("\nTodas as cores:");
		for(String c: listaCores) {
			System.out.println(c);
		}
		
		Collections.sort(listaCores);
		
		System.out.println("\nCores ordenadas:");
		for(String c: listaCores) {
			System.out.println(c);
		}
		
		
		sc.close();
	}
}

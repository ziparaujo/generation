package projeto.java05;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculaMedia {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		float n1, n2, n3, n4, media;
		
		System.out.println("Digite a 1ª nota: ");
		n1 = read.nextFloat();
		System.out.println("Digite a 2ª nota: ");
		n2 = read.nextFloat();
		System.out.println("Digite a 3ª nota: ");
		n3 = read.nextFloat();
		System.out.println("Digite a 4ª nota: ");
		n4 = read.nextFloat();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("Média: " + df.format(media));
		read.close();
	}

}

package java_do_while;

import java.util.Locale;
import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resposta;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n", f);
			System.out.print("Deseja repetir (s/n)?: "); 
			resposta = sc.next().charAt(0);
		} while (resposta != 'n');
		
		
		sc.close();
	}
}

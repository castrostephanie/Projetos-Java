package java3_exercicios;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int x = -10;
		int y = 8;
		int z = 0;
		
		System.out.println("Digite o primeiro numero: ");
		x = sc.nextInt();
		
		if (x == -10){
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
			
		System.out.println("DIGITE O SEGUNDO NUMERO: ");
		y = sc.nextInt();
		
		if (y == 8){
			System.out.println("NÃO NEGATIVO: ");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		System.out.println("DIGITE O TERCEIRO NUMERO: ");
		z = sc.nextInt();
		
		if (z == 0) {
			System.out.println("NÃO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
	
		sc.close();
	}
}

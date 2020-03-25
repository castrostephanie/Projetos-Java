package java3_exercicio2;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1;
		double nota2;
		
		System.out.println("BEM VINDO AO SISTEMA DE NOTAS DA UNIVERSIDADE STEZÃO!!!!");
		
		System.out.println("INFORME SUA 1° NOTA: ");
		nota1 = sc.nextDouble();
		
		System.out.println("INFORME SUA 2° NOTA: ");
		nota2 = sc.nextDouble();
		
		double mediaFinal = nota1 + nota2;
		System.out.printf("SUA MÉDIA FINAL É: %.1f%n ", mediaFinal);
		
		if (mediaFinal > 60){
				System.out.println("APROVADO!!!!");
		}
		else {
			System.out.println("REPROVADO - ESTUDE MAIS!!!!");
		}
		
		sc.close();
	}
}

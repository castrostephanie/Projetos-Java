package java2_exercicios;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		
		//leitura / entrada de dados 
		Scanner sc = new Scanner(System.in);  
		
		//declarando variavel do tipo decimal
		int entrada1, entrada2;
		
		//processamento de dados
		entrada1 = sc.nextInt();
		entrada2 = sc.nextInt();
		
		//imprimindo os dados
		System.out.println("Você digitou: ");
		System.out.println(entrada1);
		System.out.println(entrada2);
		
		//soma das variaveis 
		int soma = entrada1 + entrada2;
		
		//Concatenar 
		System.out.println("SOMA: " + soma); 
		
		//fechar a entrada de dados
		sc.close();
	}
}

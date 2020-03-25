package java4_curso;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String dia;
		
		System.out.println("DIGITE UM NUMERO CORRESPONDENTE A UM DIA DA SEMANA: ");
		x = sc.nextInt();
		
		//estrutura switch-case
		switch (x) {
		case 1:
			dia = "DOMINGO";
			break;
		case 2:
			dia = "SEGUNDA-FEIRA";
			break;
		case 3: 
			dia = "TERÇA-FEIRA";
			break;
		case 4: 
			dia = "QUARTA-FEIRA";
			break;
		case 5:
			dia = "QUINTA-FEIRA";
			break;
		case 6:
			dia = "SEXTA-FEIRA";
			break;
		case 7:
			dia = "SABADO";
			break;
		default:
			dia = "VALOR INVALIDO";
			break;
		}
		
		System.out.println("O DIA DA SEMANA É: " + dia);
		
		sc.close();
	}
}

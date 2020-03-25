import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		
		//definindo variavel tipo texto
		String product1 = "Computer";
		String product2 = "Office desk";
		
		//definindo variavel tipo inteiro
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		//definindo variavel tipo decimal
		double price1 = 2100.0;
		double price2 = 658.58;
		double measure = 53.234567;
		
		//imprimindo valores definindo quantidade de casas decimais 
		System.out.println("Products:");
		
		System.out.printf("%s, witch price is $ %.2f %n", product1, price1);
		
		System.out.printf("%s, witch price is $ %.2f %n%n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: F %n%n", age, code, gender);
		
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		
		System.out.printf("Rounded tree decimal places: %.3f%n", measure);
		
		//mudando a localidade para USA
		Locale.setDefault(Locale.US);
		
		System.out.printf("US decimal point: %.3f%n", measure);
			
	}

}
	


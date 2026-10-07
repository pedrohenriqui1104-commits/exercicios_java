import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double altura, pesoIdeal;
		char sexo;

		System.out.println("Informe a sua altura: ");
		altura = sc.nextDouble();
		System.out.println("Informe o seu sexo (F) ou (M): ");
		sexo = sc.next().toUpperCase().charAt(0);
		
		pesoIdeal = 0;

		if (sexo == 'M') {
			pesoIdeal = (72.7 * altura) - 58;
			System.out.printf("O seu peso ideal é: %.2f kg\n", pesoIdeal);
		} else if (sexo == 'F') {
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.printf("O seu peso ideal é: %.2f kg\n", pesoIdeal);
		} else {
			System.out.println("Sexo inválido. Por favor, reinicie e digite 'M' ou 'F'.");
		}

		sc.close();

	}

}

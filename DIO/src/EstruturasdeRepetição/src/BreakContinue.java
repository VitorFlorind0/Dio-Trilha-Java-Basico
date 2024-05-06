
public class BreakContinue {

	public static void main(String[] args) {
		for (int numero = 1; numero <= 5; numero++) {
			if (numero == 3)
				break;// break interrompe a operação ao chegar na determinação
			System.out.println(numero);
		}

		System.out.println("---------------------------------");

		for (int numero = 1; numero <= 5; numero++) {
			if (numero == 3)
				continue;// continue continua a operação apos chegar a determinação
			System.out.println(numero);
		}
	}

}

package analizandoCandidatos;

import java.util.Locale;
import java.util.Scanner;

public class CandidatosSugerindoDeSalario {

	public static void main(String[] args) {
		System.out.println("PROCESSO SELETIVO");

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Nome do Candidato: ");
		String candidato = scanner.next();

		System.out.println("Sugestão de salario do candidato: ");
		double salario = scanner.nextDouble();

		if (salario <= 2500.0) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}

		else if (salario > 2500.0 && salario < 5000.0) {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		} else if (salario >= 5000.0) {
			System.out.println("PROPOSTA MUITO ALTA, CANDIDATO REPROVADO");
		}

	}

}

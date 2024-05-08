package analizandoCandidatos;

import java.util.concurrent.ThreadLocalRandom;

public class AvaliandoCandidatosAleatoriamente {

	public static void main(String[] args) {
		String[] candidatos = { "CARLOS", "MARTA", "ANA", "JOÃO", "JAILSON" };

		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O CANDIDATO(a) " + candidato + " SOLICITOU ESTE VALOR DE SALARIO " + salarioPretendido);

			if (salarioBase >= salarioPretendido) {
				System.out.println("O CANDIDATO(a) " + candidato + " FOI SELECIONADO PARA A VAGA");
				candidatosSelecionados++;
			} else if (salarioBase < salarioPretendido) {
				System.out.println("O CANDIDATO(a) " + candidato + " NAO FOI SELECIONADO");
			}
			candidatoAtual++;
			if (candidatoAtual >= candidatos.length) {
				candidatoAtual = 0;
			}
		}
	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
}

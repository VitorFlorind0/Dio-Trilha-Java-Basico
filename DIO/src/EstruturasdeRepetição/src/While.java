import java.util.concurrent.ThreadLocalRandom;

public class While {

	public static void main(String[] args) {
		// while sempre valida uma condição e se acabar sendo falsa ele nao executa
		// nenhuma das operaçõs
		double mesada = 50.0;
		while (mesada > 0) {
			double valorDoce = valorAleatorio();
			if (valorDoce > mesada)
				valorDoce = mesada;

			System.out.println("doce do valor: " + valorDoce + " Adicionado no carrinho");
			mesada = mesada - valorDoce;

		}
		System.out.println("Mesada: " + mesada);
		System.out.println("Joao gastou toda a sua mesada em doces");

	}

	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2, 8);
	}
}

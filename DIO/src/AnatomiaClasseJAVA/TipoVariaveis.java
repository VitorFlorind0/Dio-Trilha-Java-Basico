package AnatomiaClasseJAVA;

public class TipoVariaveis {

	double salarioMinimo = 2500.33; // numeros quebrados
	byte idade = 123; // byte numeros de ate 3 digitos
	short ano = 1234; // short numeros de 4 digitos
	int cep = 12345678; // int ate 8 numeros
	long cpf = 123456789100L; // numeros longos deve ser informado com L no final
	float pi = 3.14F; // numeros quebrados como pi deve ser informado com F

	// Exemplo

	public static void main(String[] args) {

		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		int numero = 6;

		numero = 12;
		System.out.println(numero);

		// Comando Final deixa a variavel como uma constanste, a variavel sendo escrita
		// em CAIXA ALTA
		final double VALOR_DE_PI = 3.14;

		System.out.println(VALOR_DE_PI);

	}
}

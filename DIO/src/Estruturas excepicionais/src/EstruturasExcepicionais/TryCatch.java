//Sobre Exceções na base do codigo
package EstruturasExcepicionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
			try {
Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

System.out.println("Digite seu nome");
String nome = scanner.next();

System.out.println("Digite seu sobrenome");
String sobrenome = scanner.next();

System.out.println("Digite sua idade");
int idade = scanner.nextInt();

System.out.println("digite sua altura");
double altura = scanner.nextDouble();

//imprimindo os dados obtidos pelo usuario
System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
System.out.println("Tenho " + idade + "anos");
System.out.println("Minha altura é " + altura + "cm ");
		
scanner.close();
			
			}
			catch (InputMismatchException e) {
				System.out.println("Os campos idade e altura precisam ser numericos");
			}
			
	

}

}

/*
 * nullpointerException - quando tentamos obter alguma informação de uma
 * variavel nula ArithmeticExcerption - quando tetamos dividir um valor por zero
 * SQLExcepion - quando exista algum erro relacionado com a interação com o
 * banco de dados FileNotFoundException - quando tentamos ler um arquivo que nao
 * existe
 */

//Try -  permite que voce defina um bloco de codigos para se testado quanto a erros enquanto esta sendo executado.
//catch - permite definir um bloco de codigo a ser executado caso o corra um erro no bloco try.
//finally - permite definir um bloco de codigos a ser executado independente se ocorrer um erro ou nao.
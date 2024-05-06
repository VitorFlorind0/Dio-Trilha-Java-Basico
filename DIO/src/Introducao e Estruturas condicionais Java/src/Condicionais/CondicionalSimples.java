package Condicionais;

public class CondicionalSimples {

	public static void main(String[] args) {
		double saldo = 25.0;
		double valorSolicitado = 15.0;
		
//if é um comando para implementar uma determinada condição.
		
		if (valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
			System.out.println("Saldo restante: " + saldo + " R$");
		}
/**Else é um comando de complemento condicional, if(se) implementa uma condição,
 * else(se não) implementa uma condição caso "if" nao for atendido.
 */
		else

			System.out.println("saldo insuficiente");
	}

}

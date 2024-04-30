package Operacoes;

public class OperacaoDeIncrementoDeNumero {
public static void main(String[] args) {
	
	int numero = 5;
	System.out.println(numero);
	
	numero ++;
	//numero ++ = numero = 5 + 1;
	System.out.println(numero);
	
	System.out.println(++ numero);
	
	numero --;
	//numero -- = numero -1 
	System.out.println(numero);
	
	System.out.println(-- numero);
	//--------------------------------------------------
	System.out.println("VARIAVEIS BOOLEANA");
//VARIAVEL BOOLEANA (! inverte a operação);
	
	boolean variavel = true;
	
	variavel = !variavel;
	//!variavel = variavel true -> false
	System.out.println(variavel);
	
	variavel = !variavel;
	//!variavel = variavel true -> false -> true
	System.out.println(variavel);
}
}


// Incrementação / Decrementação
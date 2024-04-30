package Operacoes;

public class Operadores {
public static void main(String[] args) {
	boolean condicao1=true;
	boolean condicao2=false;
	
	if (condicao1 || condicao2) {
		System.out.println("as duas condições sao diferentes");
		
	}
	if(condicao1 = condicao2) {
		//por nao serem verdadeiras a mensagem da condição nao é efetuada
		System.out.println("as duas condições sao verdadeiras");
	} 
	
	
	System.out.println("fim");
}
}

// (||) diferença de condições
//Operadores Logicos
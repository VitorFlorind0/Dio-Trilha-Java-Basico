package EstruturasExcepicionais;

import java.text.NumberFormat;
import java.text.ParseException;

public class HerarquiaDasExcecoes {
//Exemplos de exceção
public static void main(String[] args) {
	
	Number valor;
	try {
		valor = NumberFormat.getInstance().parse("a1.75");
		System.out.println(valor);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
}

}

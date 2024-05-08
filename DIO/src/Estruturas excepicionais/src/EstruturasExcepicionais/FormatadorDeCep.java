package EstruturasExcepicionais;

public class FormatadorDeCep {

	public static void main(String[] args) {
		try {
			
		String cepFormatado = formatarCep("23765064");
		System.out.println(cepFormatado);
		} catch (CepInvalidoException e) {
		System.out.println("o cep nao corresponde com as regras de negocio");
			e.printStackTrace();
		}
	}
	
	static String formatarCep(String cep) throws CepInvalidoException
	{
	if (cep.length() != 8)
		throw new CepInvalidoException();
	
	return "23.765-064";
		
		
	}

}

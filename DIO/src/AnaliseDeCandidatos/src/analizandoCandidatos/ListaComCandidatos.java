package analizandoCandidatos;

public class ListaComCandidatos {

	public static void main(String[] args) {
		String[] candidatos = { "CARLOS", "MARTA", "ANA", "JOÃO", "JAILSON" };
	System.out.println("IMPRIMENDO A LISTA DE CANDIDATOS INFORMANDO O INDICE DO ELEMENTO");
	for(int indice = 0; indice < candidatos.length; indice++) {
		
		System.out.println("O CANDIDADEO DE N° "+ (indice+1) + " É " + candidatos[indice]);
	}
	
	
	System.out.println("--------- FORMA ABREVIADA DE INTERAÇÃO FOR EACH --------------");
	
	for(String candidato : candidatos) {
		System.out.println("CANDIDATO SELECIONADO FOI " + candidato);
	}
	}

}

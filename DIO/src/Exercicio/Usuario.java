package Exercicio;

public class Usuario {
	public static void main(String[] args) throws Exception {

		SmartTv smartTv = new SmartTv();

		System.out.println("TV Ligada ? " + smartTv.ligada);
		System.out.println("Canal Atual ? " + smartTv.canal);
		System.out.println("Qual o Volume ? " + smartTv.volume);
		// -------------------------------------------------------
		//                     LIGAR TV
		smartTv.ligar();
		System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);

		smartTv.desligar();
		System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);
		// -------------------------------------------------------
		//                     VOLUME
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		System.out.println(smartTv.volume);
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		System.out.println(smartTv.volume);
		//--------------------------------------------------------
		//                     MUDAR DE CANAL
		System.out.println("canal atual : " + smartTv.canal);
		
		smartTv.mudarCanal(13);

		System.out.println("Canal Atual : " + smartTv.canal);
	}

}

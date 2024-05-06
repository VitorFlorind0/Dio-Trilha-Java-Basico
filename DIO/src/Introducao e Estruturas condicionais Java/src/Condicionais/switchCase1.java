package Condicionais;

public class switchCase1 {

	public static void main(String[] args) {
		String plano = "B";

		switch (plano) {
		case "T": {
			System.out.println("5Gb youtuba");
			break;
		}
		case "M": {
			System.out.println("Whats e Instagram gratis");
			break;
		}
		case "B": {
			System.out.println("100 minutos de ligação + Whats e instagram Gratis");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
	}
}

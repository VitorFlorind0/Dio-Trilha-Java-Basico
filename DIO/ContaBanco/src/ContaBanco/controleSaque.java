package ContaBanco;

import java.util.Scanner;

public class controleSaque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        int quantidadeDeSaques = 3; 

        for (int i = 0; i < quantidadeDeSaques; i++) {
            System.out.print("Informe o valor do saque: ");
            double valorSaque = scanner.nextDouble();

            if (valorSaque <= limiteDiario) {
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            } else {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break; // Encerra o loop após atingir o limite
            }
        }

        System.out.println("Transações encerradas.");
        scanner.close();
    }
}

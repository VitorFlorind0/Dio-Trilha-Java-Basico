package analizandoCandidatos;

public class EntrandoEmContatoComCandidato {

    public static void main(String[] args) {
        String[] candidatos = { "CARLOS", "MARTA", "ANA", "JOÃO", "JAILSON" };
        int tentativasRealizadas = 0; // Iniciamos em 0
        boolean continuarTentando = true;
        boolean atendeu = false;
        for (String candidato : candidatos) {
            tentativasRealizadas = 0; // Zeramos o contador para cada candidato
            continuarTentando = true; // Reiniciamos a flag de continuar tentando
            do {
                atendeu = atender();
                continuarTentando = !atendeu && tentativasRealizadas < 3;
                if (continuarTentando)
                    tentativasRealizadas++;
                else
                    System.out.println("CONTATO REALIZADO COM SUCESSO com " + candidato + " NA " + tentativasRealizadas);
            } while (continuarTentando);
        }
        if (!atendeu)
            System.out.println("NÃO CONSEGUIMOS CONTATO COM NENHUM DOS CANDIDATOS, NÚMERO MÁXIMO DE TENTATIVAS REALIZADO");
    }

    static boolean atender() {
        // Aqui você pode implementar a lógica de atendimento, por exemplo, retornar true
        // se o candidato atender e false caso contrário.
        return false; // Por enquanto, sempre retorna false para testar o loop.
    }
}
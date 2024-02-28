public class Ex3 {
    public static boolean Ordenado(int[] vetor) {
        boolean crescente = true;
        boolean decrescente = true;

        // Verifica se o vetor está em ordem crescente
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < vetor[i - 1]) {
                crescente = false;
                break;
            }
        }

        // Verifica se o vetor está em ordem decrescente
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[i - 1]) {
                decrescente = false;
                break;
            }
        }

        // Retorna true se estiver em ordem crescente ou decrescente
        return crescente || decrescente;
    }

    public static void main(String[] args) {
        // Testando a função com os casos de exemplo
        int[] vetor1 = {1, 2, 3};
        System.out.println("Caso 1:");
        System.out.println("Vetor: [1, 2, 3]");
        System.out.println("Resultado: " + Ordenado(vetor1));

        int[] vetor2 = {3, 2, 1};
        System.out.println("\nCaso 2:");
        System.out.println("Vetor: [3, 2, 1]");
        System.out.println("Resultado: " + Ordenado(vetor2));

        int[] vetor3 = {1, 2, 3, 7, 2};
        System.out.println("\nCaso 3:");
        System.out.println("Vetor: [1, 2, 3, 7, 2]");
        System.out.println("Resultado: " + Ordenado(vetor3));
    }
}

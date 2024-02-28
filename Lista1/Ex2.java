public class Ex2 {

    public static boolean Comparar(int[] vetor1, int[] vetor2) {
        // Verificar se os vetores têm o mesmo comprimento
        if (vetor1.length != vetor2.length) {
            return false;
        }
        
        // Verificar se os elementos são os mesmos e estão na mesma ordem
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] != vetor2[i]) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        // Testando a função
        System.out.println("Caso 1:");
        int[] vetor1 = {1, 2, 3};
        int[] vetor2 = {1, 2, 3};
        System.out.println("Resultado: " + Comparar(vetor1, vetor2));

        System.out.println("Caso 2:");
        int[] vetor3 = {1, 2};
        int[] vetor4 = {1, 2, 3};
        System.out.println("Resultado: " + Comparar(vetor3, vetor4));

        System.out.println("Caso 3:");
        int[] vetor5 = {3, 2, 1};
        int[] vetor6 = {1, 2, 3};
        System.out.println("Resultado: " + Comparar(vetor5, vetor6));
    }
}

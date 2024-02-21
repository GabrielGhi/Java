public class Vetores {
    public static void main(String[] args) {
        int[] vet = new int[] {
            10, 50, 30, 2, -1, -30, 50
        };

        int maior = vet[0];
        for(int i = 0;i < vet.length; ++i){
            if (vet[i] > maior) {
                maior = vet[i];
            }
            System.out.println(maior);
        }

        for (int i = 0; i < vet.length; ++i) { //passa para a prox casa
            System.out.println(vet[i]); //Dentro de colchetes determina qual numero mostrara
        }
    }
}
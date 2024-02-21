//Criar uma funcao que recebe como parametro um vetor e imprima todos os elementos
public class Desafio1 {
    public static void main(String[] args) {
        int[] vet = {10, 20, 30, 40};
        
        imprimir(vet);
    }

    static void imprimir(int[] vet) {
        for (int i = 0; i < vet.length; ++i) { //passa para a prox casa
            System.out.println(vet[i]);
        }
    }
}
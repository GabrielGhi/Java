import java.util.ArrayList;
public class Ex1 {
    public static void main(String[] args) {
    
    int[] vet = {1+2+3};

    imprimir(vet);

    int[] vet2 = {10*20*8};

    imprimir(vet2);
        
    int[] vet3 = {20*2};

    imprimir(vet3);
    }

    static void imprimir(int[] vet) {
        for (int i = 0; i < vet.length; ++i){
            System.out.println(vet[i]);
        }
    }
}
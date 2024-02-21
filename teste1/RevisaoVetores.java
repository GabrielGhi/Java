public class RevisaoVetores {
    public static void main(String[] args) {
        int[] valores = new int[3]; //aloca 3 espaços de memoria
        valores[0] = 10; // define um valor para cada espaço alocado
        valores[1] = 30;
        valores[2] = 50;

        for (int i = 0; i < valores.length; ++i) { //percorre a lista inteira, enqt 'i' for menor que o tamanho da lista
            System.out.println(i + "-" + valores[i]); 
        } //exibe o espaço e qual numero esta alocado nele
    }
}
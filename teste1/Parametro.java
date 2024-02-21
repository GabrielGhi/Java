public class Parametro {

    public static void main (String[] args) {
        int ini = Integer.parseInt(args[0]);
        int fim = Integer.parseInt(args[1]);

        for(int i = ini; i <= fim; ++i) {
            if (i % 2 == 0) {
                System.out.println(i + ", ");
            }
        } 
    }
}
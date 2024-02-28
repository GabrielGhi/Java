public class Fatorial{
    public static void main(String[] args) {
        long fatorial(long n) {
        if (n == 0) {
            return 1;
        
        } else {
            return n * fatorial (n - 1);
            }
        } 
    }
}

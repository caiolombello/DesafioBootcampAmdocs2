import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = N - 1; i > 1; i--) {
            N *= i;
        }
        System.out.println(N);
    }
}

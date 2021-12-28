import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int soma = 0;
        int min, max;
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (X < Y) {
            min = X;
            max = Y;
        } else {
            max = X;
            min = Y;
        }

        for (int i = (min + 1); i < max; ++i) {
            if (i % 2 == 1 || i % 2 == -1) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
}

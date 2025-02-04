import java.util.Scanner;
import java.util.Arrays;

public class Problemas5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        while (N != 0) {
            int C = scanner.nextInt();
            int T = scanner.nextInt();

            int[] preciosCompe = new int[N];
            int[] preciosTencia = new int[N];

            for (int i = 0; i < N; i++) {
                preciosCompe[i] = scanner.nextInt();
            }


            for (int i = 0; i < N; i++) {
                preciosTencia[i] = scanner.nextInt();
            }

            Arrays.sort(preciosCompe);
            Arrays.sort(preciosTencia);

            int total = 0;

            for (int i = 0; i < C; i++) {
                total += preciosCompe[i];
            }

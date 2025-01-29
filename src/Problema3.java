import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias = 1;
        int segs = 1;
        do{
            dias = sc.nextInt();
            segs = sc.nextInt();
        }while(dias != 0 && segs != 0);
    }
}
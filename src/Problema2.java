import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vecesRepetido = sc.nextInt();

        for(int i = 0; i < vecesRepetido; i++) {
            int anyo = sc.nextInt();
            if(anyo > 0){
                System.out.println(anyo - 1);
            }
            else {
                System.out.println(anyo);
            }
        }
    }
}
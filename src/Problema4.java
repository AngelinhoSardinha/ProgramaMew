import java.util.ArrayList;
import java.util.*;

public class Problema4 {
    static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numeroCasos = scan.nextInt();

        for(int i = 0; i < numeroCasos; i++) {
            List<String> listaCartas = new ArrayList<>();
            int puntos = 0;
            int picas = 0;
            int corazones = 0;
            int treboles = 0;
            int diamantes = 0;

            for(int j = 0; j < 13; j++){
                listaCartas.add(scan.next());
                scan.next();
            }

            for(int x = 0; x < listaCartas.size(); x++){
                if(listaCartas.get(x) == "J"){
                    puntos++;
                }
                else if(listaCartas.get(x) == "D"){
                    diamantes++;
                }
                else if(listaCartas.get(x) == "C"){
                    corazones++;
                }
                else if(listaCartas.get(x) == "T"){
                    treboles++;
                }
                else if(listaCartas.get(x) == "P"){
                    picas++;
                }
                else if(listaCartas.get(x) == "Q"){
                    puntos += 2;
                }
                else if(listaCartas.get(x) == "K"){
                    puntos += 3;
                }
                else if(listaCartas.get(x) == "A"){
                    puntos += 4;
                }
            }
            if(corazones == 1 || treboles == 1 || diamantes == 1 || picas == 1){
                puntos += 2;
            }
            else if(corazones == 2 || treboles == 2 || diamantes == 2 || picas == 2){
                puntos += 1;
            }
            else if(corazones == 0 || treboles == 0 || diamantes == 0 || picas == 0){
                puntos += 3;
            }
            System.out.println(puntos);
        }
    }
}

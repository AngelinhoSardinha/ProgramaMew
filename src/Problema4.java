import java.util.Scanner;

import java.util.ArrayList;
import java.util.*;

public class Problema4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numeroCasos = scan.nextInt();

        for(int i = 0; i < numeroCasos; i++) {
            List<String> listaCartas = new ArrayList<>();
            int puntos = 0;
            int picas = 0;
            int corazones = 0;
            int treboles = 0;
            int diamantes = 0;

            for(int j = 0; j < 26; j++){
                listaCartas.add(scan.next());
            }

            for(int x = 0; x < listaCartas.size(); x++){
                if(Objects.equals(listaCartas.get(x), "J")){
                    puntos++;
                }
                else if(Objects.equals(listaCartas.get(x), "D")){
                    diamantes++;
                }
                else if(Objects.equals(listaCartas.get(x), "C")){
                    corazones++;
                }
                else if(Objects.equals(listaCartas.get(x), "T")){
                    treboles++;
                }
                else if(Objects.equals(listaCartas.get(x), "P")){
                    picas++;
                }
                else if(Objects.equals(listaCartas.get(x), "Q")){
                    puntos += 2;
                }
                else if(Objects.equals(listaCartas.get(x), "K")){
                    puntos += 3;
                }
                else if(Objects.equals(listaCartas.get(x), "A")){
                    puntos += 4;
                }
            }
            switch (diamantes) {
                case 0:
                    puntos += 3;
                    break;
                case 1:
                    puntos += 2;
                    break;
                case 2:
                    puntos += 1;
                    break;
                default:
                    puntos = puntos;

            }
            switch (picas) {
                case 0:
                    puntos += 3;
                    break;
                case 1:
                    puntos += 2;
                    break;
                case 2:
                    puntos += 1;
                    break;
                default:
                    puntos = puntos;

            }
            switch (corazones) {
                case 0:
                    puntos += 3;
                    break;
                case 1:
                    puntos += 2;
                    break;
                case 2:
                    puntos += 1;
                    break;
                default:
                    puntos = puntos;

            }
            switch (treboles) {
                case 0:
                    puntos += 3;
                    break;
                case 1:
                    puntos += 2;
                    break;
                case 2:
                    puntos += 1;
                    break;
                default:
                    puntos = puntos;

            }
            System.out.println(puntos);
        }
    }
}
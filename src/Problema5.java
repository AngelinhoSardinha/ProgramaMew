import java.util.*;

public class Problema5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tamanyo = scan.nextInt();
        while(tamanyo != 0) {
            int compraCompe = scan.nextInt();
            int compraTencia = compraCompe;
            int compraMinima = 0;

            List<Integer> listaCompe = new ArrayList<>();
            List<Integer> listaTencia = new ArrayList<>();

            for(int c = 0; c < tamanyo; c++){
                listaCompe.add(scan.nextInt());
            }
            for(int t = 0; t < tamanyo; t++){
                listaTencia.add(scan.nextInt());
            }

            Collections.sort(listaCompe);
            Collections.sort(listaTencia);

            for(int n = 0; n < compraCompe; n++){
                if(listaCompe.get(n) < listaCompe.get(n + 1)){
                    compraMinima += listaCompe.get(n);
                }
            }
            for(int n = 0; n < compraTencia; n++){
                if(listaTencia.get(n) < listaTencia.get(n + 1)){
                    compraMinima += listaTencia.get(n);
                }
            }
            tamanyo = scan.nextInt();
        }
    }
}
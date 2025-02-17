import java.util.*;
import java.lang.Math;

class Program {
    public static void main(String[] args) {
    }
    
    public static int prendiPrestito(String[] biblioteca, String[] prestiti, int dimensione, String libro, int count) {
        int elemento, i;
        boolean trovato;

        trovato = false;
        for (i = 0; i <= dimensione - 1; i++) {
            if (biblioteca[i].equals(libro)) {
                elemento = i;
                trovato = true;
                inserisciElemento(biblioteca, prestiti, dimensione, elemento, biblioteca[i], count);
                dimensione = eliminaElemento(biblioteca, dimensione, elemento);
                System.out.println("il libro" + biblioteca[i] + "e stato preso in prestito");
            }
        }
        if (!trovato) {
            System.out.println("libro non presente in libreria");
        }
        
        return dimensione;
    }
    
    public static int restituiciPrestito(int[] biblioteca, int[] prestiti, int dimensione, int elemento) {
        if (!(elemtento < 0) && !(elemento > dimensione)) {
            int dimensione;

            dimensione = elimanaElemento(prestiti, dimensione, elemento);
            inserisciElemento(biblioteca, dimensione, prestiti[elemento], elemento);
        } else {
            System.out.println("Questo libro non è mai stato preso in prestito");
        }
        
        return dimensione;
    }
    
    public static void visualizzaBiblioteca(String vettore, int dimensione) {
        int i;

        for (i = 0; i <= dimensione - 1; i++) {
            if (dimensione > 0) {
                System.out.println(Integer.toString(i + 1) + " : " + vettore[i]);
            } else {
                System.out.println("La biblioteca è vuota i libri sono stati presi tutti in prestito");
            }
        }
    }
    
    public static void visualizzaPrestiti(String[] vettore, int dimensione) {
        int i;

        for (i = 0; i <= dimensione - 1; i++) {
            if (dimensione > 0) {
                System.out.println("");
            } else {
                System.out.println("la biblioteca è piena nessun libro è stato preso in prestito");
            }
        }
    }
}

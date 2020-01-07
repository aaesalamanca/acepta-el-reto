
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author aaestornell.
 */
public class V5546IntercambiandoCromos {
    
    /* Clase. */
    // Clases privadas.
    private static class Cromo {
        
        private int repeticiones;
        
        public Cromo() {
            repeticiones = 1;
        }
        
        public int getRepeticiones() {
            return repeticiones;
        }
        
        public void repetir() {
            repeticiones++;
        }
        
        @Override
        public String toString() {
            return String.valueOf(repeticiones);
        }
    }
    
    // Métodos.
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numCasos = scan.nextInt();
        for (; numCasos > 0; numCasos--) {
            int cromosAlejandro = scan.nextInt();
            TreeMap<Integer, Cromo> tmAlejandro = new TreeMap<>();
            for (; cromosAlejandro > 0; cromosAlejandro--) {
                int cromoLeido = scan.nextInt();
                Cromo cromo = tmAlejandro.get(cromoLeido);
                if (cromo == null) {
                    tmAlejandro.put(cromoLeido, new Cromo());
                } else {
                    cromo.repetir();
                }
            }
            
            int cromosMateo = scan.nextInt();
            TreeMap<Integer, Cromo> tmMateo = new TreeMap<>();
            for (; cromosMateo > 0; cromosMateo--) {
                int cromoLeido = scan.nextInt();
                Cromo cromo = tmMateo.get(cromoLeido);
                if (cromo == null) {
                    tmMateo.put(cromoLeido, new Cromo());
                } else {
                    cromo.repetir();
                }
            }
            
            TreeSet<Integer> tsAlejandro = new TreeSet<>();
            for (Integer fKeyAlejandro: tmAlejandro.keySet()) {
                Cromo cromo = tmAlejandro.get(fKeyAlejandro);
                if (cromo.getRepeticiones() > 1) {
                    if (tmMateo.get(fKeyAlejandro) == null) {
                        tsAlejandro.add(fKeyAlejandro);
                    }
                }
            }
            if (tsAlejandro.isEmpty()) {
                System.out.println("Nada que intercambiar");
            } else {
                String salidaAlejandro = "";
                for (Integer fInt: tsAlejandro) {
                    salidaAlejandro += " " + fInt;
                }
                System.out.println(salidaAlejandro.trim());
            }
            
            TreeSet<Integer> tsMateo = new TreeSet<>();
            for (Integer fKeyMateo: tmMateo.keySet()) {
                Cromo cromo = tmMateo.get(fKeyMateo);
                if (cromo.getRepeticiones() > 1) {
                    if (tmAlejandro.get(fKeyMateo) == null) {
                        tsMateo.add(fKeyMateo);
                    }
                }
            }
            if (tsMateo.isEmpty()) {
                System.out.println("Nada que intercambiar");
            } else {
                String salidaMateo = "";
                for (Integer fInt: tsMateo) {
                    salidaMateo += " " + fInt;
                }
                System.out.println(salidaMateo.trim());
            }
        }
    }
}

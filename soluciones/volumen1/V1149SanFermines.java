
/* ***** Importaciones. ***** */
import java.util.Scanner;

/**
 * Clase V1149SanFermines.
 * 
 * @author aaestornell.
 */
public class V1149SanFermines {
    
    /* ***** Static. ***** */
    /**
     * Implementa el algoritmo que soluciona el problema de la velocidad
     * en los San Fermines.
     * 
     * @param args -- Parámetros desde la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numToros;
        
        /**
         * Tratamiento de cada caso.
         * 
         * Lee datos mientras haya algo que leer en el buffer.
         */
        while (scan.hasNext()) {
            numToros = scan.nextInt();
            
            int maximo = -1;
            
            /**
             * Lee todas las velocidades que se introducen de cada toro y
             * guarda la más alta.
             */
            for (int posicion = 0; posicion < numToros; posicion++) {
                int actual = scan.nextInt();
                
                if (actual > maximo) {
                    maximo = actual;
                }
            }
            
            System.out.println(maximo);
        }
    }
}

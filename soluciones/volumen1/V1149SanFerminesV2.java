
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * @author aaestornell.
 */
public class V1149SanFerminesV2 {
    
    /* Clase. */
    // Métodos.
    /**
     * Implementa el algoritmo que soluciona el problema de la velocidad
     * en los San Fermines.
     * 
     * El cambio de tratamiento en la entrada de datos provoca un MLE.
     * 
     * @param args parámetros desde la línea de comandos.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int numToros;
        
        /**
         * Tratamiento de cada caso.
         * 
         * Lee datos mientras haya algo que leer en el buffer.
         */
        String linea;
        while ((linea = br.readLine()) != null) {
            st = new StringTokenizer(linea);
            numToros = Integer.parseInt(st.nextToken());
            
            int maximo = -1;
            
            /**
             * Lee todas las velocidades que se introducen de cada toro y
             * guarda la más alta.
             */
            for (int posicion = 0; posicion < numToros; posicion++) {
                int actual = Integer.parseInt(st.nextToken());
                
                if (actual > maximo) {
                    maximo = actual;
                }
            }
            
            System.out.println(maximo);
        }
    }
}

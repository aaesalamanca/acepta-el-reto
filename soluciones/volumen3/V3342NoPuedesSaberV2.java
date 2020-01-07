
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

/**
 *
 * @author aaestornell.
 */
public class V3342NoPuedesSaberV2 {
    
    /* Clase. */
    // Métodos.
    /**
     * Implementa el algoritmo que resuelve el problema de adivinación en un
     * intervalo.
     * 
     * @param args parámetros desde la línea de comandos.
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int inicio = Integer.parseInt(st.nextToken());
        int fin = Integer.parseInt(st.nextToken());
        int numero = Integer.parseInt(st.nextToken());
        
        // Tratamiento de cada caso.
        while (inicio != 0 && fin != 0 && numero != 0) {
            st = new StringTokenizer(br.readLine());
            int numHipotesis = Integer.parseInt(st.nextToken());

            /**
             * Bucle para "acortar" el intervalo a cada hipótesis que se
             * introduce.
             */
            while (numHipotesis-- > 0) {
                int hipotesis = Integer.parseInt(st.nextToken());
                
                if (hipotesis < inicio || hipotesis > fin) {
                    continue;
                }
                
                if (hipotesis <= numero) {
                    inicio = hipotesis;
                } else if (hipotesis > numero) {
                    fin = hipotesis - 1;
                }
            }
            
            System.out.println(inicio == fin ? "LO SABE" : "NO LO SABE");
            
            // Lectura del siguiente caso.
            st = new StringTokenizer(br.readLine());
            inicio = Integer.parseInt(st.nextToken());
            fin = Integer.parseInt(st.nextToken());
            numero = Integer.parseInt(st.nextToken());
        }
    }
}

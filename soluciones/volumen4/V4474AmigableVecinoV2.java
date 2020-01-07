
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

/**
 * 
 * @author aaestornell.
 */
public class V4474AmigableVecinoV2 {
    
    /* Clase. */
    // Métodos.
    /**
     * Implementa el algoritmo que soluciona el problema del amigable vecino.
     * 
     * @param args parámetros desde la línea de comandos.
     * @throws java.io.IOException
     */
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int casos = Integer.parseInt(br.readLine());
        
        // Tratamiento de cada caso.
        for(; casos > 0; casos--) {
            st = new StringTokenizer(br.readLine());
            int spiderman = Integer.parseInt(st.nextToken());
            int bomba1 = Integer.parseInt(st.nextToken());
            int bomba2 = Integer.parseInt(st.nextToken());
            
            /**
             * Cálculo de la distancia.
             * 
             * Se calcula teniendo en cuenta que siempre se desplaza primero
             * al más cercano.
             * 
             * La distancia total mínima es siempre la distancia de Spiderman
             * a la bomba más cercana más la distancia entre esa bomba y la más
             * lejana a Spiderman.
             */
            int distanciaSPB1 = Math.abs(bomba1 - spiderman);
            int distanciaSPB2 = Math.abs(bomba2 - spiderman);
            int distanciaB1B2 = Math.abs(bomba1 - bomba2);
            if (distanciaSPB1 < distanciaSPB2) {
                System.out.println(distanciaSPB1 + distanciaB1B2);
            } else {
                System.out.println(distanciaSPB2 + distanciaB1B2);
            }
        }
    }
}

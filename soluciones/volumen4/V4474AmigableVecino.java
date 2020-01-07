
/* ***** Importaciones. ***** */
import java.util.Scanner;

/**
 * Clase V474AmigableVecino.
 * 
 * @author aaestornell.
 */
public class V4474AmigableVecino {
    
    /* ***** Static. ***** */
    /**
     * Implementa el algoritmo que soluciona el problema del amigable vecino.
     * 
     * @param args -- Parámetros desde la línea de comandos.
     */
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        
        /* Tratamiento de cada caso. */
        for(; casos > 0; casos--) {
            int spiderman = scan.nextInt();
            int bomba1 = scan.nextInt();
            int bomba2 = scan.nextInt();
            
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

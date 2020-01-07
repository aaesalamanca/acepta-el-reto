
/* ***** Importaciones. ***** */
import java.util.Scanner;

/**
 * Clase V3342NoPuedesSaber.
 *
 * @author aaestornell.
 */
public class V3342NoPuedesSaber {
    
    /* ***** Static. ***** */
    /**
     * Implementa el algoritmo que resuelve el problema de adivinación en un
     * intervalo.
     * 
     * @param args -- Parámetros desde la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inicio = scan.nextInt();
        int fin = scan.nextInt();
        int numero = scan.nextInt();
        
        /* Tratamiento de cada caso. */
        while (inicio != 0 && fin != 0 && numero != 0) {
            int numHipotesis = scan.nextInt();

            /**
             * Bucle para "acortar" el intervalo a cada hipótesis que se
             * introduce.
             */
            while (numHipotesis-- > 0) {
                int hipotesis = scan.nextInt();
                
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
            
            /* Lectura del siguiente caso. */
            inicio = scan.nextInt();
            fin = scan.nextInt();
            numero = scan.nextInt();
        }
    }
}

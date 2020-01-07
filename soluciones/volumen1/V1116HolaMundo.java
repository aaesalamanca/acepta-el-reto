
/* ***** Importaciones. ***** */
import java.util.Scanner;

/**
 * Clase V1116HolaMundo.
 * 
 * @author aaestornell.
 */
public class V1116HolaMundo {
    
    /* ***** Static. ***** */
    /**
     * Implementa el algoritmo del problema del saludo.
     * 
     * @param args -- Parámetros desde la línea de comandos.
     */
    public static void main(String[] args) {
            int casos;
            Scanner scan = new Scanner(System.in);
            
            casos = scan.nextInt();
            
            /**
             * Imprime por pantalla tantos "Hola mundo." como casos se
             * introducen.
             */
            for ( ; casos > 0; casos--)
                System.out.println("Hola mundo.");
    }
}

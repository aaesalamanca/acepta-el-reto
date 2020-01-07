
import java.io.IOException;

/**
 * 
 * @author aaestornell.
 */
public class V1116HolaMundoV3 {
    
    /* Clase. */
    /**
     * Implementa el algoritmo del problema del saludo.
     * 
     * @param args parámetros desde la línea de comandos.
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
            int casos;
            casos = Integer.parseInt(String.valueOf((char)System.in.read()));
            
            /**
             * Imprime por pantalla tantos "Hola mundo." como casos se
             * introducen.
             */
            for ( ; casos > 0; casos--)
                System.out.println("Hola mundo.");
    }
}


import java.io.IOException;

/**
 * 
 * @author aaestornell.
 */
public class V1116HolaMundoV4 {
    
    /* Clase. */
    /**
     * Implementa el algoritmo del problema del saludo.
     * 
     * @param args parámetros desde la línea de comandos.
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
            int casos;
            casos = Integer.parseInt(Character.toString((char)System.in.read()));
            
            /**
             * Imprime por pantalla tantos "Hola mundo." como casos se
             * introducen.
             */
            while (casos > 0) {
                System.out.println("Hola mundo.");
                casos--;
            } 
    }
}

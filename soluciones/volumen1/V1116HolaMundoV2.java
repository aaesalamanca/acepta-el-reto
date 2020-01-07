
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author aaestornell.
 */
public class V1116HolaMundoV2 {
    
    /* Clase. */
    /**
     * Implementa el algoritmo del problema del saludo.
     * 
     * @param args parámetros desde la línea de comandos.
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
            int casos;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            casos = Integer.parseInt(br.readLine());
            
            /**
             * Imprime por pantalla tantos "Hola mundo." como casos se
             * introducen.
             */
            for ( ; casos > 0; casos--)
                System.out.println("Hola mundo.");
    }
}

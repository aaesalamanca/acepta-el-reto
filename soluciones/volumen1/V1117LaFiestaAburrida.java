
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author aaestornell.
 */
public class V1117LaFiestaAburrida {
    
    /* Clase. */
    // Métodos.
    /**
     * 
     * @param args 
     * @throws java.io.IOException 
     */
    public static void main(String[] args) throws IOException {
        int numCasos;
        String linea;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        numCasos = Integer.parseInt(br.readLine());
        for ( ; numCasos > 0; numCasos--) {
            linea = br.readLine();
            linea = linea.replace("Soy", "Hola,");
            System.out.println(linea + ".");
        }
    }
}


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author aaestornell.
 */
public class V1165NumeroHyperpar {
    
    /* Clase. */
    // Métodos.
    /**
     * 
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String numero;
        while (Integer.parseInt((numero = br.readLine())) > -1) {
            boolean esHyperpar = true;
            
            for (int cont = 0, longitud = numero.length(); cont < longitud;
                    cont++) {
                if (((long)numero.charAt(cont)) % 2 != 0) {
                    System.out.println("NO");
                    esHyperpar = false;
                    break;
                }
            }
            
            if (esHyperpar) {
                System.out.println("SI");
            }
        }
    }
}


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author aaestornell.
 */
public class V5538ToestoEraCampo {
    
    /* Clase. */
    // Métodos.
    /**
     * 
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String entrada;
        while (!(entrada = br.readLine()).equals("0 0")) {
            String[] aEntrada = entrada.split(" ");
            
            if (Integer.parseInt(aEntrada[0]) >= Integer.parseInt(aEntrada[1])) {
                System.out.println("CUERDO");
            } else {
                System.out.println("SENIL");
            }
        }
    }
}

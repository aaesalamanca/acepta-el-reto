
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author aaestornell.
 */
public class V4460BaseRaiz10 {
    
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
        while ((entrada = br.readLine()) != null) {
            String salida = "";
            for (int cont = 0, length = entrada.length() - 1; cont < length; cont++) {
                salida += entrada.charAt(cont) + "0";
            }
            salida += entrada.charAt(entrada.length() - 1);
            
            System.out.println(salida);
        }
    }
}

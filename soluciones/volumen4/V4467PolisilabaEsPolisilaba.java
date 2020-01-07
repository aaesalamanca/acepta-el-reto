
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author aaestornell.
 */
public class V4467PolisilabaEsPolisilaba {
    
    /* Clase. */
    // Métodos.
    /**
     * 
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int numCasos = Integer.parseInt(br.readLine());
        for ( ; numCasos > 0; numCasos--) {
            String[] aLinea = br.readLine().split(" ");
            
            if (aLinea[0].equalsIgnoreCase(aLinea[2])) {
                System.out.println("TAUTOLOGIA");
            } else {
                System.out.println("NO TAUTOLOGIA");
            }
        }
    }
}

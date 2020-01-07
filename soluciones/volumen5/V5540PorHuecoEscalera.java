
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author aaestornell.
 */
public class V5540PorHuecoEscalera {
    
    /* Clase. */
    // Métodos.
    /**
     * 
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int casos = Integer.parseInt(br.readLine());
        for ( ; casos > 0; casos--) {
            String[] aEntrada = br.readLine().split(" ");
            
            int escalones = Integer.parseInt(aEntrada[0])
                    * Integer.parseInt(aEntrada[1]);
            int escalonesSubidos = Integer.parseInt(aEntrada[1])
                    * Integer.parseInt(aEntrada[2]) + Integer.parseInt(aEntrada[3]);
            int totalEscalonesSubidos = escalones + escalonesSubidos;
            int escalonesBajados = escalonesSubidos;
            System.out.println(escalonesBajados + " " + totalEscalonesSubidos);
        }
    }
}

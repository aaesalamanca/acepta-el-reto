
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author aaestornell.
 */
public class V5539FelizDecadaNueva {
    
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
            String[] aEntrada = entrada.split(" ");
            
            int annoInicio = Integer.parseInt(aEntrada[0]);
            int annoFin = Integer.parseInt(aEntrada[1]) + 1;
            
            for ( ; annoFin > annoInicio; annoFin -= 10);
            System.out.println( annoInicio == annoFin ? "FELIZ DECADA NUEVA"
                    : "TOCA ESPERAR");
        }
    }
}

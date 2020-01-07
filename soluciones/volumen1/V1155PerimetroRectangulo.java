
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author aaestornell.
 */
public class V1155PerimetroRectangulo {
    
    /* Clase. */
    // Atributos.
    private static BufferedReader br;
    
    // Métodos.
    /**
     * 
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        
        while(siguePrueba());
    }
    
    /**
     * 
     * @return
     * @throws IOException 
     */
    private static boolean siguePrueba() throws IOException {
        String linea = br.readLine();
        
        if (linea.contains("-")) {
            return false;
        }
        
        String[] aLinea = linea.split(" ");
        System.out.println(((Integer.parseInt(aLinea[0]) * 2)
                + (Integer.parseInt(aLinea[1]) * 2)));
        
        return true;
    }
}

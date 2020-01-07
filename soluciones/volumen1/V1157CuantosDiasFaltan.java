
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author aaestornell.
 */
public class V1157CuantosDiasFaltan {
    
    /* Clase. */
    // Atributos.
    private static final int[] ADIASMESES = { 31, 28, 31, 30, 31, 30, 31, 31,
        30, 31, 30, 31};
    private static final int DIASANNO = 365;
    
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
            int acumDias = 0;
            
            String[] aLinea = br.readLine().split(" ");
            int dia = Integer.parseInt(aLinea[0]);
            int mes = Integer.parseInt(aLinea[1]);
            
            for (int cont = 0; cont < (mes - 1); cont++) {
                acumDias += ADIASMESES[cont];
            }
            acumDias += dia;
            
            System.out.println(DIASANNO - acumDias);
        }
    }
}

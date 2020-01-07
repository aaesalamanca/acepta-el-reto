
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author aaestornell.
 */
public class V5541IIII {
    
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
        while (!(entrada = br.readLine()).equals("0 0 0")) {
            String[] aEntrada = entrada.split(" ");
            int num1 = Integer.parseInt(aEntrada[0]);
            int num2 = Integer.parseInt(aEntrada[1]);
            int num3 = Integer.parseInt(aEntrada[2]);
            System.out.println((num1 + num2 + num3) / mcd(mcd(num1, num2), num3));
        }
    }
    
    /**
     * 
     * @param pNum1
     * @param pNum2
     * @return 
     */
    private static int mcd(int pNum1, int pNum2) {
        if (pNum2 == 0) {
            return pNum1;
        } else {
            return mcd(pNum2, pNum1 % pNum2);
        }
    }
}

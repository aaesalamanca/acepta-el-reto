
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author aaestornell.
 */
public class V4441ContarHastaElFinal {

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
            byte acarreo = 1, puntos = 0, numero;
            String salida = "";
            
            for (int posicion = entrada.length() - 1; posicion > -1;
                    posicion--) {
                char caracter = entrada.charAt(posicion);
                if (caracter != '.') {
                    numero = (byte) (Character.getNumericValue(caracter) + acarreo);
                    
                    if (numero == 10) {
                        numero = 0;
                        acarreo = 1;
                    } else {
                        acarreo = 0;
                    }
                    
                    if (puntos == 3) {
                        salida = '.' + salida;
                        puntos = 0;
                    }
                    puntos++;
                    
                    salida = numero + salida;
                }
            }
            
            if (acarreo == 1) {
                if (puntos == 3) {
                    salida = acarreo + "." + salida;
                } else {
                    salida = acarreo + salida;
                }
            }
            
            System.out.println(salida);
        }
    }
}

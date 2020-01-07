
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author aaestornell.
 */
public class V4475StanLeeV2 {
    
    /* Clase. */
    // Métodos.
    /**
     * Implementa el algoritmo que soluciona el problema de Stan Lee.
     * 
     * @param args parámetros desde la línea de comandos.
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        char[] stanLee = {'s', 't', 'a', 'n', 'l', 'e', 'e'};
        
        // Tratamiento de cada caso.
        for (; casos > 0; casos--) {
            int repeticiones = 0;
            int posicionStanLee = 0;
            
            String linea = br.readLine();
            
            linea = linea.toLowerCase();
            
            /**
             * Se recorre el String en minúsculas y se compara con el array
             * de caracteres que contiene la cadena a comprobar.
             * 
             * Empiezan a recorrerse tanto el String como el array de caracteres
             * desde la posición 0. Cada iteración avanza 1 en el String y, en
             * el caso de que el carácter del String coincida con el del array,
             * avanza 1 en el array.
             * 
             * Además, si la posición del array es la última y coinciden los
             * caracteres, se suma 1 a la repetición (tenemos una repetición
             * más de la cadena completa y la posición en el array vuelve a ser
             * 0, la inicial.
             * 
             * Si no coinciden el carácter del String y del array, se sigue
             * avanzando solo en el String.
             */
            for (int posicion = 0; posicion < linea.length(); posicion++){
                if ((linea.charAt(posicion) == stanLee[posicionStanLee])
                        && (posicionStanLee == (stanLee.length - 1))) {
                    posicionStanLee = 0;
                    repeticiones++;
                    
                } else if (linea.charAt(posicion) == stanLee[posicionStanLee]) {
                    posicionStanLee++;
                }
            }
            
            System.out.println(repeticiones);
        }
    }
}

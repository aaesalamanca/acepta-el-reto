
/* ***** Importaciones. ***** */
import java.util.Scanner;

/**
 * Clase V4475StanLee.
 * 
 * @author aaestornell.
 */
public class V4475StanLee {
    
    /**
     * Implementa el algoritmo que soluciona el problema de Stan Lee.
     * 
     * @param args -- Parámetros desde la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        /**
         * Lectura del \n introducido tras el número de casos para poder leer
         * sin problemas las líneas siguientes.
         */
        scan.nextLine();
        char[] stanLee = {'s', 't', 'a', 'n', 'l', 'e', 'e'};
        
        /* Tratamiento de cada caso. */
        for (; casos > 0; casos--) {
            int repeticiones = 0;
            int posicionStanLee = 0;
            
            String linea = scan.nextLine();
            
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


/* ***** Importaciones. ***** */
import java.util.Scanner;

/**
 * Clase V1100ConstanteKaprekar.
 * 
 * @author aaestornell.
 */
public class V1100ConstanteKaprekar {
    
    /* ***** Static. ***** */
    /**
     * Implementa el algoritmo que soluciona el problema de la constante
     * de Kaprekar.
     * 
     * @param args -- Parámetros desde la línea de comandos.
     */
    public static void main(String[] args) {
        int casos;
        int contadorCasos = 0;
        Scanner scan = new Scanner(System.in);
        
        casos = scan.nextInt();
        
        /* Tratamiento de cada caso. */
        while (contadorCasos < casos) {
            int numeroDividendo = scan.nextInt();
            
            if (numeroDividendo == 6174)
                System.out.println(0);
            else {
                int contadorKaprekar = 0;
                int resta = numeroDividendo;
                
                /* Iteraciones de Kaprekar por cada caso. */
                do {
                    numeroDividendo = resta;
                    int[] menor = new int[4];
                    
                    /**
                     * Obtención como unidades de cada uno de los números que
                     * componen el número por separado.
                     */
                    menor[0] = numeroDividendo / 1000;
                    numeroDividendo %= 1000;
                    menor[1] = numeroDividendo / 100;
                    numeroDividendo %= 100;
                    menor[2] = numeroDividendo / 10;
                    menor[3] = numeroDividendo % 10;
                    
                    /* Si es un repdigit. Ejemplo: 1111 */
                    if ((menor[0] == menor[1]) && (menor[1] == menor[2])
                            && (menor[2] == menor[3])) {
                        contadorKaprekar = 8;
                        
                        break;
                    }
                    
                    /**
                     * Implementación del algoritmo de la burbuja para ordenar
                     * el número de forma ascendente.
                     */
                    for(int cont1 = 1; cont1 < 4; cont1++) {
                        for (int cont2 = 0; cont2 < 4 - cont1; cont2++) {
                            if (menor[cont2] > menor[cont2 + 1]) {
                                int aux = menor[cont2];
                                menor[cont2] = menor[cont2 + 1];
                                menor[cont2 + 1] = aux;
                            }
                        }
                    }
                    
                    int minimo = (menor[0] * 1000) + (menor[1] * 100) + (menor[2] * 10)
                            + menor[3];
                    int maximo = menor[0] + (menor[1] * 10) + (menor[2] * 100)
                            + (menor[3] * 1000);
                    
                    resta = maximo - minimo;
                    
                    contadorKaprekar++;
                } while (resta != 6174);
                
                System.out.println(contadorKaprekar);
            }
            
            contadorCasos++;
        }
    }
}


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

/**
 * 
 * @author aaestornell.
 */
public class V1101CuadradosDiabolicosEsotericosV2 {
    /* Clase */
    // Métodos.
    /**
     * Implementa el algoritmo que soluciona el problema de los cuadrados
     * diabólicos esotéricos.
     * 
     * @param args parámetros desde la línea de comandos.
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int lados;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean esDiabolico;
        boolean esEsoterico;
        
        // Tratamiento de cada caso.
        do {
            esDiabolico = true;
            esEsoterico = false;
            
            lados = Integer.parseInt(br.readLine());
            
            if (lados != 0) {
                int[][] cuadrado = new int[lados][lados];
                
                // Llenado del cuadrado.
                st = new StringTokenizer(br.readLine());
                for (int fila = 0; fila < lados; fila++)
                    for (int columna = 0; columna < lados; columna++)
                        cuadrado[fila][columna] = Integer.parseInt(st.nextToken());
                
                int sumaFilaAnterior = 0;
                int sumaFilaActual;
                int sumaDiagonalPrincipal = cuadrado[0][0];
                int sumaDiagonalOpuesta = cuadrado[lados - 1][0];
                
                // Suma de la primera fila.
                for (int columna = 0; columna < lados; columna++)
                    sumaFilaAnterior += cuadrado[0][columna];
                
                // Recorrido y suma del resto de filas.
                for (int fila = 1; fila < lados; fila++) {
                    sumaFilaActual = 0;
                    
                    for (int columna = 0; columna < lados; columna++) {
                        sumaFilaActual += cuadrado[fila][columna];
                        
                        // Suma de la diagonal principal.
                        if (fila == columna)
                            sumaDiagonalPrincipal += cuadrado[fila][columna];
                    }
                    
                    if (sumaFilaActual != sumaFilaAnterior) {
                        esDiabolico = false;
                    
                        break;
                    }
                    
                    sumaFilaAnterior = sumaFilaActual;
                }
                
                if (esDiabolico) {
                    // Suma de la diagonal opuesta.
                    for (int fila = lados - 2, columna = 1; fila > -1; fila--,
                            columna++)
                        sumaDiagonalOpuesta += cuadrado[fila][columna];
                    
                    if (sumaDiagonalPrincipal != sumaDiagonalOpuesta)
                        esDiabolico = false;
                    else {
                        int sumaColAnterior = 0;
                        int sumaColActual;
                        
                        // Suma de la primera columna.
                        for (int fila = 0; fila < lados; fila++)
                            sumaColAnterior += cuadrado[fila][0];
                        
                        // Recorrido y suma del resto de columnas.
                        for (int columna = 1; columna < lados; columna++) {
                            sumaColActual = 0;
                            
                            for (int fila = 0; fila < lados; fila ++) {
                                sumaColActual += cuadrado[fila][columna];
                            }
                            
                            if (sumaColActual != sumaColAnterior) {
                                esDiabolico = false;
                                
                                break;
                            }
                            
                            sumaColAnterior = sumaColActual;
                        }
                        
                        // Ya es diabólico, comprueba si es esotérico.
                        if (esDiabolico) {
                            esEsoterico = true;
                            
                            /**
                             * Mismas cifras en el interior del cuadrado que
                             * número de casillas.
                             * 
                             * Por cada cifra, recorre el cuadrado entero y si
                             * no encuentra la cifra en este, no es esotérico.
                             */
                            for (int cifra = 1; cifra <= (lados * lados);
                                    cifra++) {
                                boolean cifraEncontrada = false;
                                
                                for (int fila = 0; fila < lados; fila++) {
                                    for (int columna = 0; columna < lados;
                                            columna++) {
                                        if (cifra == cuadrado[fila][columna]) {
                                            cifraEncontrada = true;
                                            
                                            break;
                                        }
                                    }
                                    
                                    if (cifraEncontrada)
                                        break;
                                }
                                
                                if (!cifraEncontrada) {
                                    esEsoterico = false;
                                    
                                    break;
                                }
                            }
                            
                            if (esEsoterico) {
                                int constanteMagica2 = (4 * sumaColAnterior)
                                        / lados;
                                
                                /**
                                 * Si es un cuadrado diabólico de lados
                                 * impares.
                                 */
                                if ((lados % 2) != 0) {
                                    /**
                                     * Hay varios métodos para comprobar que la
                                     * suma de las cuatro esquinas del cuadrado
                                     * es igual a la constante mágica 2 en
                                     * cuadrados diabólicos de lados impares.
                                     * En este caso uso:
                                     * 
                                     * casilla central * 4 = constante mágica 2
                                     */
                                    if ((cuadrado[lados / 2][lados / 2] * 4)
                                            != constanteMagica2)
                                        esEsoterico = false;
                                }
                                /**
                                 * Si es un cuadrado diabólico de lados impares.
                                 */
                                else {
                                    /**
                                     * Igual que en los impares, en los pares
                                     * también hay distintos métodos para saber
                                     * si es esotérico.
                                     * 
                                     * Aquí se comprueba que la suma de las
                                     * cuatro esquinas sea igual a la constante
                                     * mágica 2.
                                     */
                                    if ((cuadrado[0][0] + cuadrado[lados - 1][0]
                                            + cuadrado[0][lados - 1]
                                            + cuadrado[lados - 1][lados - 1])
                                            != constanteMagica2)
                                        esEsoterico = false;
                                }
                            }
                        }
                    }
                }
                
                if (esEsoterico)
                    System.out.println("ESOTERICO");
                else if (esDiabolico)
                    System.out.println("DIABOLICO");
                else
                    System.out.println("NO");
            }
            else
                break;
        } while (true);
    }
}

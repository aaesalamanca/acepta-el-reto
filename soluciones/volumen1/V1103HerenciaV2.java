
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

/**
 * Apenas hay mejora por cambiar la forma en que se obtienen datos de la
 * entrada.
 * 
 * @author aaestornell.
 */
public class V1103HerenciaV2 {
    
    /* Clase. */
    // Métodos.
    /**
    * Implementa el algoritmo que soluciona el problema de herencia
    * 
    * @param args parámetros desde la línea de comandos.
    * @throws java.io.IOException
    */
    public static void main(String[] args) throws IOException {
        int grado;
        int[] coeficientes;
        int numeroRectangulos;
        double base;
        double altura;
        double areaCain;
        double areaAbel;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        // Tratamiento de cada polinomio.
        while ((grado = Integer.parseInt(br.readLine())) != 20) {
            coeficientes = new int[grado + 1];
            
            // Se almacenan los coeficientes del polinomio.
            st = new StringTokenizer(br.readLine());
            for (int posicion = grado; posicion > -1; posicion--) {
                coeficientes[posicion] = Integer.parseInt(st.nextToken());
            }
            
            numeroRectangulos = Integer.parseInt(br.readLine());
            
            /**
              * Cálculo del área total para Caín aplicando las sumas de Riemann.
              * 
              * Si el grado es cero, el área es igual al único coeficiente:
              
              *      1 * coeficiente
              */
            if (grado == 0) {
                areaCain = coeficientes[0];
            } else {
                areaCain = 0;
                
                base = 1d / numeroRectangulos;
                double coordX = 0;
                    
                /**
                 * Cálculo del área por cada rectángulo:
                 * 
                 *      Área = base * altura
                 * 
                 * La base ya se conoce y la altura se calcula a partir
                 * de los coeficientes almacenados en el array y el valor
                 * de la coordenada X en el eje de abscisas.
                 * 
                 * Si la altura es menor que 0 en alguna ocasión, no se suma
                 * nada al área total, si es mayor que 1, se suma la base al
                 * área total:
                 * 
                 *      Área parcial = base * 1
                 */
                for (int rectangulo = 0; rectangulo < numeroRectangulos;
                        rectangulo++, coordX += base) {
                    altura = coeficientes[0];
                    
                    for (int posicion = 1; posicion < coeficientes.length;
                            posicion++) {
                        altura += (coeficientes[posicion]
                                * Math.pow(coordX, posicion));
                    }
                    
                    if (altura > 1) {
                        areaCain += base;
                    } else if (altura > 0) {
                        areaCain += altura * base;
                    }
                }
            }
            
            areaAbel = 1 - areaCain;
            
            if (Math.abs(areaAbel - areaCain) > 0.001) {
                if (areaAbel > areaCain) {
                    System.out.println("ABEL");
                } else {
                    System.out.println("CAIN");
                }
            } else {
                System.out.println("JUSTO");
            }
        }
    }
}

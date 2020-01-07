
/* ***** Importaciones. ***** */
import java.util.Scanner;

/**
 * Clase V1103Herencia.
 * 
 * @author aaestornell.
 */
public class V1103Herencia {
    
    /* ***** Static. ***** */
    /**
    * Implementa el algoritmo que soluciona el problema de herencia
    * 
    * @param args -- Parámetros desde la línea de comandos.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grado;
        int[] coeficientes;
        int numeroRectangulos;
        double base;
        double altura;
        double areaCain;
        double areaAbel;
        
        /* *** Tratamiento de cada polinomio. *** */
        while ((grado = scan.nextInt()) != 20) {
            coeficientes = new int[grado + 1];
            
            /* *** Se almacenan los coeficientes del polinomio. *** */
            for (int posicion = grado; posicion > -1; posicion--) {
                coeficientes[posicion] = scan.nextInt();
            }
            
            numeroRectangulos = scan.nextInt();
            
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

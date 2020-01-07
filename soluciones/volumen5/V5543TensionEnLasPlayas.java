
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author aaestornell.
 */
public class V5543TensionEnLasPlayas {

    /* Clase. */
    // Métodos.
    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numCasos = Integer.parseInt(br.readLine());
        for (; numCasos > 0; numCasos--) {
            int[][] aSombrillas = new int[Integer.parseInt(br.readLine())][3];
            for (int cont = 0; cont < aSombrillas.length; cont++) {
                String[] aEntrada = br.readLine().split(" ");
                aSombrillas[cont][0] = Integer.parseInt(aEntrada[0]);
                aSombrillas[cont][1] = Integer.parseInt(aEntrada[1]);
                aSombrillas[cont][2] = Integer.parseInt(aEntrada[2]);
            }

            int tension = 0;
            for (int cont = 0, length = aSombrillas.length; cont < length;
                    cont++) {
                for (int cont2 = cont + 1; cont2 < length; cont2++) {
                    int sumaRadios = aSombrillas[cont][2] + aSombrillas[cont2][2];
                    double distancia = Math.pow(Math.pow(aSombrillas[cont][0] - aSombrillas[cont2][0], 2)
                            + Math.pow(aSombrillas[cont][1] - aSombrillas[cont2][1], 2), 0.5);

                    if (distancia < sumaRadios) {
                        tension++;
                    }
                }
            }
            
            System.out.println(tension);
        }
    }
}

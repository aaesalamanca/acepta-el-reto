
import java.util.Scanner;

/**
 *
 * @author aaestornell.
 */
public class V5545AhorrandoFuerzas {

    /* Clase. */
    // Métodos.
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {
            int distancia = scan.nextInt();
            int numCoches = scan.nextInt();
            int tiempoMasRapido = Integer.MAX_VALUE;

            for (int cont = 0; cont < numCoches; cont++) {
                int inicio = scan.nextInt();
                int velocidad = scan.nextInt();

                if (inicio > -1) {
                    int tiempo = (distancia / velocidad) + inicio;

                    if (tiempo < tiempoMasRapido) {
                        tiempoMasRapido = tiempo;
                    }
                }
            }

            System.out.println(tiempoMasRapido);
        }
    }
}

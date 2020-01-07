
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author aaestornell.
 */
public class V5542LaTiaManuela {

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
            String[] aEntrada = br.readLine().split(" ");

            ArrayList<Integer> alJuguete = new ArrayList<>();
            ArrayList<Integer> alCaja = new ArrayList<>();

            for (int cont = 0; cont < 3; cont++) {
                alJuguete.add(Integer.valueOf(aEntrada[cont]));
                alCaja.add(Integer.valueOf(aEntrada[cont + 3]));
            }

            Collections.sort(alJuguete);
            Collections.sort(alCaja);

            boolean sirve = true;
            for (int cont = 0; cont < 3; cont++) {
                if (alJuguete.get(cont) >= alCaja.get(cont)) {
                    sirve = false;
                    break;
                }
            }

            System.out.println(sirve == true ? "SIRVE" : "NO SIRVE");
        }
    }
}

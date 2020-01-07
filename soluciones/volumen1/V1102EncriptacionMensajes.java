
/* ***** Importaciones. ***** */
import java.util.Scanner;

/**
 * Clase V1102EncriptacionMensajes.
 * 
 * @author aaestornell.
 */
public class V1102EncriptacionMensajes {
    
    /* ***** Static. ***** */
    /**
     * Implementa el algoritmo para el problema de la encriptación de mensajes.
     * 
     * @param args -- Parámetros desde la línea de comandos.
     */
    public static void main(String[] args) {
        String cadena;
        char[] cadenaChar;
        Scanner scan = new Scanner(System.in);
        
        /* Para cada caso. */
        do {
            cadena = scan.nextLine();
            
            int numeroVocales = 0;
            int desplazamiento = ((int) (cadena.charAt(0))) - ((int) 'p');
            cadenaChar = cadena.toCharArray();
            
            if (desplazamiento != 0) {
                /* Control del desplazamiento para que no desborde. */
                while (desplazamiento > 26)
                    desplazamiento -= 26;
                
                /* Desencriptado recorriendo cada carácter. */
                for (int caracter = 1; caracter < cadenaChar.length; caracter++) {
                    
                    /* Si es mayúscula. */
                    if (((((int) cadenaChar[caracter]) > 64) && (((int) cadenaChar[caracter]) < 91))) {
                        int diferencia;
                        
                        /* Si no desborda. */
                        if ((((((int) cadenaChar[caracter]) - desplazamiento) > 64) && ((((int) cadenaChar[caracter]) - desplazamiento) < 91)))
                            cadenaChar[caracter] = (char) (((int) cadenaChar[caracter]) - desplazamiento);
                        /* Si desborda por la izquierda. */
                        else if ((((int) cadenaChar[caracter]) - desplazamiento) < 65) {
                            diferencia = ((int) cadenaChar[caracter]) - 65;
                            
                            cadenaChar[caracter] = (char) (91 - desplazamiento + diferencia);
                        }
                        /* Si desborda por la derecha. */
                        else if((((int) cadenaChar[caracter]) - desplazamiento) > 90) {
                            diferencia = 90 - ((int) cadenaChar[caracter]);
                            
                            cadenaChar[caracter] = (char) (64 - desplazamiento - diferencia);
                        }
                    }
                    /* Si es minúscula. */
                    else if ((((int) cadenaChar[caracter]) > 96) && (((int) cadenaChar[caracter]) < 123)) {
                        int diferencia;
                        
                        /* Si no desborda. */
                        if (((((int) cadenaChar[caracter]) - desplazamiento) > 96) && ((((int) cadenaChar[caracter]) - desplazamiento) < 123))
                            cadenaChar[caracter] = (char) (((int) cadenaChar[caracter]) - desplazamiento);
                        /* Si desborda por la izquierda. */
                        else if ((((int) cadenaChar[caracter]) - desplazamiento) < 97) {
                            diferencia = ((int) cadenaChar[caracter]) - 97;
                            
                            cadenaChar[caracter] = (char) (123 - desplazamiento + diferencia);
                        }
                        /* Si desborda por la derecha. */
                        else if((((int) cadenaChar[caracter]) - desplazamiento) > 122) {
                            diferencia = 122 - ((int) cadenaChar[caracter]);
                            
                            cadenaChar[caracter] = (char) (96 - desplazamiento - diferencia);  
                        }
                    }
                }
                
                cadena = String.valueOf(cadenaChar);
            }
            
            /* Recuento de vocales. */
            for (int caracter = 1; caracter < cadenaChar.length; caracter++) {
                switch (cadenaChar[caracter]) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        numeroVocales++;
                        break;
                    }
            }
            
            cadena = cadena.substring(1, cadena.length());
            
            if (cadena.equals("FIN"))
                break;
            
            System.out.println(numeroVocales);
        }
        while (true);
    }
}

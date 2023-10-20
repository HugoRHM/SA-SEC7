// Hugo Ricardo Hernández Montejano 
// Revisado por los Mictlanes
// Califican: 5 
package org.generation.otros7;
// Se importaron scann y hashmap
// Se cambiaron varios errores de sintaxis
// Se corrigieron los system.out.print
//Se cambia la asignacion de las capitales 
import java.util.Scanner;
import java.util.HashMap;

public class Otros7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> capitales = new HashMap<>();

        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "México DF");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        capitales.put("El Salvador", "San Salvador");
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Panamá");

        String pais = "";
        do {
            System.out.print("Escribe el nombre de un país y te diré su capital (o escribe 'salir' para salir): ");
            pais = s.nextLine();

            if (!pais.equals("salir")) {
                if (capitales.containsKey(pais)) {
                    System.out.println("La capital de " + pais + " es " + capitales.get(pais));
                } else {
                    System.out.print("No conozco la respuesta. ¿Cuál es la capital de " + pais + "?: ");
                    String capital = s.nextLine();
                    capitales.put(pais, capital);
                    System.out.println("Gracias por enseñarme nuevas capitales.");
                }
            }
        } while (!pais.equals("salir"));
    }
}

/* importe lo que necesite */
import java.util.Scanner;

public class CategoryUserInterface {

    public static void main (String[] args) {
        /* implement me */
        Categories categorias = new Categories();
        Scanner lector = new Scanner(System.in);
        int contExitos = 0;
        int contAntes = 0;

        while (contExitos < 8) {
            System.out.print("Ingrese algo: ");
            String entrada = lector.nextLine();
            categorias.classify(entrada);
            int contDespues = categorias.getCounter();
            if (contDespues > contAntes) {
                contExitos = contExitos + 1;
                contAntes = contDespues;
            }
        }

        System.out.println("--- CATEGORÍAS ---");
        categorias.countByCategory();

        System.out.println("--- MAILS ---");
        categorias.printMails();

        System.out.println("--- PHONES ---");
        categorias.printPhones();

        System.out.println("--- DATES ---");
        categorias.printDates();
    }
}
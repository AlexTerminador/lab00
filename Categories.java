/* importe lo que necesite */
import java.util.Hashtable;
import java.util.LinkedList;

public class Categories {
    /* un par de campos */
    private Hashtable tabla;
    private int contador;

    /* un constructor */
    public Categories() {
        tabla = new Hashtable();
        contador = 0;
    }

    /* y algunos métodos */
    void classify (String input) {
        /* implement me */
        if (input == null) {
            return;
        }

        if (input.matches("^[\\w.]+@[\\w.]+\\.[a-z]{2,3}(\\.[a-z]{2})?$")) {
            if (tabla.containsKey("mail")) {
                LinkedList lista = (LinkedList) tabla.get("mail");
                lista.add(input);
            } else {
                LinkedList nueva = new LinkedList();
                nueva.add(input);
                tabla.put("mail", nueva);
            }
            contador = contador + 1;
            return;
        }

        if (input.matches("^\\+502 \\d{4} \\d{4}$") || input.matches("^\\d{4}-\\d{4}$")) {
            if (tabla.containsKey("phone")) {
                LinkedList lista = (LinkedList) tabla.get("phone");
                lista.add(input);
            } else {
                LinkedList nueva = new LinkedList();
                nueva.add(input);
                tabla.put("phone", nueva);
            }
            contador = contador + 1;
            return;
        }

        if (input.matches("^\\d{2}[-/]\\d{2}[-/]\\d{4}$")) {
            if (tabla.containsKey("date")) {
                LinkedList lista = (LinkedList) tabla.get("date");
                lista.add(input);
            } else {
                LinkedList nueva = new LinkedList();
                nueva.add(input);
                tabla.put("date", nueva);
            }
            contador = contador + 1;
            return;
        }
    }

    void printMails () {
        /* implement me */
        if (tabla.containsKey("mail")) {
            LinkedList lista = (LinkedList) tabla.get("mail");
            int tamanio = lista.size();
            for (int reemp = 0; reemp < tamanio - 1; reemp = reemp + 1) {
                for (int gener = 0; gener < tamanio - 1 - reemp; gener = gener + 1) {
                    String actual = (String) lista.get(gener);
                    String siguiente = (String) lista.get(gener + 1);
                    if (actual.compareTo(siguiente) > 0) {
                        lista.set(gener, siguiente);
                        lista.set(gener + 1, actual);
                    }
                }
            }
            for (int reemp = 0; reemp < tamanio; reemp = reemp + 1) {
                System.out.println(lista.get(reemp));
            }
        } else {
            System.out.println("NO MAILS");
        }
    }

    void printPhones () {
        /* implement me */
        if (tabla.containsKey("phone")) {
            LinkedList lista = (LinkedList) tabla.get("phone");
            int tamanio = lista.size();
            for (int reemp = 0; reemp < tamanio - 1; reemp = reemp + 1) {
                for (int gener = 0; gener < tamanio - 1 - reemp; gener = gener + 1) {
                    String actual = (String) lista.get(gener);
                    String siguiente = (String) lista.get(gener + 1);
                    if (actual.compareTo(siguiente) > 0) {
                        lista.set(gener, siguiente);
                        lista.set(gener + 1, actual);
                    }
                }
            }
            for (int reemp = 0; reemp < tamanio; reemp = reemp + 1) {
                System.out.println(lista.get(reemp));
            }
        } else {
            System.out.println("NO PHONES");
        }
    }

    void printDates () {
        /* implement me */
        if (tabla.containsKey("date")) {
            LinkedList lista = (LinkedList) tabla.get("date");
            int tamanio = lista.size();
            for (int reemp = 0; reemp < tamanio - 1; reemp = reemp + 1) {
                for (int gener = 0; gener < tamanio - 1 - reemp; gener = gener + 1) {
                    String actual = (String) lista.get(gener);
                    String siguiente = (String) lista.get(gener + 1);
                    if (actual.compareTo(siguiente) > 0) {
                        lista.set(gener, siguiente);
                        lista.set(gener + 1, actual);
                    }
                }
            }
            for (int reemp = 0; reemp < tamanio; reemp = reemp + 1) {
                System.out.println(lista.get(reemp));
            }
        } else {
            System.out.println("NO DATES");
        }
    }

    void countByCategory () {
        /* implement me */
        System.out.println("+--------+-------+");
        System.out.println("| key    | count |");
        System.out.println("+--------+-------+");

        String[] claves = {"mail", "phone", "date"};
        for (int reemp = 0; reemp < claves.length; reemp = reemp + 1) {
            String clave = claves[reemp];
            int cantidad = 0;
            if (tabla.containsKey(clave)) {
                LinkedList lista = (LinkedList) tabla.get(clave);
                cantidad = lista.size();
            }
            System.out.print("| ");
            System.out.print(clave);
            int espacios = 6 - clave.length();
            for (int gener = 0; gener < espacios; gener = gener + 1) {
                System.out.print(" ");
            }
            System.out.print(" | ");
            String numStr = String.valueOf(cantidad);
            int espaciosNum = 5 - numStr.length();
            for (int gener = 0; gener < espaciosNum; gener = gener + 1) {
                System.out.print(" ");
            }
            System.out.print(numStr);
            System.out.println(" |");
        }
        System.out.println("+--------+-------+");
    }

    // Método añadido para que CategoryUserInterface pueda leer el contador
    public int getCounter() {
        return contador;
    }
}
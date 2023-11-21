import java.util.Scanner;

public class admin {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Scanner leer_tarea = new Scanner(System.in);
        Scanner leer_driver = new Scanner(System.in);
        Scanner leer_ruta = new Scanner(System.in);

        System.out.println("Flota de vehiculos");
        System.out.println(" ");
        System.out.println("Bienvenido a la flota de camiones por favor rellene los espacios en blanco" +
                "\nen su totalidad para poder imprimir las tareas de cada vehiculo" +
                "\n");

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Digite el #️⃣ numero de vehiculos que quiere Ingresar : ");
        int nv = leer.nextInt();
        System.out.println("--------------------------------------------------------------------------------------");

        String[] placa = new String[nv];
        String[] marca = new String[nv];
        String[] modelo = new String[nv];
        String[] work = new String[nv];

        int[] cars = new int[nv];
        int[] action = new int[nv];

        String[] driver = new String[nv];
        String[] cel = new String[nv];
        String[] id = new String[nv];

        String[] ubicacion = new String[nv];
        String[] ruta = new String[nv];

        for (int i = 0; i < cars.length; i++) {

            System.out
                    .println("--------------------------------------------------------------------------------------");
            System.out.println("");

            System.out
                    .println("--------------------------------------------------------------------------------------");
            System.out.println("Vehiculo " + (i + 1));
            System.out
                    .println("--------------------------------------------------------------------------------------");

            System.out
                    .println("--------------------------------------------------------------------------------------");
            System.out.println("Conductor " + (i + 1));
            System.out
                    .println("--------------------------------------------------------------------------------------");

            // Arreglo Nombre del Conductor

            System.out.println("Digite el nombre del Conductor= ");
            driver[i] = leer_driver.next();
            System.out.println("");

            // Arreglo Celular

            System.out.print("Digite el 🔢 celular de " + driver[i] + " = ");
            cel[i] = leer_driver.next();
            System.out.println("");

            // Arreglo Id

            System.out.print("Digite el 🔢 numero de identidad  de " + driver[i] + " = ");
            id[i] = leer_driver.next();
            System.out.println("");

            System.out
                    .println("--------------------------------------------------------------------------------------");
            System.out.println("Ruta " + (i + 1));
            System.out
                    .println("--------------------------------------------------------------------------------------");

            // Arreglo Ubicacion actual

            System.out.println("Digite su ubicacion 📍 actual del Vehiculo " + (i + 1) + " =");
            ubicacion[i] = leer_ruta.next();
            System.out.println("");

            // Arreglo Ruta

            System.out.print("Digite la ruta 📍 a la que se dirige el Vehiculo " + (i + 1) + " =");
            ruta[i] = leer_ruta.next();
            System.out.println("");

            System.out
                    .println("--------------------------------------------------------------------------------------");
            System.out.println("Caracteristicas de Vehiculo " + (i + 1));
            System.out
                    .println("--------------------------------------------------------------------------------------");

            leer.nextLine();
            System.out.println("\nDigite las caracteristicas del Vehiculo " + (i + 1) + " :");
            System.out.println("\nDigite la marca del vehiculo: ");
            marca[i] = leer.nextLine();
            System.out.println("\nDigite el modelo del vehiculo: ");
            modelo[i] = leer.nextLine();
            System.out.println("\nDigite la placa del vehiculo: ");
            placa[i] = leer.nextLine();

            System.out
                    .println("--------------------------------------------------------------------------------------");
            System.out.println("Tareas del Vehiculo " + (i + 1));
            System.out
                    .println("--------------------------------------------------------------------------------------");
            /* leer.nextLine(); */
            System.out.println("Digite el numero 🔢 de tareas que quiere Ingresar");
            int nt = leer.nextInt();
            tarea tareas[] = new tarea[nt];

            for (int j = 0; j < tareas.length; j++) {

                System.out.println(
                        "--------------------------------------------------------------------------------------");
                System.out.println("\nDigite las caracteristicas de la tarea " + (j + 1) + " :");
                System.out.println("\nDigite la tarea que necesita: ");
                work[j] = leer_tarea.nextLine();
                System.out.println(
                        "\n--------------------------------------------------------------------------------------");

            }

        }

        for (int i = 0; i < cars.length; i++) {

            Persona misPersonas[] = new Persona[1];
            misPersonas[0] = new Persona(driver[i], cel[i], id[i]);

            System.out
                    .println("--------------------------------------------------------------------------------------");
            System.out.println("Vehiculo " + (i + 1));
            System.out.println(
                    "\n--------------------------------------------------------------------------------------");

            for (Persona Personas : misPersonas) {
                System.out.println(Personas.mostrarPersona());

                gps misgps[] = new gps[1];
                misgps[0] = new gps(ubicacion[i], ruta[i]);

                for (gps Gps : misgps) {
                    System.out.println(Gps.mostrarGps());
                }

                car misCars[] = new car[1];
                misCars[0] = new car(placa[i], marca[i], modelo[i]);

                for (car carros : misCars) {
                    System.out.println(carros.mostrarCarros());
                }
            }

            for (int j = 0; j < action.length; j++) {

                tarea mistareas[] = new tarea[1];
                mistareas[0] = new tarea(work[j]);

                for (tarea tareas : mistareas) {
                    System.out.println(tareas.mostrartarea());
                }

            }
            System.out.println(
                    "\n--------------------------------------------------------------------------------------");
        }
    }
}

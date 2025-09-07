import java.util.Scanner;

public class gestionPlayerasTest {
    gestionPlayeras gp;
    String talla;
    String tipo;
    int opcion;

    public gestionPlayerasTest() {
        gp = new gestionPlayeras();
        inscribirCliente();
    }

    public void inscribirCliente() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inscribir cliente\n");
        System.out.println("Ingresa el nombre completo del cliente (empezando por el primer nombre):");
        String nombre = sc.nextLine();
        do {
            System.out.println("Ingresa la talla del cliente:");
            System.out.println("1) XS");
            System.out.println("2) S");
            System.out.println("3) M");
            System.out.println("4) L");
            System.out.println("5) XL");
            System.out.println("6) XXL");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    talla = "XS";
                    break;
                case 2:
                    talla = "S";
                    break;
                case 3:
                    talla = "M";
                    break;
                case 4:
                    talla = "L";
                    break;
                case 5:
                    talla = "XL";
                    break;
                case 6:
                    talla = "XXL";
                    break;
                default:
                    System.out.println("Opcion no valida");
                    opcion = 0;
            }

        } while (opcion == 0);

        tipo = tipoDePlayera();
        float cantidad = ingresarPago();
        Cliente cliente = new Cliente(nombre, talla, tipo, cantidad);
        gp.agregarCliente(cliente);
    }

    public  String tipoDePlayera(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el corte de la playera: (Hombre o Mujer) ");
        String tipo = sc.nextLine();
        return tipo;
    }

    public float ingresarPago(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad abonada: ");
        return (float) sc.nextInt();
    }
}

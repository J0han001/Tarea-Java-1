import java.util.Scanner;
/**
 * @author [Johan David Murillo Solano]
 */
public class JavaTraduccion8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String contraseña;

        System.out.print("Ingrese la contrasenia: ");
        contraseña = sc.nextLine();

        while (!contraseña .equals("java2026")) {
            System.out.print("Contrasenia incorrecta. Intente nuevamente: ");
            contraseña = sc.nextLine();
        }

        System.out.println("Acceso concedido.");

    }
}
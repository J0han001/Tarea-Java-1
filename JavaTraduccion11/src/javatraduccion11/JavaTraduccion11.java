import java.util.Scanner;
/**
 * @author [Johan David Murillo Solano]
 */
public class JavaTraduccion11 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int mayor;
        int menor;

        System.out.print("Ingrese numero 1: ");
        numero = sc.nextInt();

        mayor = numero;
        menor = numero;

        for (int i = 2; i <= 10; i++) {

            System.out.print("Ingrese numero " + i + ": ");
            numero = sc.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);

    }
}

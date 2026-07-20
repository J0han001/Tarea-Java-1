import java.util.Scanner;
/**
 * @author [Johan David Murillo Solano]
 */
public class JavaTraduccion4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nota;
        
        System.out.print("Ingrese su nota: ");
        nota = sc.nextInt();
        
        if(nota >= 7){
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
        
    }
}
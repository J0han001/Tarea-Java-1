import java.util.Scanner;
/**
 * @author [Johan David Murillo Solano]
 */
public class JavaTraduccion6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int opcion;
        
        System.out.println("Ingrese un numero del 1 al 7");
        opcion = sc.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Invalido");
                break;     
        }
        
    }
}
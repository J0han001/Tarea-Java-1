import java.util.Scanner;
/**
 * @author [Johan David Murillo Solano]
 */
public class JavaTraduccion5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double nota;
        
        System.out.print("Ingrese su calificacion:");
        nota = sc.nextDouble();
        
        if (nota >= 9 && nota <= 10){
            System.out.println("Excelente");       
        } if (nota >= 8 && nota <9){
            System.out.println("Muy Bueno");
        } if (nota >= 7 && nota < 8){
            System.out.println("Bueno");
        } if (nota >= 5 && nota < 7){
            System.out.println("Regular");
        } if (nota < 5){
            System.out.println("Deficiente");
        }

    }
}
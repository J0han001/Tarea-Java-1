import java.util.Scanner;
/**
 * @author [Johan David Murillo Solano]
 */
public class JavaTraduccion2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
            int num1;
            int num2;
        
            System.out.print("Imgrese primer numero: ");
            num1 = sc.nextInt();
            System.out.print("Ingrese segundo numero: ");
            num2 = sc.nextInt();
        
            System.out.println("Suma: " + (num1 + num2));
            System.out.println("Resta: " + (num1 - num2));
            System.out.println("Multiplicacion: " + (num1 * num2));
            System.out.println("Division: " + (num1 / num2));
            System.out.println("Residuo: " + (num1 % num2));
            
    }    
}
        

               

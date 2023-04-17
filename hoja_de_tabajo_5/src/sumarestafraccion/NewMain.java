package sumarestafraccion;
import java.util.Scanner;
public class NewMain {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        System.out.println("ingrese 4 numeros\n ingrese el primero");
        float primero =sc.nextFloat();
        System.out.println("ingrese el segundo");
        float segundo =sc.nextFloat();
        System.out.println("ingrese el tercero");
        float tercero =sc.nextFloat();
        System.out.println("ingrese el cuarto");
        float cuarto =sc.nextFloat();
        
        float suna=primero+segundo;
        float multiplicacion = tercero * cuarto;
        
        System.out.println("la suma de los dos primeros numeros es: " + suna + "\nLa multiplicación es:"+ multiplicacion);
        
    }
    
}

package por.defecto;
import java.text.*;
import java.util.Locale;
import java.util.Scanner;

public class OutputVariable {
    public static void main(String[] args) {
        long numero = 123098;
        double pi = Math.PI;
        String status = "";
        int grade = 8;
        
        System.out.printf("%d %n", numero);
        System.out.printf("%08d %n", numero);
        System.out.printf("%+d %n", numero);
        Locale.setDefault(Locale.US);
        DecimalFormat formato1 = new DecimalFormat("###,###.##");
        String valorFormateado1 = formato1.format(numero);
        System.out.printf("%s %n", valorFormateado1);

        System.out.println("Manejo de operador condicional");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de status: ");
       
        status = scanner.nextLine(); 
        scanner.close();

        System.out.println("El status ingresado es: " + status);
    }
}

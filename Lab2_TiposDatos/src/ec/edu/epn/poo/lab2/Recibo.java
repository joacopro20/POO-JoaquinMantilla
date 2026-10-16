package ec.edu.epn.poo.lab2;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Recibo {

	public Recibo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final double IVA = 0.15;                 // IVA de Ecuador
	        Scanner sc = new Scanner(System.in);
	        sc.useLocale(Locale.US);
	 
	        System.out.print("Producto: ");
	        String producto = sc.nextLine();
	        System.out.print("Cantidad: ");
	        int cantidad = sc.nextInt();
	        System.out.print("Precio unitario: ");
	        double precio = sc.nextDouble();
	 
	        double subtotal = cantidad * precio;
	        double iva = subtotal * IVA;
	        double total = subtotal + iva;
	 
	        System.out.println();
	        System.out.println("=========== RECIBO ===========");
	        System.out.printf(Locale.US, "%-14s %4s %10s%n",
	                "Producto", "Cant", "Subtotal");
	        System.out.printf(Locale.US, "%-14.14s %4d %10.2f%n",
	                producto, cantidad, subtotal);
	        System.out.println("------------------------------");
	        System.out.printf(Locale.US, "%-19s %10.2f%n", "IVA 15 %", iva);
	        System.out.printf(Locale.US, "%-19s %10.2f%n", "TOTAL", total);
	 
	        NumberFormat moneda = NumberFormat.getCurrencyInstance(Locale.US);
	        System.out.println("Total a pagar: " + moneda.format(total));
	        sc.close();

	}

}

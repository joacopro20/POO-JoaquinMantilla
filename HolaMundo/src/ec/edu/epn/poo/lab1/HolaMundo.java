package ec.edu.epn.poo.lab1;

public class HolaMundo {
 
	public static void main (String[] args) {
		long startTime = System.nanoTime();
		System.out.println("Hola Mundo");
		long endTime = System.nanoTime();
		long durationNs = endTime - startTime; 
        System.out.println("Tiempo de ejecución: " + durationNs + " ns");
		}
		
}
	
	

package prueba.antes.de.la.prueba.xd;

import java.util.Scanner;

public class Repaso {

	public Repaso() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Edad: ");
		int edad = sc.nextInt();
		sc.nextLine();
		System.out.println("Nombre: ");
		String nom = sc.nextLine();
		System.out.printf("Edad: " + "%05d" + " Nombre: " + "%s", edad, nom);
		sc.close();
	}

}

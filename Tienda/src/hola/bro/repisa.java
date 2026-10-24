package hola.bro;

public class repisa {

	public repisa() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = new Producto();
		p1.nombre = "hola";
		p1.stock = 10;
		System.out.println("Producto " + "\tStock");
		System.out.printf("%s " + "\t%10d", p1.nombre, p1.stock);
	}

}

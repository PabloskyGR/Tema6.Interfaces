package ejercicio02;

public class Futbolista implements Comparable<Futbolista> {

	private String nombre;
	private int edad;
	private int numeroCamiseta;
	private int numeroGoles;

	public Futbolista(String nombre, int edad, int numeroCamiseta, int numeroGoles) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (edad > 0) {
			this.edad = edad;
		}
		if (numeroCamiseta > 0) {
			this.numeroCamiseta = numeroCamiseta;
		}
		if (numeroGoles > 0) {
			this.numeroGoles = numeroGoles;
		}
	}

	@Override
	public String toString() {
		String res = "";

		res += "Nombre: " + this.nombre + "\n";
		res += "Edad: " + this.edad + "\n";
		res += "Nº Camiseta: " + this.numeroCamiseta + "\n";
		res += "Nº Goles: " + this.numeroGoles + "\n";

		return res;
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Futbolista fut = (Futbolista) obj;

		if (this.nombre.equals(fut.nombre) && this.numeroGoles == fut.numeroGoles) {
			iguales = true;
		}

		return iguales;
	}

	@Override
	public int compareTo(Futbolista fut) {
		int res = 0;

		if (this.numeroCamiseta < fut.numeroCamiseta) {
			res = -1;
		} else if (this.numeroCamiseta > fut.numeroCamiseta) {
			res = 1;
		} else {
			res = this.nombre.compareTo(fut.nombre);
		}

		return res;
	}

}

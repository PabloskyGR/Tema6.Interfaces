package ejercicio01;

public class Socio implements Comparable<Socio> {

	private int id;
	private String nombre = "";
	private int edad;

	public Socio(int id, String nombre, int edad) {
		if (id > 0) {
			this.id = id;
		}
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (edad > 0) {
			this.edad = edad;
		}
	}

	public String toString() {
		String res = "";

		res += "\nNombre: " + this.nombre + "\n";
		res += "Edad: " + this.edad + "\n";
		res += "Id: " + this.id + "\n";

		return res;
	}

	@Override
	public int compareTo(Socio o) {
		int res = 0;

		if (this.id < o.id) {
			res = -1;
		} else if (this.id > o.id) {
			res = 1;
		}

		return res;
	}

}

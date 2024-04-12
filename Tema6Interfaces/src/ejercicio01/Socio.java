package ejercicio01;

public class Socio implements Comparable<Object> {

	private int id;
	private String nombre;
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

		res += "Nombre: " + this.nombre + "\n";
		res += "Edad: " + this.edad + "\n";
		res += "Id: " + this.id + "\n";

		return res;
	}

	public int compareTo(Object obj) {
		int res = 0;
		Socio soc = (Socio) obj;

		if (this.id < soc.id) {
			res = -1;
		} else if (this.id > soc.id) {
			res = 1;
		}

		return res;
	}

}

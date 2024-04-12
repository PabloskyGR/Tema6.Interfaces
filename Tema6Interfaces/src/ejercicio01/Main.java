package ejercicio01;

public class Main {

	public static void main(String[] args) {

		Socio soc1 = new Socio(1, "Pablo", 21);
		Socio soc2 = new Socio(2, "Juanma", 20);
		Socio soc3 = new Socio(3, "Mati", 20);
		Socio soc4 = new Socio(4, "Yeray", 19);

		int resultado;

		System.out.println("--------Funcionamiento compareTo--------");

		resultado = soc1.compareTo(soc2);
		System.out.println(resultado);

		resultado = soc4.compareTo(soc3);
		System.out.println(resultado);

	}

}

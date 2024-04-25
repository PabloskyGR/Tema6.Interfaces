package ejercicio01;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Socio[] socios = new Socio[4];

		Socio soc1 = new Socio(1, "Pablo", 21);
		Socio soc2 = new Socio(2, "Juanma", 20);
		Socio soc3 = new Socio(3, "Mati", 20);
		Socio soc4 = new Socio(4, "Yeray", 19);

		System.out.println(soc1.compareTo(soc4));
		System.out.println(soc2.compareTo(soc1));
		System.out.println(soc3.compareTo(soc3));
		System.out.println(soc4.compareTo(soc2));
		
		socios[0] = soc4;
		socios[1] = soc2;
		socios[2] = soc1;
		socios[3] = soc3;
		
		Arrays.sort(socios);
		System.out.println(Arrays.toString(socios));

	}

}

package ejercicio02;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Futbolista[] futbolistas = new Futbolista[5];

		// Crear los futbolistas
		futbolistas[0] = new Futbolista("Messi", 35, 10, 750);
		futbolistas[1] = new Futbolista("Cristiano Ronaldo", 38, 7, 780);
		futbolistas[2] = new Futbolista("Neymar Jr", 30, 11, 400);
		futbolistas[3] = new Futbolista("Robert Lewandowski", 32, 9, 550);
		futbolistas[4] = new Futbolista("Kylian Mbappé", 23, 7, 300);

		// Ordenar los futbolistas
		Arrays.sort(futbolistas);

		// Mostrar los futbolistas ordenados
		for (Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}

	}

}

package ejercicio03;

public abstract class AnimalDomestico implements Animal {

	private String nombre = "";
	private String raza = "";
	private double peso;
	private String color = "";

	@Override
	public void comer() {
		this.peso += 0.1;
	}

	@Override
	public void dormir() {
		System.out.println("ZzZz");
	}

	@Override
	public abstract void hacerRuido();

	public void vacunar() {
		System.out.println("Vacunado");

	}

	public abstract boolean hacerCaso();
}

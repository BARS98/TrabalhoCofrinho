package uninter;

public abstract class Moeda {
	protected double dolar = 5.32;
	protected double euro = 5.50;
	double valor;

	public Moeda(double valor) {
		this.valor = valor;
	}
	
	public abstract void info();
	public abstract double converter();

}

package uninter;

public class Dolar extends Moeda{

	public Dolar(double dolar) {
		super(dolar);
			}

	public void info() {
		System.out.println("Dolar - US$");
		System.out.println("Cotação para Real = 5.32R$");
		System.out.println("Cotação para Euro = 0.97€$");
		
		}

	@Override
	public double converter() {
		return valor * dolar;

		
	}
	

	
}

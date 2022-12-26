package uninter;

public class Euro extends Moeda{
	
	public Euro(double euro) {
		super(euro);
			}

	public void info() {
		System.out.println("Euro - €$");
		System.out.println("Cotação para Real = 5.50R$");
		System.out.println("Cotação para Dolar = 1.03US$");
	
		}

	@Override
	public double converter() {
		return valor * euro;


	}

	
}

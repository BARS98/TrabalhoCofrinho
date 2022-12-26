package uninter;

public class Real extends Moeda{


	public Real(double reais) {
		super(reais);
		}



	public void info() {
		System.out.println("Real - R$");
		System.out.println("Cotação para Dolar = 0.19US$");
		System.out.println("Cotação para Euro = 0.18€$");

	}

	@Override
	public double converter() {
		return valor;
		
  }
	
	

}
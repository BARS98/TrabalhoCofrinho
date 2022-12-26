package uninter;

import java.util.ArrayList;

public class Cofrinho {

	private double total = 0; // atributo para calcular total da conversão
			double cal; // atribulo para somar e subtrair moedas do array
			
	private ArrayList<Double> listaMoedas = new ArrayList<Double>();
	
	public Cofrinho() {
		listaMoedas.add(0.0);	//INDICE 0 - real
		listaMoedas.add(0.0);	//INDICE 1 - dolar 
		listaMoedas.add(0.0);	//INDICE 2 - euro
	}

	public void adicionar(Moeda mod) {
		String className = mod.getClass().getSimpleName(); // criei este getClass para poder diferenciar +
		switch(className) {                                // qual moeda somar no array.
		
		case "Real" :
			cal = mod.valor + listaMoedas.get(0); // usando index para somar valor adicionado com o valor +
			listaMoedas.set(0, cal); 			  // dentro do array.
				break;
		case "Dolar":
			cal = mod.valor + listaMoedas.get(1);
			listaMoedas.set(1, cal);
				break;
		case "Euro":
			cal = mod.valor + listaMoedas.get(2);
			listaMoedas.set(2, cal);
				break;
		}
		
	}
	
	public void remover(Moeda mod) {
		String className = mod.getClass().getSimpleName();
		switch(className) {
		
		case "Real" :
			cal = listaMoedas.get(0) - mod.valor;// usando index para subtrair o valor adicionado com o valor +
			listaMoedas.set(0, cal); // dentro do array
				break; 
			
		case "Dolar":
			cal = listaMoedas.get(1) - mod.valor;
			listaMoedas.set(1, cal);
				break;
			
		case "Euro":
			cal = listaMoedas.get(2) - mod.valor;
			listaMoedas.set(2, cal);
				break;
		}
	}
	
	public void listagemMoedas() {		//index sendo usado para listar as moedas.
		System.out.println("Real = " + listaMoedas.get(0));
		System.out.println("Dolar = " + listaMoedas.get(1));
		System.out.println("Euro = " + listaMoedas.get(2));
		
	}
	

	
	public void totalConvertido() { 			//foi criado atribulos referenciando as classes filhas de moeda +  
		Real r = new Real(listaMoedas.get(0));  //para poder usar o metodo converter delas.
		Dolar d = new Dolar(listaMoedas.get(1));
		Euro e = new Euro(listaMoedas.get(2));
		
		total = r.converter() + d.converter() + e.converter();
				
		System.out.println("Total = R$" + total);
		
	}
	
}

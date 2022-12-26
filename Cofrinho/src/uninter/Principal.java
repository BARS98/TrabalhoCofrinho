package uninter;

import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
				Real r = new Real(0);	//atributos criados para instanciar o metodo info das classes filhas +
				Dolar d = new Dolar(0); // da classe Moeda
				Euro e = new Euro(0);
			try (Scanner teclado = new Scanner(System.in)) {
				System.out.println("Bem-vindo ao cofrinho do Breno Alves Rodrigues da Silva - RU 3991071.");
				System.out.println("Escolha a opção desejada:\n[1] - Adicione moedas\n[2] - Remover moedas\n"
									+ "[3] - Listar todas as moedas\n[4] - Valor total em Real\n"
									+ "[5] - Informações sobre moeda\n[6] - Encerrar\n ");
	
				int tipoMod, menu; // atributo usado para escolher tipo de moede
				double reais, dolar, euro;
				Moeda Mod;
				
				Cofrinho cofre = new Cofrinho();
				menu = teclado.nextInt();
				while(menu != 6) {
					
				switch(menu) {
					
				case 1:
					tipoMod=0;
					while(tipoMod>3 || tipoMod<=0) {
						System.out.println("Qual moeda deseja adicionar?");
						System.out.println("1-Real");
						System.out.println("2-Dolar");
						System.out.println("3-Euro");
						tipoMod = teclado.nextInt();
					}
				

					if(tipoMod==1) {
						System.out.println("Quantos Reais?");
						reais = teclado.nextDouble();
						Mod = new Real(reais);  // aqui depois de receber o valor pelo input, mod vira instanciaçao de real + 
						cofre.adicionar(Mod);   // que obtem reais como parametro.
					}
					else if(tipoMod==2) {
						System.out.println("Quantos Dolares?");
						dolar = teclado.nextDouble();
						Mod = new Dolar(dolar);
						cofre.adicionar(Mod);
					}
					else {
						System.out.println("Quantos Euros?");
						 euro = teclado.nextDouble();
						Mod = new Euro(euro);
						cofre.adicionar(Mod);
					}
					System.out.println("Valor adicionado!");
					break;
				case 2:
					tipoMod=0;
					while(tipoMod>3 || tipoMod<=0) {
						System.out.println("Qual moeda deseja remover?");
						System.out.println("1-Real");
						System.out.println("2-Dolar");
						System.out.println("3-Euro");
						tipoMod = teclado.nextInt();
					}
					
					if(tipoMod==1) {
						System.out.println("Quantos Reais?");
						reais = teclado.nextDouble();
						Mod = new Real(reais);
						cofre.remover(Mod);
					
					}
					else if(tipoMod==2) {
						System.out.println("Quantos Dolares?");
						dolar = teclado.nextDouble();
						Mod = new Dolar(dolar);
						cofre.remover(Mod);
						
					}
					else {
						System.out.println("Quantos Euros?");
						 euro = teclado.nextDouble();
						Mod = new Euro(euro);
						cofre.remover(Mod);
					}
					System.out.println("Valor removido!");
					break;
				case 3:
					System.out.println("Lista de moedas:");
					cofre.listagemMoedas();
					
						break;
						
					case 4:
						System.out.println("Valor total em reais:");
						cofre.totalConvertido();
						break;
						
					case 5:
						r.info();
						System.out.println();
						d.info();
						System.out.println();
						e.info();
						System.out.println();
						break;
					case 6: 
						System.exit(0);

						
					default:
						System.out.print("Opção invalida!");
						
				}	
				System.out.println("Escolha a opção desejada:\n[1] - Adicione moedas\n[2] - Remover moedas\n"
						+ "[3] - Listar todas as moedas\n[4] - Valor total em Real\n"
						+ "[5] - Informações sobre moeda\n[6] - Encerrar\n ");

				menu = teclado.nextInt();
					}
			}
			}
		}

	



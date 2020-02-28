package cl.awakelab.ejecutable;

import cl.awakelab.clases.*;

public class EvaluacionEjecutable {

	public static void main(String[] args) {
		
		Electrodomestico arregloElectro[] = new Electrodomestico[10];
		float valorTotalElectro =0;
		float valorTotalTelevision = 0;
		float valorTotalLavadora = 0;
		
		arregloElectro[0] = new Lavadora();
		arregloElectro[1] = new Lavadora(120000, 40);
		arregloElectro[2] = new Lavadora(200000, "gris", 'c', 35, 15);
		arregloElectro[3] = new Television();
		arregloElectro[4] = new Television(34567, 9);
		arregloElectro[5] = new Television(36842,"azul",'a',34,56,true);
		arregloElectro[6] = new Electrodomestico();
		arregloElectro[7] = new Electrodomestico(85000, 5);
		arregloElectro[8] = new Electrodomestico(55000, "azul", 'b', 8);
		arregloElectro[9] = new Electrodomestico(350000, "rojo", 'e', 35);
		
		
		for (int i=0; i<arregloElectro.length;i++) {
			
			if (arregloElectro[i] instanceof Electrodomestico) {
				valorTotalElectro+=arregloElectro[i].precioFinal();
			}
		}
		
		System.out.println("");
		
		for (int i=0; i<arregloElectro.length;i++) {
			
			if (arregloElectro[i] instanceof Lavadora) {
				System.out.println("El Valor Final de esta lavadora es : $" + arregloElectro[i].precioFinal());
				valorTotalLavadora+=arregloElectro[i].precioFinal();
			}
		}
		
		System.out.println("");
		System.out.println("El valor de todos las Lavadoras es $" + valorTotalLavadora);
		System.out.println("");
		
		for (int i=0; i<arregloElectro.length;i++) {
			
			if (arregloElectro[i] instanceof Television) {
				System.out.println("El Valor Final de esta Television es : $" + arregloElectro[i].precioFinal());
				valorTotalTelevision+=arregloElectro[i].precioFinal();
			}
		}
		System.out.println("");
		System.out.println("El valor de todos los Televisores es $" + valorTotalTelevision);
		System.out.println("");
		System.out.println("El valor de todos los electrodomesticos es $" + valorTotalElectro);
		

	}

}

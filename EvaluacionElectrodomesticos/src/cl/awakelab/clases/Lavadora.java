package cl.awakelab.clases;

/**
 * Clase Lavadora heredada de Electrodomesticos. 
 * Su atributo es carga la cual por defecto se le asignara 
 * un valor de 5 KG 
 * @author Manuel Soto Oyarzo
 *
 */
public class Lavadora extends Electrodomestico {
	
	private final int CARGA_DEFECTO=5;
	
	private int carga;
	
	/**
	 * Constructor por defecto. Utiliza los atributos heredados 
	 * de la superclase Electrodomesticos y se le asigna a su 
	 * atributo propio carga un valor de 5
	 */
	public Lavadora() {
		super();
		this.carga = CARGA_DEFECTO;
	}
	
	/**
	 * Constructor que utiliza como parametros los valores precio 
	 * y peso, asignando por defecto los valores heredados de la 
	 * superclase Electrodomesticos asi tambien el atributo carga 
	 * con valor por defecto
	 * @param precio valor de tipo Float. Define el Precio inicial de la Lavadora
	 * si es menor que cero se asiganara cero como valor al atributo precioBase
	 * @param peso peso valor de tipo int, Define el peso total de la Lavadora
	 * si es menor que cero se asiganara cero como valor al atributo peso
	 */
	public Lavadora(float precio,int peso) {
		super(precio,peso);
		this.carga = CARGA_DEFECTO;
	}
	
	/**
	 * Constructor que utiliza como parametro precio, color, consumo, peso y carga.
	 * @param precio valor de tipo Float. Define el Precio inicial del Electrodomestico
	 * si es menor que cero se asiganara cero como valor al atributo precioBase
	 * @param peso valor de tipo int, Define el pesoTotal del electrodomestico
	 * si es menor que cero se asiganara cero como valor al atributo peso
	 * @param color Valor de tipo String. Define el color del electrodomestico
	 * si el valor ingresado no corresponde a blanco, negro, rojo, azul y gris
	 * se utilizara el valor por defecto blanco
	 * @param consumo valor de tipo char Define el consumo energetico del electrodomestico
	 * si el valor ingresado no esta entre A y F se asignara valor por defecto F
	 * @param carga valor de tipo int. Define la carga que puede utilizar la lavadora
	 */
	public Lavadora (float precio,String color,char consumo,
						int peso,int carga) {
		super(precio,color,consumo,peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}
	
	/**
	 * * Metodo utilizado para reajustar el valor de la Lavadora.
	 * El reajuste se realizara a partir del atributos carga
	 * @return valor de tipo float retorna el precioBase + ajuste segun corresponda 
	 * a los atributos del objeto
	 */
	@Override
	public float precioFinal() {
		float precioRetorno = super.precioFinal();
		
		if ( this.carga>30) {
			precioRetorno+=50;
		}
		return precioRetorno;
	}	
}

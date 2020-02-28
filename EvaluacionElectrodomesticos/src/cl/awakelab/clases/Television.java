package cl.awakelab.clases;

/**
 * Clase Television heredada de Electrodomesticos. 
 * Su atributo es resolucion la cual por defecto se le asignara 
 * un valor de 20 pulgadas y sintonizadorTDT el cual se le asignara 
 * por defecto false 
 * @author Manuel Soto Oyarzo
 *
 */
public class Television extends Electrodomestico {
	
	private int RESOLUCION_DEFECTO = 20;
	private boolean SINTONIZADORTDT_DEFECTO = false;
	
	private int resolucion;
	private boolean sintonizadorTDT;
	
	/**
	 * Constructor por defecto. Utiliza los atributos heredados 
	 * de la superclase Electrodomesticos y se le asigna a su 
	 * atributo propio resolucion un valor de 20 y sintonizadorTDT
	 * un valor de false
	 */
	public Television() {
		super();
		this.resolucion = RESOLUCION_DEFECTO;
		this.sintonizadorTDT = SINTONIZADORTDT_DEFECTO;
	}
	
	/**
	 * Constructor que utiliza como parametros los valores precio 
	 * y peso, asignando por defecto los valores heredados de la 
	 * superclase Electrodomesticos asi tambien el atributo resolucion 
	 * un valor de 20 y sintonizadorTDT un valor de false
	 * @param precio valor de tipo Float. Define el Precio inicial de la Television
	 * si es menor que cero se asiganara cero como valor al atributo precioBase
	 * @param peso peso valor de tipo int, Define el peso total de la Television
	 * si es menor que cero se asiganara cero como valor al atributo peso
	 */
	public Television(float precio,int peso) {
		super(precio,peso);
		this.resolucion = RESOLUCION_DEFECTO;
		this.sintonizadorTDT = SINTONIZADORTDT_DEFECTO;	
	}
	
	/**
	 * Constructor que utiliza como parametro precio, color, consumo, peso y carga.
	 * @param precio valor de tipo Float. Define el Precio inicial de la Television
	 * si es menor que cero se asiganara cero como valor al atributo precioBase
	 * @param peso valor de tipo int, Define el pesoTotal de la Television
	 * si es menor que cero se asiganara cero como valor al atributo peso
	 * @param color Valor de tipo String. Define el color de la Television
	 * si el valor ingresado no corresponde a blanco, negro, rojo, azul y gris
	 * se utilizara el valor por defecto blanco
	 * @param consumo valor de tipo char Define el consumo energetico de la Television
	 * si el valor ingresado no esta entre A y F se asignara valor por defecto F
	 * @param resolucion valor de tipo int. Define la resolucion de la Television
	 * @param sintonizador valor de tipo Boolean. Define si el televisor tiene o no
	 * sintonizadorTDT
	 */
	public Television(float precio,String color,char consumo,
			int peso,int resolucion,boolean sintonizador) {
		super(precio,color,consumo,peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizador;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	/**
	 * * Metodo utilizado para reajustar el valor del Televisor.
	 * El reajuste se realizara a partir del atributos resolucion y sintonizadorTDT
	 * @return valor de tipo float retorna el precioBase + ajuste segun corresponda 
	 * a los atributos del objeto
	 */
	@Override
	public float precioFinal() {
		float precioRetorno = super.precioFinal();
		
		if( this.resolucion>40) {
			precioRetorno*=1.30;
		}
		if( this.sintonizadorTDT) {
			precioRetorno+=50;
		}
		return precioRetorno;
	}
	
}

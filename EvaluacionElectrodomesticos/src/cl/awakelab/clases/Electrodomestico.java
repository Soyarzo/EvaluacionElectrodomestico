package cl.awakelab.clases;
/**
 * Super clase Electrodomesticos.
 * Sus atributos sonprecio base, color, consumoenergético(letras entre A y F) y peso.
 * Por defecto, el color será blanco, el consumo energético será F, 
 * el precioBase es de $100.000y el peso de 5 kg.
 * Los colores disponibles son blanco, negro, rojo, azul y gris. 
 * @author Manuel Soto Oyarzo
 *
 */
public class Electrodomestico {
	
	private final float PRECIO_BASE_DEFECTO = 100000f;
	private final String COLOR_DEFECTO="blanco";
	private final char CONSUMO_ENERGETICO_DEFECTO='f';
	private final int PESO_DEFECTO=5;
	
	
	private float precioBase;
	private String color;
	private char consumoEnergetico;
	private int peso;
	
	/**
	 * Constructor por defectos. ol objeto tomara como valores de atributo:
	 * precioBase = $100.000
	 * color = blanco
	 * consumoEnergetico = f
	 * peso = 5
	 */
	public Electrodomestico() {
		this.precioBase=PRECIO_BASE_DEFECTO;
		this.color=COLOR_DEFECTO;
		this.consumoEnergetico= CONSUMO_ENERGETICO_DEFECTO;
		this.peso=PESO_DEFECTO;	
	}
	/**
	 * constructor que utiliza como parametro precio y peso utilizando por defecto
	 * los valores de consumo energetico
	 * @param precio valor de tipo Float. Define el Precio inicial del Electrodomestico
	 * si es menor que cero se asiganara cero como valor al atributo precioBase
	 * @param peso valor de tipo int, Define el pesoTotal del electrodomestico
	 * si es menor que cero se asiganara cero como valor al atributo peso
	 */
	public Electrodomestico(float precio,int peso) {
		this();
		if (precio<0) {
			this.precioBase = 0;
		}else
			this.precioBase = precio;
		
		if (peso<0) {
			this.peso = 0;
		}else
			this.peso = peso;
	}
	
	/**
	 * constructor que utiliza como parametro precio y peso utilizando por defecto
	 * los valores de consumo energetico
	 * @param precio valor de tipo Float. Define el Precio inicial del Electrodomestico
	 * si es menor que cero se asiganara cero como valor al atributo precioBase
	 * @param peso valor de tipo int, Define el pesoTotal del electrodomestico
	 * si es menor que cero se asiganara cero como valor al atributo peso
	 * @param color Valor de tipo String. Define el color del electrodomestico
	 * si el valor ingresado no corresponde a blanco, negro, rojo, azul y gris
	 * se utilizara el valor por defecto blanco
	 * @param consumo valor de tipo char Define el consumo energetico del electrodomestico
	 * si el valor ingresado no esta entre A y F se asignara valor por defecto F
	 */
	public Electrodomestico(float precio,String color,char consumo,int peso) {
		this(precio,peso);
		this.color=comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumo);
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}
	
	/**
	 * Metodo privado utilizado para comprobar si el parametro para consumo Energetico
	 * corresponde al standar del electrodomestico
	 * @param letra valor de tipo char utilizado para comprobar atributo consumoEnergetico
	 * @return retorna f si valor ingresado no es correcto, en el caso que sea correcto
	 * retorna el valor ingresado en minuscula
	 */
	private char comprobarConsumoEnergetico(char letra) {
		char retorno = CONSUMO_ENERGETICO_DEFECTO;
		String espejo = letra+"";
		espejo.toLowerCase();
		char[] biblioteca = {'a','b','c','d','e','f'};
		for (int i =0;i<biblioteca.length;i++) {
			if ( espejo.charAt(0)==biblioteca[i]) {
				retorno = biblioteca[i];	
			}
		}
		return retorno;
	}
	/**
	 * Metodo privado utilizado para comprobar si el parametro para color
	 * corresponde al standar del electrodomestico
	 * @param color valor tipo String utilizado para comprobar atributo color
	 *  del electrodomestico
	 * @return si parametro ingresado no corresponde a los valores anteriormente 
	 * definidos en constructor retorna valor por defecto blanco. Si es correcto
	 * retorna el valor ingresado en minusculas
	 */
	private String comprobarColor(String color) {
		String retorno = COLOR_DEFECTO;
		String[] biblioteca = {"blanco","negro","rojo","azul","gris"};
		for ( int i = 0; i < biblioteca.length;i++) {
			if ( color.toLowerCase().equals(biblioteca[i])) {
				retorno = biblioteca[i];
			}
		}
		return retorno;
	}
	/**
	 * Metodo utilizado para reajustar el valor del electrodomestico.
	 * El reajuste se realizara a partir de los atributos peso y consumo energetico
	 * @return retorna el precioBase + ajuste segun corresponda a los atributos del objeto
	 */
	public float precioFinal() {
		float precioRetorno=this.precioBase;
		
		if (this.peso<20) {
			precioRetorno+=10;
		}else if (this.peso<50 && this.peso>19) {
			precioRetorno+=50;
		}else if (this.peso<80 && this.peso>49) {
			precioRetorno+=80;
		}else
			precioRetorno+=100;
		
		if ( this.consumoEnergetico==('a')) {
			precioRetorno+=100;
		}else if (this.consumoEnergetico==('b')) {
			precioRetorno+=80;
		}else if (this.consumoEnergetico==('c')) {
			precioRetorno+=60;
		}else if (this.consumoEnergetico==('d')) {
			precioRetorno+=50;
		}else if (this.consumoEnergetico==('e')) {
			precioRetorno+=30;
		}else
			precioRetorno=+10;
		
		return precioRetorno;
	}
}

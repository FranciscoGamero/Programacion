package ejemplo_interfaces;

public interface IDepredador {

	/*A los metodos creados dentro de la interfaz no hace falta poner el abstracto ni el public a los metodos
	 * Porque por defectos son todos abstractos y publicos
	 * 
	 * Los atributos de las interfaces son finales, por lo que son constantes (es muy raro que haya uno)
	 * 
	 * Las interfaces pueden tener herencia*/
	
	void localizar (Animal presa); 
	
	void cazar (Animal presa);
}

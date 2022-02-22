package one.digitalInnovation.singleton;


/**
 * Singleton "preguiçoso".
 * @author guilherme
 *
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;

	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null)
			instancia = new SingletonLazy();
		
		return instancia;
	}
	
	

}
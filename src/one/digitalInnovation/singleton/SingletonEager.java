package one.digitalInnovation.singleton;

/**
 * Singleton "apressado".
 * @author guilherme
 *
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();

	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
	
	

}
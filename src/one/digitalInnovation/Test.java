package one.digitalInnovation;

import one.digitalInnovation.facade.Facade;
import one.digitalInnovation.singleton.SingletonEager;
import one.digitalInnovation.singleton.SingletonLazy;
import one.digitalInnovation.singleton.SingletonLazyHolder;
import one.digitalInnovation.strategy.Comportamento;
import one.digitalInnovation.strategy.ComportamentoAgressivo;
import one.digitalInnovation.strategy.ComportamentoDefensivo;
import one.digitalInnovation.strategy.ComportamentoNormal;
import one.digitalInnovation.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Testes relacionados ao Design Pattern Singleton:
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println (lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println (eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println (lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
				
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Guilherme", "38400088");
	}

}













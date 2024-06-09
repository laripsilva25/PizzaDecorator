package Decorator;
import java.util.HashMap;

public class PizzaPronta implements Pizza{
	HashMap<String, Integer> ingredientes;
	PizzaPronta(){}
	PizzaPronta(HashMap<String,Integer> ingredientes){
		this.ingredientes = ingredientes;
	}
	public int preco() {
		int valor =0;
		for(Integer i: ingredientes.values())
			valor += i;
		return valor;
	}
}

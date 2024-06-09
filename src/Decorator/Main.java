package Decorator;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Integer> ingredientes = new HashMap<>();
		ingredientes.put("Massa", 15);
		ingredientes.put("Mussarela", 7);
		ingredientes.put("Tomate", 5);
		ingredientes.put("Manjericão", 3);
		
		Pizza margerita = new PizzaPronta(ingredientes);
		Pizza superMargerita= new ExtraGrande(new BordaRecheada(new MassaIntegral(margerita)));
		
		System.out.println("Minha pizza Margerita custará R$ " + margerita.preco());
		System.out.println("Minha pizza Super Margerita custará R$ " + superMargerita.preco());
		
	}

}

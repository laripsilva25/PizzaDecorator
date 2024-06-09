package Decorator;

public class ExtraGrande extends PizzaDecorator{
	ExtraGrande(Pizza p){
		super(p);
	}
	public int preco() {
		return pizzaDecorada.preco() + 10;
	}
	
}

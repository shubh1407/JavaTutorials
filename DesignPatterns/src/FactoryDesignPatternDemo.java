class PizzaFactory{
	
	public Object orderPizza(String orderName) {
		
		switch (orderName) {
		case "vegPizza":
			return new VegPizza();
			
		case "onionPizza":
			return new OnionPizza();
			
		case "nonvegPizza":
			return new NonVegPizza();
			
		case "chickenPizza":
			return new ChickenPizza();
			
		default:
			System.out.println("order is invalid");
		}
		
		return null;
	}
}


class VegPizza{
	VegPizza(){
		
	}
}

class OnionPizza extends VegPizza{
	
}

class CheesePizza extends VegPizza{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am cheese pizza";
	}
}



class NonVegPizza{
	
}


class ChickenPizza extends NonVegPizza{
	
}

public class FactoryDesignPatternDemo {

	public static void main(String[] args) {
		if(new PizzaFactory().orderPizza("cheesePizza")!=null)
			System.out.println(new PizzaFactory().orderPizza("cheesePizza").toString());
		
	}
}

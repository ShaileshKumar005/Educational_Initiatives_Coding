package Educational_Initiatives_Coding.EX1.Structural_Patterns.CoffeeShop_DecaratorPattern;

public class SugarDecorator extends CoffeeDecorator {
    private int quantity; // Amount of sugar

    public SugarDecorator(Coffee decoratedCoffee, int quantity) {
        super(decoratedCoffee);
        this.quantity = quantity;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar (" + quantity + " tsp)";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + (quantity * 0.25); // Cost per tsp of sugar
    }
}


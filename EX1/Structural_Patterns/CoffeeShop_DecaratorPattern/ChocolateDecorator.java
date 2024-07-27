package Educational_Initiatives_Coding.EX1.Structural_Patterns.CoffeeShop_DecaratorPattern;

public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 1.50; // Additional cost for chocolate
    }
}
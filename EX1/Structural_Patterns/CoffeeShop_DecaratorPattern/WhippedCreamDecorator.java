package Educational_Initiatives_Coding.EX1.Structural_Patterns.CoffeeShop_DecaratorPattern;


    
public class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Whipped Cream";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 1.00; // Additional cost for whipped cream
    }
}

package Educational_Initiatives_Coding.EX1.Structural_Patterns.CoffeeShop_DecaratorPattern;

public class MilkDecorator extends CoffeeDecorator {
    private int milkQuantity;
    MilkDecorator coffee;
    public MilkDecorator(Coffee coffee, int milkQuantity) {
        super(coffee);
        this.milkQuantity = milkQuantity;
    }

    @Override
    public String getDescription() {
        if (coffee == null) {
            throw new NullPointerException("Coffee instance is null.");
        }
        return coffee.getDescription() + ", Milk (" + milkQuantity + " ml)";
    }

    @Override
    public double cost() {
        if (coffee == null) {
            throw new NullPointerException("Coffee instance is null.");
        }
        return coffee.cost() + 0.50 * milkQuantity;
    }
}

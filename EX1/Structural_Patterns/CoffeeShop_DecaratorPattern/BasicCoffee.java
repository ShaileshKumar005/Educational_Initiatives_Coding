package Educational_Initiatives_Coding.EX1.Structural_Patterns.CoffeeShop_DecaratorPattern;

public class BasicCoffee implements Coffee {
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double cost() {
        return 5.00;  // Base cost of coffee
    }
}

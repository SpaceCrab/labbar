package Product;

public class Pizza extends Food
{
    PizzaType pizzaType;
    public Pizza(PizzaType pizzaType)
    {
        this.pizzaType = pizzaType;
    }

    @Override
    public double calcPrice()
    {
        return 0;
    }
}

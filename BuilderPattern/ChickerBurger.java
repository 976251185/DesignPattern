package BuilderPattern;

public class ChickerBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicker Burger";
    }
}

package BuilderPattern;
/*
素食汉堡，继承字Burger类
包括price 和 name方法
 */

public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}

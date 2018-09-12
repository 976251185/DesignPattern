package BuilderPattern;
/*
冷饮抽象类，应用Item接口
打包方式为Bottle
 */

public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

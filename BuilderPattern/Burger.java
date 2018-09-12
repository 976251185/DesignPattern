package BuilderPattern;
/*
汉堡抽象类
打包方式为Wrapper
 */

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

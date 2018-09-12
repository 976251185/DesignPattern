package BuilderPattern;
/*
实现Packing接口的实体类
包装，固体食物
 */
public class Wrapper implements Packing{
    @Override
    public String pack() {
        return "Wrapper";
    }
}

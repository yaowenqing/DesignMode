package Decorator;

//具体的Decorator，在这里是牛奶调味品
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }
}

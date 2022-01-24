package Decorator;

//具体的Decorator，在这里是巧克力调味品
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3.0f); //巧克力价格
    }
}

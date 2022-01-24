package Decorator;

//抽取各个单品咖啡的共同特点，作为Drink和各个单品咖啡之间的缓冲类
public class Coffee extends Drink {

    @Override
    public float cost() {
        return getPrice();
    }
}

package Decorator;

public class Decorator extends Drink {

    private Drink obj; //obj是被修饰者

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return getPrice() + obj.cost(); //修饰者的价格加上被修饰者的价格
    }

    @Override
    public String getDes() {
        return des + " " + getPrice() + " && " + obj.getDes(); //修饰者的描述加上被修饰者的描述
    }
}

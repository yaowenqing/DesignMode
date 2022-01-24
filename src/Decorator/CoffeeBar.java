package Decorator;

//体现了装饰者模式良好的扩展性、利于改动和维护，即使加入新的饮品或者调味品也只需要添加新的类即可

public class CoffeeBar {
    public static void main(String[] args) {
        //装饰者模式下的订单：2份巧克力+1份牛奶的LongBlack
        //1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("装饰之前费用:" + order.cost());
        System.out.println("描述:" + order.getDes());
        //2.加入一份牛奶和两份巧克力
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Chocolate(order);

        System.out.println(order.getDes()+",最终价格:"+order.cost());

    }
}
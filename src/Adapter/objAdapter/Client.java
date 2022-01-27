package Adapter.objAdapter;

//对象适配器
//根据合成复用原则，使用关联关系（聚合）代替了继承，解决了类适配器必须继承src类的局限性问题
//基本思路和类的适配器相同，只是将Adapter类做修改，不是继承src类，而是持有src类的实例，来解决兼容性问题。

public class Client {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.charging(new VoltageAdapter2(new Voltage220V()));
    }
}

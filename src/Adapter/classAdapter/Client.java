package Adapter.classAdapter;

//类适配器
//Adapter类通过继承src类，实现dst接口，实现src->dst的适配
//以充电器为例，充电器本身相当于Adapter，220V交流电相当于src，需要通过适配器类转为5V直流电对手机进行充电

public class Client {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.charging(new VoltageAdapter());
    }
}

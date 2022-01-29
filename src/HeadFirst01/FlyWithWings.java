package HeadFirst01;

//一个具体的飞行行为类，实现飞行行为接口
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}

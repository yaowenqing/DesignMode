package HeadFirst01;

//针对接口编程，而不是针对实现编程。
//鸭子类不负责实现Flying和Quacking接口，而是编写一些行为类专门实现FlyBehavior和QuackBehavior
//某一种类的具体鸭子(MallardDuck)除了继承鸭子超类之外，还需要使用接口来表示具体行为
//鸭子的行为不是继承来的，而是和对应的行为接口组合得到的。（FlyBehavior和QuackBehavior）
//设计原则：少用继承，多用组合
//策略模式：定义一系列的算法，把它们一个个封装起来, 并且使它们可相互替换。

public class Test {
    public static void main(String[] args) {
        Duck d=new MallardDuck();
        d.performFly();
        d.performQuack();

        Duck model=new ModelDuck();
        model.performFly();
        //在运行时改变鸭子的行为，调用setter方法即可
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
    }
}

package Bridge;

// 具体样式的手机（比如折叠式）调用open方法时会找到父类Phone类的open，而父类的open会通过接口找到对应品牌的open
// Phone类在这里充当了桥的作用
public abstract class Phone {

    //把品牌组合进来
    private Brand brand;

    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open(){
        brand.open(); // 调用对应品牌的手机的open方法(即Brand接口具体的实现子类的实例)
    }

    protected void close(){
        brand.close(); // 调用对应品牌的手机的close方法
    }

    protected void call(){
        brand.call();
    }

}

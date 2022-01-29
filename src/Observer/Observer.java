package Observer;

public interface Observer {
    //所有观察者都要实现Observer接口中的update方法
    public void update(float temp, float humidity);
}

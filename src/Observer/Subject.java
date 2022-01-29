package Observer;

public interface Subject {
    //registerObserver和removeObserver都需要一个观察者作为参数，该观察者用来注册或者删除
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    //当状态发生变化时，调用该方法来通知所有的观察者
    public void notifyObservers();
}

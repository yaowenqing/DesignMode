package Adapter.classAdapter;

//适配器类,继承了src类，可以根据需求重写src类的方法，增强灵活性
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获取到220V电压
        int srcV = output220V();
        //不能直接用，需要降压
        int dstV = srcV / 44;//适配的过程
        return dstV;
    }
}

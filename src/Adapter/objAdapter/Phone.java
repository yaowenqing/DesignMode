package Adapter.objAdapter;

public class Phone {
    //充电
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V()==5){
            System.out.println("电压为5V，可以进行充电");
        }else {
            System.out.println("电压大于5V，不能充电");
        }
    }
}

package Bridge;

public class Client {
    public static void main(String[] args) {
        //获取折叠式手机（样式+品牌）
        FoldedPhone phone = new FoldedPhone(new Huawei());
        phone.open();
    }
}

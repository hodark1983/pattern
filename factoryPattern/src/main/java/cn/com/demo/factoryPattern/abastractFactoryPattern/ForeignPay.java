package cn.com.demo.factoryPattern.abastractFactoryPattern;

public class ForeignPay implements Ipay{
    @Override
    public void pay() {
        System.out.println("境外进行支付！");
    }
}

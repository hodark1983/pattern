package cn.com.demo.factoryPattern.abastractFactoryPattern;

public class AliPay implements Ipay{
    @Override
    public void pay() {
        System.out.println("支付宝支付！");
    }
}

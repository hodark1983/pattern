package cn.com.demo.factoryPattern.SimpleFactoryPattern;

public class UnionPay implements Ipay{
    @Override
    public void pay() {
        System.out.println("银联支付！");
    }
}

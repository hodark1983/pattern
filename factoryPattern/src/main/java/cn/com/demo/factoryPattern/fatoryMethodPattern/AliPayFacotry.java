package cn.com.demo.factoryPattern.fatoryMethodPattern;

public class AliPayFacotry implements IpayFactory{
    @Override
    public Ipay CreatePayment() {
        return new AliPay();
    }
}

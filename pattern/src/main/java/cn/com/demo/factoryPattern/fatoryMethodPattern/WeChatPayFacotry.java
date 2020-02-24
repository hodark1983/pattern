package cn.com.demo.factoryPattern.fatoryMethodPattern;

public class WeChatPayFacotry implements IpayFactory{
    @Override
    public Ipay CreatePayment() {
        return new WeChatPay();
    }
}

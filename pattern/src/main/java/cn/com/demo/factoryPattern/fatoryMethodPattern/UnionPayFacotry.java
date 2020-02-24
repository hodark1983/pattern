package cn.com.demo.factoryPattern.fatoryMethodPattern;

public class UnionPayFacotry implements IpayFactory{
    @Override
    public Ipay CreatePayment() {
        return new UnionPay();
    }
}

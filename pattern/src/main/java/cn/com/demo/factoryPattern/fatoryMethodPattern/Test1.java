package cn.com.demo.factoryPattern.fatoryMethodPattern;

public class Test1 {
    public static void main(String[] args) {
        IpayFactory factory = new AliPayFacotry();
        Ipay pay = factory.CreatePayment();
        pay.pay();
    }
}

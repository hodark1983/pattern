package cn.com.demo.factoryPattern.SimpleFactoryPattern;

public class Test {
    public static void main(String[] args) {
        PayFactory factory = new PayFactory();
        Ipay pay1 = factory.CreatPayment("ali");
        pay1.pay();

        Ipay pay2 = factory.CreatPayment("wechat");
        pay2.pay();

        Ipay pay3 = factory.CreatPayment("union");
        pay3.pay();

        Ipay pay4 = factory.CreatPayment(AliPay.class);
        pay4.pay();
    }
}

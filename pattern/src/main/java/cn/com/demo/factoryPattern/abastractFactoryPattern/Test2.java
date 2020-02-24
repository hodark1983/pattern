package cn.com.demo.factoryPattern.abastractFactoryPattern;

public class Test2 {

    public static void main(String[] args) {
        // 国内支付
        DomesticPaymentFactory factory = new DomesticPaymentFactory("ali");
        factory.createPay().pay();
        factory.createServiceFee().extraExpense();
        // 国外支付
        ForeignPaymentFactory foreignPaymentFactory = new ForeignPaymentFactory();
        foreignPaymentFactory.createPay().pay();
        foreignPaymentFactory.createServiceFee().extraExpense();
    }
}

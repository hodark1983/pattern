package cn.com.demo.factoryPattern.abastractFactoryPattern;

public class DomesticPaymentFee implements IServiceFee{
    @Override
    public void extraExpense() {
        System.out.println("国内不需要支付手续费！");
    }
}

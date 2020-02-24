package cn.com.demo.factoryPattern.abastractFactoryPattern;

public class ForeignPaymentFactory extends PaymentFactory{
    @Override
    protected Ipay createPay() {
        return new ForeignPay();
    }

    @Override
    protected IServiceFee createServiceFee() {
        return new ForeignFee();
    }
}

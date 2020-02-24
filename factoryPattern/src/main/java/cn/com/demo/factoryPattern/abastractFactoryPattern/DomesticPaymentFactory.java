package cn.com.demo.factoryPattern.abastractFactoryPattern;

public class DomesticPaymentFactory extends PaymentFactory {

    private String payName;

    public DomesticPaymentFactory(String payName) {
        this.payName = payName;
    }

    @Override
    protected Ipay createPay() {
        super.init();
        return (Ipay) new PayFactory().CreatPayment(this.payName);
    }

    @Override
    protected IServiceFee createServiceFee() {
        super.init();
        return new DomesticPaymentFee();
    }
}

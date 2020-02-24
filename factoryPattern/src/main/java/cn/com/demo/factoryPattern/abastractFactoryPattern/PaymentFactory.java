package cn.com.demo.factoryPattern.abastractFactoryPattern;

public abstract class PaymentFactory {

    public void init(){ System.out.println("初始化基础数据"); }

    protected abstract Ipay createPay();

    protected abstract IServiceFee createServiceFee();
}

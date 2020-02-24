package cn.com.demo.factoryPattern.abastractFactoryPattern;

public class ForeignFee implements IServiceFee{
    @Override
    public void extraExpense() {
        System.out.println("支付境外手续费！");
    }
}

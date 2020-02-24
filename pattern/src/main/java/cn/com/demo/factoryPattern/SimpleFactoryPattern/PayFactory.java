package cn.com.demo.factoryPattern.SimpleFactoryPattern;

public class PayFactory {

    public Ipay CreatPayment(String payName) {
        if ("ali".equals(payName)) {
            return new AliPay();
        } else if ("wechat".equals(payName)){
            return new WeChatPay();
        } else if ("union".equals(payName)) {
            return new UnionPay();
        } else {
            return null;
        }
    }

    public Ipay CreatPayment(Class<? extends Ipay> clazz) {
        if (null != clazz) {
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

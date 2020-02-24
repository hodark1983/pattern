package cn.com.demo.factoryPattern.fatoryMethodPattern;

public class WeChatPay implements Ipay {
    @Override
    public void pay() {
        System.out.println("微信支付！");
    }
}

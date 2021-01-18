package org.example.strategy;

public class Weekend implements Strategy {
    @Override
    public String doSomeThing(Integer time) {
        System.out.println("吃饭");
        System.out.println("睡觉");
        System.out.println("打豆豆");
        return "";
    }
}

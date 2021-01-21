package org.example.strategy;

public class WorkingDay implements Strategy {

    /**
     * 策略实现方式
     * @param time
     * @return
     */
    @Override
    public String doSomeThing(Integer time) {
        System.out.println("起床");
        System.out.println("去上班");
        System.out.println("开始上午的工作");
        System.out.println("吃午饭");
        System.out.println("开始下午的工作");
        System.out.println("下班");
        return "去工作";
    }
}

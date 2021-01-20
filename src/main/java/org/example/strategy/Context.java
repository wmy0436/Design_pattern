package org.example.strategy;

/**
 *策略模式
 *
 * 接口定义抽象方法
 * 定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
 *
 * 优点： 1、算法可以自由切换。 2、避免使用多重条件判断。 3、扩展性良好。
 *
 * 缺点： 1、策略类会增多。 2、所有策略类都需要对外暴露。
 *
 *
 * 使用场景：
 * 1、如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为。
 * 2、一个系统需要动态地在几种算法中选择一种。
 * 3、如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用多重的条件选择语句来实现。
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public String doSomeThing(Integer time){
        return this.strategy.doSomeThing(time);
    }

    public Context() {
        this.strategy = strategy;
    }
}

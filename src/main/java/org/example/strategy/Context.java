package org.example.strategy;

/**
 *
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

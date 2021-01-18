package org.example.method;

import org.example.Car;

/**
 * 模板方法接口
 * 具有统一的步骤或过程
 * 具有不同的操作细节
 * 存在多个具有操作步骤的应用场景，但某些具体的操作细节却各有不同
 */
public abstract class TempledMethod {

    //制作头部
    public abstract void makeHead(Car car);

    //制作身体
    public abstract void makeBood(Car car);

    //制作尾部
    public abstract void makeTail(Car car);

    /**
     * 模板方法 固定流程
     * 定义算法的流程
     *
     * @param car
     */
    public void madke(Car car) {
        this.makeHead(car);
        this.makeBood(car);
        this.makeTail(car);
    }

}

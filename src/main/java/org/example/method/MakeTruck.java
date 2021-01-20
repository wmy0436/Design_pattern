package org.example.method;

import org.example.Car;

public class MakeTruck extends TempledMethod{

    @Override
    public void makeHead(Car car) {
        System.out.println("制作卡车的车头");
    }

    @Override
    public void makeBood(Car car) {
        System.out.println("安装卡车轮子");
    }

    @Override
    public void makeTail(Car car) {
        System.out.println("安装车尾");
    }
}

package org.example.method;

import org.example.Car;

public class MakeCar extends TempledMethod  {


    @Override
    public void makeHead(Car car) {
        System.out.println("组装了"+car.getColour()+"车头");
    }

    @Override
    public void makeBood(Car car) {
        System.out.println("安装了"+car.getWheel()+"个车轮");
    }

    @Override
    public void makeTail(Car car) {
        System.out.println("安装了"+car.getNum()+"片尾翼");
    }
}

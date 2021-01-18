package org.example;

import org.example.method.MakeCar;
import org.example.strategy.Context;
import org.example.strategy.Weekend;
import org.example.strategy.WorkingDay;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //模板模式
        MakeCar makeCar = new MakeCar();
        Car car = new Car();
        car.setNum(2);
        car.setWheel("球型");
        car.setColour("红色");
//        makeCar.madke(car);



        //策略模式
        Integer  week= 2;
        Context context = new Context();
        switch(week){
            case 1 :
                context = new Context(new Weekend());
                break; //可选
            case 2 :
                //语句
                context = new Context(new WorkingDay());
                break; //可选
            //你可以有任意数量的case语句
            default : //可选
                //语句
        }
        context.doSomeThing(week);



    }
}

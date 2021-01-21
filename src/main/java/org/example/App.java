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
        Integer  week= 1;
        Context context = new Context();
        switch(week){
            case 1 :
                context = new Context(new Weekend());
                break;
            case 2 :
                context = new Context(new WorkingDay());
                break;
        }
        context.doSomeThing(week);



    }
}

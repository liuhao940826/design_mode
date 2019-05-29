package factory;

import factory.factory.BenzCarFactory;
import factory.factory.BmwCarFactory;
import factory.model.Car;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 5:58 PM 2019/5/29
 */
public class AbstractFactoryDemo {


    public static void main(String[] args) {

        BenzCarFactory benzCarFactory = new BenzCarFactory();

        Car benzCar = benzCarFactory.getCar();
        benzCar.run();

        BmwCarFactory bmwCarFactory = new BmwCarFactory();

        Car bmwCar = bmwCarFactory.getCar();
        bmwCar.run();


    }
}

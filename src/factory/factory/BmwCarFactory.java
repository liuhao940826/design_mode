package factory.factory;

import factory.model.Car;
import factory.model.BmwCar;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 5:57 PM 2019/5/29
 */
public class BmwCarFactory extends  AbstractFactory {

    @Override
    public Car getCar() {
        return  new BmwCar();
    }
}

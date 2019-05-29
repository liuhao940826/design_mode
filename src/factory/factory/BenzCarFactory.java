package factory.factory;

import factory.model.BenzCar;
import factory.model.Car;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 5:57 PM 2019/5/29
 */
public class BenzCarFactory extends  AbstractFactory {

    @Override
    public Car getCar() {
        return  new BenzCar();
    }
}

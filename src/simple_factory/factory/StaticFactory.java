package simple_factory.factory;

import simple_factory.product.Cat;
import simple_factory.product.Dog;
/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 4:35 PM 2019/5/29
 */
public class StaticFactory {

	public static Dog createDog(){
		return new Dog();
	}
	
	public static Cat createCat(){
		return new Cat();
	}
}

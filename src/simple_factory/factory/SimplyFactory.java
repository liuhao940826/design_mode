package simple_factory.factory;

import simple_factory.product.Cat;
import simple_factory.product.Dog;


/**
 * @Author: liuhao
 * @Description:简单工厂，也称为上帝工厂
 * @Date: Create in 4:35 PM 2019/5/29
 */
public class SimplyFactory {


	/**
	 *  简单工厂设计模式（负担太重、不符合开闭原则）
	 * @param name
	 * @return
	 */
	public static Object createObject(String name) {
		
		if ("cat".equals(name)) {
			return new Cat();
		} else if ("dog".equals(name)) {
			return new Dog();
		} else if ("cow".equals(name)) {
			return new Dog();
		} else {
			return null;
		}
	}
}

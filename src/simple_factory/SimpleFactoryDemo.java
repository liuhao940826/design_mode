package simple_factory;

import simple_factory.factory.SimplyFactory;
import simple_factory.factory.StaticFactory;
import simple_factory.product.Cat;
import simple_factory.product.Dog;


/**
 * @Author: liuhao
 * @Description: 简单工厂
 * @Date: Create in 4:35 PM 2019/5/29
 */
public class SimpleFactoryDemo {

	public static void main(String[] args) {
		//我想买只猫
		Cat cat = new Cat();
		cat.eat();
		//我想要只狗
		Dog dog = new Dog();
		dog.eat();
		
		System.out.println("=========");
		
		Cat cat2 = (Cat) SimplyFactory.createObject("cat");
		Cat cat3 = StaticFactory.createCat();
		cat2.eat();
		cat3.eat();
		
		Dog dog2 = (Dog) SimplyFactory.createObject("dog");
		Dog dog3 = StaticFactory.createDog();
		dog2.eat();
		dog3.eat();
	}

}

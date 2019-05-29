package abstract_factory;

import abstract_factory.abstract_factory.AbstractFactory;
import abstract_factory.abstract_factory.HuaWeiFactory;
import abstract_factory.abstract_factory.XiaoMiFactory;
import abstract_factory.model.cpu.Cpu;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 8:58 PM 2019/5/29
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        AbstractFactory factory = new HuaWeiFactory();

        factory.createCpu().calculate();
        factory.createDisk().storage();

        System.out.println("==========================");
        factory=new XiaoMiFactory();

        factory.createCpu().calculate();
        factory.createDisk().storage();

    }
}

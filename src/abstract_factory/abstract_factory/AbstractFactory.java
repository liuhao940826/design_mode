package abstract_factory.abstract_factory;

import abstract_factory.model.cpu.Cpu;
import abstract_factory.model.disk.Disk;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 8:53 PM 2019/5/29
 */
public abstract class AbstractFactory {

    abstract Cpu createCpu();

    abstract Disk createDisk();

}

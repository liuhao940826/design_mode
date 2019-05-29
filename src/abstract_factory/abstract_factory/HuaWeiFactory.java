package abstract_factory.abstract_factory;

import abstract_factory.model.cpu.Cpu;
import abstract_factory.model.cpu.HuaWeiCpu;
import abstract_factory.model.disk.Disk;
import abstract_factory.model.disk.HuaWeiDisk;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 8:54 PM 2019/5/29
 */
public class HuaWeiFactory extends AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new HuaWeiCpu();
    }

    @Override
    public Disk createDisk() {
        return new HuaWeiDisk();
    }
}

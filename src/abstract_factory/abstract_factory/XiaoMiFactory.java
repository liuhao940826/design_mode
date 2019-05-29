package abstract_factory.abstract_factory;

import abstract_factory.model.cpu.Cpu;
import abstract_factory.model.cpu.XiaoMiCpu;
import abstract_factory.model.disk.Disk;
import abstract_factory.model.disk.XiaoMiDisk;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 8:54 PM 2019/5/29
 */
public class XiaoMiFactory extends AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new XiaoMiCpu();
    }

    @Override
    public Disk createDisk() {
        return new XiaoMiDisk();
    }
}

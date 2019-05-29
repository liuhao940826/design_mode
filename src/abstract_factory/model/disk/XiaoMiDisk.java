package abstract_factory.model.disk;

import abstract_factory.model.cpu.Cpu;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 8:49 PM 2019/5/29
 */
public class XiaoMiDisk extends  Disk {

    @Override
    public void storage() {
        System.out.println("小米  disk.......");
    }
}

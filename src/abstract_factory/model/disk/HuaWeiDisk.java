package abstract_factory.model.disk;

import abstract_factory.model.cpu.Cpu;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 8:48 PM 2019/5/29
 */
public class HuaWeiDisk extends Disk {

    @Override
    void storage() {
        System.out.println("华为  disk........");
    }
}

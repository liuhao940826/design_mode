package single;

/**
 * @Author: liuhao
 * @Description: 饿汉式
 * @Date: Create in 10:04 PM 2019/5/29
 */
public class Computer {

    private  Computer() {
    }

    public  Computer getInstrace(){
        return new Computer();
    }

    public void run(){
        System.out.println("电脑跑起来了.......");
    }
}

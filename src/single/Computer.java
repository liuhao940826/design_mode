package single;

/**
 * @Author: liuhao
 * @Description: 饿汉式
 * @Date: Create in 10:04 PM 2019/5/29
 */
public class Computer {

    private static Computer computer = new Computer();


    private  Computer() {
    }

    public  Computer getInstrace(){
        return computer;
    }

    public void run(){
        System.out.println("电脑跑起来了.......");
    }
}

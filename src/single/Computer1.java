package single;

/**
 * @Author: liuhao
 * @Description: 饿汉式
 * @Date: Create in 10:04 PM 2019/5/29
 */
public class  Computer1 {

    private static Computer1 computer =null;

    private Computer1() {
    }

    public Computer1 getInstrace(){
        //双重检测机制
        if(computer==null){
            //A 线程卡在这里  B线程进去了 然后B执行完了 A进去了 里面还有判断 可以解决多例
            synchronized (Computer1.class){

                if(computer==null){

                    computer= new Computer1();
                }

            }

        }

        return computer;
    }

    public void run(){
        System.out.println("电脑跑起来了.......");
    }
}

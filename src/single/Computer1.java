package single;

/**
 * @Author: liuhao
 * @Description:
 * 在Java指令中创建对象和赋值操作是分开进行的，也就是说instance = new Singleton();语句是分两步执行的。
 *    但是JVM并不保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton实例分配空间，然后直接赋值给instance成员，然后再去初始化这个Singleton实例。
 *    这样就可能出错了，我们以A、B两个线程为例：
 *
 *   		a>A、B线程同时进入了第一个if判断
 *
 *   		b>A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();
 *
 *   		c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。
 *
 *   		d>B进入synchronized块，由于instance此时不是null，因此它马上离开了synchronized块并将结果返回给调用该方法的程序。
 *
 *   		e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。
 *
 *   	所以程序还是有可能发生错误，其实程序在运行过程是很复杂的，从这点我们就可以看出，尤其是在写多线程环境下的程序更有难度，有挑战性。
 * @Date: Create in 10:04 PM 2019/5/29
 */
public class  Computer1 {

    private static Computer1 computer =null;

    private Computer1() {
    }

    /**
     * 这个版本会有一点点问题见上面的解释
     * @return
     */
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

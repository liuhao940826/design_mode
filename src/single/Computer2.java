package single;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 10:36 PM 2019/5/29
 */
public class Computer2 {


    /**
     * 此处使用一个内部类来维护单例 JVM在类加载的时候，是互斥的，所以可以由此保证线程安全问题
     */
    private static class SingletonFactory {

        private static Computer2 computer = new Computer2();
    }


    public static Computer2 getSingletonInstance() {

        return SingletonFactory.computer;

    }
}

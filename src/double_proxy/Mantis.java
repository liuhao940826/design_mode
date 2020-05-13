package double_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @PACKAGE_NAME: double_proxy
 * @NAME: Mantis 螳螂
 * @USER: liuhao
 * @DATE: 2020-05-13 10:11
 * @WEEK: Wednesday
 * @PROJECT_NAME: design_mode
 **/
public class Mantis implements InvocationHandler {

    /**
     * 被代理对象
     */
    private Object target;

    /**
     * 代理对象的主要业务逻辑(螳螂的主要业务逻辑就是代理)
     * @param proxy 代理监听对象
     * @param method 被监听的方法
     * @param args   被监听方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        minorFunction();

        Object invoke = method.invoke(target, args);

        return invoke;
    }


    /**
     * 次要方法
     */
    private void minorFunction(){
        System.out.println("Mantis plus.........s");
    }


    /**
     * 构造函数
     * @param target
     */
    public Mantis(Object target) {
        this.target = target;
    }

    /**
     * 无参构造
     */
    public Mantis() {
    }

}

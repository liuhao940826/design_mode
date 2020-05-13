package double_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @PACKAGE_NAME: double_proxy
 * @NAME: Bird 黄雀(鸟)
 * @USER: liuhao
 * @DATE: 2020-05-13 11:03
 * @WEEK: Wednesday
 * @PROJECT_NAME: design_mode
 **/
public class Bird implements InvocationHandler {

    /**
     * 被代理对象(多级代理中的螳螂)
     */
    private Object  target;

    /**
     * 代理对象的主要业务逻辑(螳螂的主要业务逻辑就是代理) 申请的代理对象会执行的方法
     * @param proxy 代理监听对象
     * @param method 被监听的方法
     * @param args   被监听方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object invoke = method.invoke(target, args);

        //次要业务执行
        minorFunction();

        return invoke;
    }


    /**
     * 像JVM 申请代理对象
     * @param classFile
     * @return
     */
    public Object newInstance(Class classFile){

        AbstractService o = (AbstractService)Proxy.newProxyInstance(classFile.getClassLoader(), classFile.getInterfaces(), this);

        return o;
    }

    /**
     * 次要方法
     */
    private void minorFunction(){
        System.out.println("Bird plus.........s");
    }

    public Bird(Object target) {
        this.target = target;
    }

    public Bird() {
    }
}

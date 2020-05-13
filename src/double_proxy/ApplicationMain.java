package double_proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @PACKAGE_NAME: double_proxy
 * @NAME: ApplicationMain
 * @USER: liuhao
 * @DATE: 2020-05-13 11:06
 * @WEEK: Wednesday
 * @PROJECT_NAME: design_mode
 **/
public class ApplicationMain {

    public static void main(String[] args) {

        AbstractService abstractService = newInstance(Cicada.class);
        abstractService.eat();

    }


    public static AbstractService newInstance(Class classFile){

        //创建蝉
        Cicada cicada = new Cicada();

        //创建螳螂一级代理对象
        InvocationHandler mantis = new Mantis(cicada);
        //想jvm申请代理对象
        AbstractService proxy1 = (AbstractService) Proxy.newProxyInstance(classFile.getClassLoader(), classFile.getInterfaces(), mantis);

        //创建黄雀二级代理对象
        InvocationHandler bird = new Bird(proxy1);

        //想jvm申请代理对象
        AbstractService proxy2 = (AbstractService) Proxy.newProxyInstance(classFile.getClassLoader(), classFile.getInterfaces(), bird);

        return proxy2;
    }



}

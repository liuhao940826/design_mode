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

        AbstractService abstractService = BeanFatory.newInstance(Cicada.class);
        abstractService.eat();

    }


}

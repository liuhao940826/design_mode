package double_proxy;

/**
 * @PACKAGE_NAME: double_proxy
 * @NAME: Cicada 昆虫(蝉)
 * @USER: liuhao
 * @DATE: 2020-05-13 10:29
 * @WEEK: Wednesday
 * @PROJECT_NAME: design_mode
 **/
public class Cicada implements AbstractService {

    @Override
    public void eat() {
        System.out.println("昆虫觅食........");
    }
}

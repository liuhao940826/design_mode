package templete;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 12:34 AM 2019/6/19
 */
public abstract class Company {

    /**
     * 招聘
     */
    protected  abstract void recruitment();

    /**
     * 入职
     */
    protected  abstract void induction();

    /**
     * 流程
     */
    public final  void process(){
        recruitment();
        induction();
    }

}

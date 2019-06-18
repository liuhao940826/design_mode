package templete;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 12:40 AM 2019/6/19
 */
public class TestProcess {


    public static void main(String[] args) {

        Company company1 = new BaiduCompany();

        Company company2 = new AlibabaCompany();

        company1.process();
        company2.process();

    }
}

package decorate;


/**
 * @Author: liuhao
 * @Description: 装饰模式
 * @Date: Create in 4:35 PM 2019/5/29
 */
public class DesignPatternDemo {

	public static void main(String[] args) {
		Phone phone = new IPhone();
		phone.call();
		
		System.out.println("===========");
		
		//Phone phone2 = new PhoneDecorate(new IPhone());
		Phone phone2 = new IPhoneDecorate(phone);
		phone2.call();
		
		
		
	}

}
